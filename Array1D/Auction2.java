import java.util.Scanner;
public class Auction2 {
    static Scanner scan = new Scanner(System.in);
    static void display(int x[],int n){
        for(int i=0;i<n;i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n =scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int[] y = new int[n];
        int[] cnt = new int[n];
        for(int i=0;i<k;i++){
            for(int j=0;j<n;j++){
                y[j] = scan.nextInt();
            }
            for(int j=0;j<n;j++){
                if(y[j] > x [j] && cnt[j] < 3){
                    x[j] = y[j];
                    cnt[j] = 0;
                }
                else{
                    cnt[j]++;
                }
            }
            display(x, n);
        }
    }
}
