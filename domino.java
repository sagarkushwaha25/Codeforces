import java.util.Scanner;

class domino{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans = n*m/2;
        System.out.println(ans);
        sc.close();
    }
}