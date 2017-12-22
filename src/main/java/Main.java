import java.util.List;

public class Main {

    public static void main (String[] args) {
        ExcelReader excelReader = new ExcelReader();
        ExcelWriter excelWriter = new ExcelWriter();
        List<String> datas;
        try {
            datas = excelReader.readFromFile("datas.xlsx");
            excelWriter.writeToFile(datas, "outputData.xlsx");
        } catch (Exception e) {
            System.out.println("there is something wrong in excelReader or excelWriter");
        }
    }
}
