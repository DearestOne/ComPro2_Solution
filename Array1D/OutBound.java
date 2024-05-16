import java.util.Scanner;
public class OutBound {
    static Scanner scan = new Scanner(System.in);
    static void display(int start,int end,int x[],int n){
        boolean data = false;
        for(int i=0;i<n;i++){
            if(x[i] < start || x[i] > end){
                System.out.print(x[i] + " ");
                data = true;
            }
        }
        if(data == false){
            System.out.println("no data");
        }
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] x =new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        int s = scan.nextInt();
        int e = scan.nextInt();
        display(s, e, x, n);
    }
}
