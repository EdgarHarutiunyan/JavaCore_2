package Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrderCount {
    public static void main(String[] args) {
        String orders = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: [Integration_test_Contract], total number of orders successfully processed: [2]";
        Pattern pattern = Pattern.compile("\\[(.)\\]");
        Matcher matcher = pattern.matcher(orders);

        System.out.println(matcher.find() + "\n" + matcher.group(1));
    }
}
