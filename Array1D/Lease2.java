import java.util.Scanner;
public class Lease2 {
    static Scanner scan = new Scanner(System.in);
    static void display(int x[],int year,int n,int q){
        int count = 0;
        for(int i=0;i<n;i++){
            if(x[i] + year <= q){
                System.out.print(i + 1 + " ");
                count++;
            }
        }
        if(count == 0){
            System.out.print("full");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        int year = scan.nextInt();
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int q = scan.nextInt();
            display(x, year, n, q);
        }
    }
}
