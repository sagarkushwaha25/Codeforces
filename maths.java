import java.util.Arrays;
import java.util.Scanner;

public class maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        String s = scanner.nextLine();
    
        s = s.replace("+", "");
    
        char[] charArray = s.toCharArray();
    
        Arrays.sort(charArray);
    
        for (i = 0; i < charArray.length - 1; i++) {
            System.out.print(charArray[i] + "+");
        }
        System.out.print(charArray[i]);
        scanner.close();
    }
}
