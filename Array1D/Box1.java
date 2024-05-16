import java.util.Scanner;
public class Box1 {
    static Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] max = new int[n];
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            max[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int Op = scan.nextInt();
            int Q = scan.nextInt();
            int B = scan.nextInt();
            if(Op == 1){
                if(x[B-1] + Q <= max[B-1]){
                    x[B-1] += Q;
                    System.out.println(x[B-1]);
                }
                else{
                    System.out.println(-1);
                }
            }
            else if(Op == 2){
                if(x[B-1] - Q >= 0){
                    x[B-1] -= Q;
                    System.out.println(x[B-1]);
                }
                else{
                    System.out.println(-1);
                }
            }        
        }
    }
}
