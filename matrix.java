import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=5,n=5;
        int[][] a = new int[5][5];
        int temp=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if(a[i][j]==1){
                    if(i<2){
                        temp = 2-i;
                    }else if(i>2){
                        temp = i-2;
                    }else {
                        temp =temp+0;
                    }

                    if(j<2){
                        temp = temp + 2-j;
                    }else if(j>2){
                        temp = temp + j-2;
                    }else {
                        temp =temp+0;
                    }
            }
            }
        }
        System.out.println(temp);
        sc.close();
    }
}
