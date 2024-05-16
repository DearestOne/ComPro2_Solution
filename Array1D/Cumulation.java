import java.util.Scanner;
public class Cumulation {
    static Scanner scan = new Scanner(System.in);
    static void display(int n,int x[]){
        for(int i=1;i<n;i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<k;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            for(int j=a;j<=b;j++){
                x[j] += c;
            }
            display(n, x);
        }
    }
}
