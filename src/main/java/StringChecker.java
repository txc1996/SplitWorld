import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringChecker {

    public static boolean isNotVietnameseString(String string) {
       return string.matches("[a-z ]+");
    }
}
