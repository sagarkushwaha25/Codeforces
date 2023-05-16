import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total=0;
        
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int sum = a+b+c;
                if(sum >=2) {
                    total++;
                }
            }
            
            System.out.println(total);
        
        sc.close();
    }
}
