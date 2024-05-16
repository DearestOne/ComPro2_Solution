import java.util.Scanner;
public class ArrayOcc1 {
    static Scanner scan = new Scanner(System.in);
    static void display(int array,int n,int x[]){
        int[] a = new int[array];
        int sucess = 0;
        int fail_out = 0;
        int fail_replace = 0;
        for(int i=0;i<n;i++){
            if(x[i] < 1 || x[i] > array){
                fail_out++;
            }
            else{
                a[x[i]-1]++;
                if(a[x[i]-1] == 1){
                    sucess++;
                }
                else if(a[x[i]-1] > 1){
                    fail_replace++;
                }
            }
        }
        System.out.println(sucess);
        System.out.println(fail_out);
        System.out.println(fail_replace);
        int max  = 0;
        for(int i=0;i<array;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        for(int i=0;i<array;i++){
            if(max == a[i]){
                System.out.print(i + 1 + " ");
            }
        }
    }
    public static void main(String[] args) {
        int array = scan.nextInt();
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        display(array, n, x);
    }
}
