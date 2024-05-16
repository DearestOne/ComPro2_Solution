import java.util.Scanner;
public class TargetPrice {
    static Scanner scan = new Scanner(System.in);
    static void purchase(int a,int b,int n,int cost[]){
        int space = a/2;
        if(b + space > n){
            System.out.print("no ");
            int sum = 0;
            for(int i=b - space-1;i<n;i++){
                sum += cost[i];
            }
            System.out.println(sum);
        }
        else if(b - space <= 0){
            System.out.print("no ");
            int sum = 0;
            for(int i=0;i<=b + space-1;i++){
                sum += cost[i];
            }
            System.out.println(sum);
        }
        else{
            int sum = 0;
            for(int i=b - space - 1;i<=b + space - 1;i++){
                sum += cost[i];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] cost = new int[n];
        for(int i=0;i<n;i++){
            cost[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            purchase(a, b, n, cost);
        }
    }
}
