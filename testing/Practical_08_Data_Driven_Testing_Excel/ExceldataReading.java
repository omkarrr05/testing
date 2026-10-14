/*
 * Practical No : 08
 * Topic        : Data-Driven Testing Using Excel Integration
 * File name    : ExceldataReading.java
 */
package exceldatareading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/* Step 1: copy student_records.xls to a new file and add a Result column (marks < 40 = fail, else pass) */
public class ExceldataReading {

    public static void main(String[] args) throws Exception {

        // Original Excel file
        FileInputStream fi = new FileInputStream("C:\\Excel\\student_records.xls");

        // Read workbook
        Workbook wb = Workbook.getWorkbook(fi);

        // Read first sheet
        Sheet s = wb.getSheet(0);

        // Create new Excel file
        FileOutputStream fo = new FileOutputStream("C:\\Excel\\student_records1.xls");

        WritableWorkbook wwb = Workbook.createWorkbook(fo);

        // Create new sheet
        WritableSheet ws = wwb.createSheet("Result", 0);

        // Result column
        int resultColumn = s.getColumns();

        // Copy original data
        for (int i = 0; i < s.getRows(); i++) {
            for (int j = 0; j < s.getColumns(); j++) {
                String data = s.getCell(j, i).getContents();
                ws.addCell(new Label(j, i, data));
            }
        }

        // Add Result heading
        ws.addCell(new Label(resultColumn, 0, "Result"));

        // Check students
        for (int i = 1; i < s.getRows(); i++) {

            boolean pass = true;

            // Marks columns
            for (int j = 2; j < s.getColumns(); j++) {

                String value = s.getCell(j, i).getContents();

                // Skip Total column if required
                if (j == s.getColumns() - 1) {
                    continue;
                }

                int marks = Integer.parseInt(value);

                if (marks < 40) {
                    pass = false;
                    break;
                }
            }

            if (pass) {
                ws.addCell(new Label(resultColumn, i, "pass"));
            } else {
                ws.addCell(new Label(resultColumn, i, "fail"));
            }
        }

        // Save file
        wwb.write();
        wwb.close();

        wb.close();
        fi.close();
        fo.close();

        System.out.println("Record update Successful...");
    }
}
