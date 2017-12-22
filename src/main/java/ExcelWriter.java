import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class ExcelWriter {

    public void writeToFile(List<String> datas, String filePath) throws Exception{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("outPutData");

        int indexRow1 = 0;
        int indexRow2 = 0;
        for (String data: datas) {
            if (StringChecker.isNotVietnameseString(data)) {
                XSSFRow row = sheet.createRow(indexRow1);
                XSSFCell cell1 = row.createCell(0);
                cell1.setCellValue(data);
                indexRow1++;
            } else {
                XSSFRow row = sheet.createRow(indexRow2);
                XSSFCell cell2 = row.createCell(1);
                cell2.setCellValue(data);
                indexRow2++;
            }
        }


        File f = new File("./"+filePath);

        if(!f.exists()){
            File parent_directory = f.getParentFile();
            if (null != parent_directory){

                parent_directory.mkdirs();

            }
            f.createNewFile();
        }
        FileOutputStream outputStream = new FileOutputStream(f);
        workbook.write(outputStream);
        workbook.close();
        System.out.println("done");

    }
}
