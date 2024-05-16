import java.util.Scanner;
public class Partition1 {
    static Scanner scan = new Scanner(System.in);
    static void more(int n,int x[]){
        int target = n/2;
        for(int i=0;i<n;i++){
            if(x[i]>x[target]){
                System.out.print(x[i] + " ");
            }
        }
        System.out.println();
    }
    static void less(int n,int x[]){
        int target = n/2;
        for(int i=0;i<n;i++){
            if(x[i]<=x[target]){
                System.out.print(x[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        less(n, x);
        more(n, x);
    }
}
