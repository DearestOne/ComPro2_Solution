import java.util.Scanner;
public class Lease1 {
    static Scanner scan = new Scanner(System.in);
    static void Display(int n,int x[],int year){
        for(int i=0;i<n;i++){
            System.out.print(year + x[i] - 1 + " ");
        }
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        int year = scan.nextInt();
        Display(n, x, year);
    }
}
