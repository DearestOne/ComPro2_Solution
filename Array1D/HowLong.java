import java.util.Scanner;
public class HowLong {
    static Scanner scan = new Scanner(System.in);
    static void display(int n,int x[],int k[]){
        for(int j=0;j<3;j++){
            int count = 0;
            for(int i=k[j] - 1;i<n;i++){
                if(x[i] == 0){
                    break;
                }
                count++;
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        int[] k = new int[3];
        for(int i=0;i<3;i++){
            k[i] = scan.nextInt();
        }
        display(n, x, k);
    }
}
