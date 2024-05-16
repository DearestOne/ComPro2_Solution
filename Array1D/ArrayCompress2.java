import java.util.Scanner;
public class ArrayCompress2 {
    static Scanner scan = new Scanner(System.in);
    static void display(int x[],int k[],int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            Boolean cnt_n = false;
            Boolean cnt_p = false;
            for(int j=0;j<3;j++){
                if(x[i] == k[j]){
                    cnt_n = true;
                }
            }
            if(i >= 1){
                for(int j=0;j<3;j++){
                    if(x[i-1] == k[j]){
                        cnt_p = true;
                    }
                }
            }
            if(cnt_n == true && cnt_p == false){
                if(i > 0){
                    System.out.print(sum + " ");
                }
                System.out.print(x[i] + " ");
                sum = 0;
            }
            else if(cnt_n == true && cnt_p == true){
                continue;
            }
            else if(i == n-1 && cnt_n == false){
                sum += x[i];
                System.out.print(sum);
            }
            else{
                sum += x[i];
            }
        }
    }
    public static void main(String[] args) {
        int n =scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        int[] k = new int[3];
        for(int i=0;i<3;i++){
            k[i] = scan.nextInt();
        }
        display(x, k, n);
    }
}
