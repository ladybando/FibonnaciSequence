import java.util.Arrays;
import java.util.List;

public class Messy {
    public static void main(String[] args) {
            /*Please comment out this line and
            this line as well with a hotkey that does multi - line commenting*/
        List<String> numberWords = Arrays.asList("six", "seven", "eight", "nine");

        System.out.println("one");
        System.out.println("two");
        System.out.println("three");
        System.out.println("four");
        System.out.println("five");

        for (String numberWord : numberWords) {
            System.out.println(numberWord);
        }
    }
}

