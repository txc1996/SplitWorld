import org.junit.Test;

import java.util.List;

public class TestExcelWriter {

    @Test
    public void testExcelWriter() {
        try {
            ExcelReader excelReader = new ExcelReader();
            List<String> datas = excelReader.readFromFile("datas.xlsx");
            ExcelWriter excelWriter = new ExcelWriter();
            excelWriter.writeToFile(datas,"outputData.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
