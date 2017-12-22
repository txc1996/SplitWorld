import org.junit.Test;

public class TestStringChecker {

    @Test
    public void testStringCheckerVietnamese() {
        StringChecker stringChecker = new StringChecker();


        assert false == stringChecker.isNotVietnameseString("trần xuân cường");
    }

    @Test
    public void testStringCheckerEnglish() {
        StringChecker stringChecker = new StringChecker();


        assert true == stringChecker.isNotVietnameseString("tran xuan cuong");
    }
}
