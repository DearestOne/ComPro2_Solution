import java.util.Scanner;
public class ConsecSale {
    static Scanner scan = new Scanner(System.in);
    static void display(int n,int a[],int k,int p){
        boolean[] room = new boolean[n];
        for(int i=0;i<k;i++){
            if(a[i] >= p && a[i] < p+n){
                room[a[i] - p] = true;
            }
        }
        int count = 0;
        int cmax = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            if(room[i] == false){
                count++;
                cmax++;
                if(cmax > max){
                    max = cmax;
                }
            }
            else if(room[i] == true){
                cmax = 0;
            }
        }
        System.out.println(count);
        System.out.println(max);
    }
    public static void main(String[] args){
        int n = scan.nextInt();
        int p = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[k];
        for(int i=0;i<k;i++){
            a[i] = scan.nextInt();
        }
        display(n, a, k, p);
    }
}
