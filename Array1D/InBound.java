import java.util.Scanner;
public class InBound {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n =scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        int start = scan.nextInt();
        int end = scan.nextInt();
        boolean data = false;
        for(int i=0;i<n;i++){
            if(x[i] >= start && x[i] <= end){
                System.out.print(x[i] + " ");
                data = true;
            }
        }
        if(data == false){
            System.out.println("no data");
        }
    }
}
