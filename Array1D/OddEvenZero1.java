import java.util.Scanner;
public class OddEvenZero1 {
    static Scanner scan = new Scanner(System.in);
    static void odd(int n,int x[]){
        for(int i=0;i<n;i++){
            if(x[i] % 2 != 0 || x[i] == 0){
                System.out.print(x[i] + " ");
            }
        }
        System.out.println();
    }
    static void even(int n,int x[]){
        for(int i=0;i<n;i++){
            if(x[i] % 2 == 0 || x[i] == 0){
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
        odd(n, x);
        even(n, x);
    }
}
