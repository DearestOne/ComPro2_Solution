import java.util.Scanner;
public class ArrayOcc2 {
    static Scanner scan = new Scanner(System.in);
    static void display(int x[],int array,int n){
        int[] a = new int[array];
        for(int i=0;i<n;i++){
            if(x[i] > 0 && x[i] <= array){
                a[x[i] - 1]++;
            }
        }
        int count = 0;
        int max = 0;
        for(int i=0;i<array;i++){
            if(a[i] == 0){
                count++;
                if(count > max){
                    max  = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.println(max);
        for(int i=0;i<array;i++){
            if(a[i] == 0){
                count++;
                if(count == max){
                    System.out.print(i + 1 + " ");
                }
            }
            else{
                count = 0;
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
        display(x, array, n);
    }
}
