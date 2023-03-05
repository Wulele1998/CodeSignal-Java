import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumUpNumbers {
    int solution(String inputString) {
        Pattern p = Pattern.compile("\\d+");
        Matcher matcher = p.matcher(inputString);
        int sum = 0;

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        return sum;
    }
}
