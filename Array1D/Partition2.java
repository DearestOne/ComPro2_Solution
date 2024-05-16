import java.util.Scanner;
public class Partition2 {
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
        int[] y = new int[n];
        int target = n/2;
        int count = 0;
        for(int i=0;i<n;i++){
            if(x[i]<=x[target]){
                y[count] = x[i];
                count++;
            }
        }
        less(count, y);
        more(count, y);
    }
}
