/*
 * Practical No : 08
 * Topic        : Data-Driven Testing Using Excel Integration
 * File name    : StudentPercentage.java
 */
package exceldatareading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/* Step 3: create a new file / sheet, copy all records and calculate Total and Percentage */
public class StudentPercentage {

    public static void main(String[] args) throws Exception {

        // Input file
        FileInputStream fi = new FileInputStream("C:\\Excel\\student_records1.xls");

        // Read workbook
        Workbook wb = Workbook.getWorkbook(fi);

        // Get first sheet
        Sheet s = wb.getSheet(0);

        // Create output file
        FileOutputStream fo = new FileOutputStream("C:\\Excel\\studentpercentage.xls");

        // Create writable workbook
        WritableWorkbook wwb = Workbook.createWorkbook(fo);

        // Create new sheet
        WritableSheet ws = wwb.createSheet("Percentage", 0);

        // Copy original data
        for (int i = 0; i < s.getRows(); i++) {
            for (int j = 0; j < s.getColumns(); j++) {
                String data = s.getCell(j, i).getContents();
                ws.addCell(new Label(j, i, data));
            }
        }

        // Total and Percentage columns
        int totalColumn = s.getColumns();
        int percentageColumn = s.getColumns() + 1;

        // Add headings
        ws.addCell(new Label(totalColumn, 0, "Total"));
        ws.addCell(new Label(percentageColumn, 0, "Percentage"));

        // Calculate Total and Percentage
        for (int i = 1; i < s.getRows(); i++) {

            int total = 0;

            // Marks are in columns 2, 3 and 4
            for (int j = 2; j < 5; j++) {
                String value = s.getCell(j, i).getContents();
                int marks = Integer.parseInt(value);
                total = total + marks;
            }

            // Write Total
            ws.addCell(new Number(totalColumn, i, total));

            // Calculate Percentage
            double percentage = (double) total / 3;

            ws.addCell(new Number(percentageColumn, i, percentage));
        }

        // Save file
        wwb.write();
        wwb.close();

        // Close files
        wb.close();
        fi.close();
        fo.close();

        System.out.println("Student Percentage File Created Successfully...");
    }
}
