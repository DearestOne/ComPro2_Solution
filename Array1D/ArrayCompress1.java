import java.util.Scanner;
public class ArrayCompress1 {
    static Scanner scan = new Scanner(System.in);
    static void display(int n,int x[],int a){
        int sum = 0;
        for(int i=0;i<n;i++){
            if(x[i] == a){
                System.out.print(sum + " " + a + " ");
                i++;
                sum = 0;
            }
            sum += x[i];
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        int a = scan.nextInt();
        display(n, x, a);
    }
}
