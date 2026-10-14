/*
 * Practical No : 08
 * Topic        : Data-Driven Testing Using Excel Integration
 * File name    : PassStudents.java
 */
package exceldatareading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/* Step 2: create a new file / sheet containing ONLY the pass students */
public class PassStudents {

    public static void main(String[] args) throws Exception {

        // Input file created in Step 1
        FileInputStream fi = new FileInputStream("C:\\Excel\\student_records1.xls");

        // Read workbook
        Workbook wb = Workbook.getWorkbook(fi);

        // Get first sheet
        Sheet s = wb.getSheet(0);

        // Create output file
        FileOutputStream fo = new FileOutputStream("C:\\Excel\\passstudents.xls");

        // Create writable workbook
        WritableWorkbook wwb = Workbook.createWorkbook(fo);

        // Create new sheet
        WritableSheet ws = wwb.createSheet("Pass Students", 0);

        // Copy heading
        for (int j = 0; j < s.getColumns(); j++) {
            String heading = s.getCell(j, 0).getContents();
            ws.addCell(new Label(j, 0, heading));
        }

        // New row number
        int k = 1;

        // Check each student
        for (int i = 1; i < s.getRows(); i++) {

            String result = s.getCell(s.getColumns() - 1, i).getContents();

            if (result.equalsIgnoreCase("pass")) {

                // Copy complete student record
                for (int j = 0; j < s.getColumns(); j++) {
                    String data = s.getCell(j, i).getContents();
                    ws.addCell(new Label(j, k, data));
                }
                k++;
            }
        }

        // Save file
        wwb.write();
        wwb.close();

        wb.close();
        fi.close();
        fo.close();

        System.out.println("Pass Students File Created Successfully...");
    }
}
