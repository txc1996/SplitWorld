import org.junit.Test;

import java.util.List;

public class TestExcelReader {

    @Test
    public void testExcelReader() {
        ExcelReader excelReader = new ExcelReader();

        try {
            List<String> datas = excelReader.readFromFile("datas.xlsx");

            assert !datas.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
