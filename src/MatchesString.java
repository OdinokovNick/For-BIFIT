import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.countMatches;

public class MatchesString {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str2 = input.next();

        Scanner sc = new Scanner(new File("c:\\some_text.txt "));
        int count = 0;
        while (sc.hasNext()) {
            String str1 = sc.next();
            count += countMatches(str1, str2);
        }
        System.out.println("Count of string matches = " + count);
    }
}
