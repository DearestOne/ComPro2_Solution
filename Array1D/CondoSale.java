import java.util.Scanner;
public class CondoSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        int k = scan.nextInt();
        int[] nroom = new int[n];
        int count = 0;
        for(int i=0;i<k;i++){
            int x = scan.nextInt();
            if(x >= p && x <= n + p - 1){
                nroom[x - p] += 1; 
                if(nroom[x - p] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
        for(int i=0;i<n;i++){
            if(nroom[i] > 0){
                System.out.println(i + p);
            }
        }
    }
}