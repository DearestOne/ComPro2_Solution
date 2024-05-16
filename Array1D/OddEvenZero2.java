import java.util.Scanner;
public class OddEvenZero2 {
    static Scanner scan = new Scanner(System.in);
    static void odd(int n,int x[]){
        int max = 0;
        for(int i=0;i<n;i++){
            if(x[i] % 2 != 0 && x[i] > max){
                System.out.print(x[i] + " ");
                max = x[i];
            }
            else if(x[i] == 0){
                max = 0;
                System.out.print(0 + " ");
            }
        }
        System.out.println();
    }
    static void even(int n,int x[]){
        int max = 0;
        for(int i=0;i<n;i++){
            if(x[i] % 2 == 0 && x[i] > max){
                System.out.print(x[i] + " ");
                max = x[i];
            }
            else if(x[i] == 0){
                max = 0;
                System.out.print(0 + " ");
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
