package Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEmail {
    public static void main(String[] args) {
        String userInfo = "test 2667843 (test_email@griddynamics.com) test 67483 some string";
        Pattern pattern = Pattern.compile(".*?\\((.*)\\).*");
        Matcher matcher = pattern.matcher(userInfo);

        System.out.println(matcher.find() + "\n" + matcher.group(1));

    }
}
