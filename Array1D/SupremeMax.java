import java.util.Scanner;
public class SupremeMax {
    static Scanner scan = new Scanner(System.in);
    static void display(int n,int x[]){
        int max = 0;
        int maxs = 0;
        boolean pre = true;
        boolean now = false;
        for(int i=0;i<n;i++){
            if(x[i] != 0){
                now = true;
            }
            else{
                now = false;
            }
            if(i>0){
                if(x[i - 1] != 0){
                    pre = true;
                }
                else{
                    pre = false;
                }
            }
            if(x[i] > max){
                max = x[i];
                if(max > maxs){
                    maxs = max;
                }
            }
            if(now == false && pre == true){
                System.out.print(max + " ");
                max = 0;
            }
        }
        System.out.println();
        System.out.println(maxs);
        int start = 0;
        for(int i=0;i<n;i++){
            if(x[i] == 0){
                start = i + 1;
            }
            if(x[i] == maxs){
                for(int j=start;j<n;j++){
                    if(x[j] == 0){
                        break;
                    }
                    System.out.print(x[j] + " ");
                }
                break;
            }
        }
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        display(n, x);
    }
}