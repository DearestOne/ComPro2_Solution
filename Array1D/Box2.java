import java.util.Scanner;
public class Box2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] max = new int[n];
        for(int i=0;i<n;i++){
            max[i] = scan.nextInt();
        }
        int[] x = new int[n];
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int o = scan.nextInt();
            if(o == 1){
                int q = scan.nextInt();
                int b = scan.nextInt();
                if(x[b - 1] + q <= max[b - 1]){
                    x[b - 1] += q;
                    System.out.println(x[b - 1]);
                }
                else{
                    System.out.println(-1);
                }
            }
            else{
                int q = scan.nextInt();
                for(int j=0;j<n;j++){
                    if(q >= x[j]){
                        q -= x[j];
                        x[j] = 0;
                    }
                    else{
                        x[j] -= q;
                        q = 0;
                    }
                    if(j == n-1 && q > 0){
                        System.out.println(n + " " + 0);
                        break;
                    }
                    else if(q == 0){
                        System.out.println(j + 1 + " " + x[j]);
                        break;
                    }
                }
            }
        }
    }
}
