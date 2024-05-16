import java.util.Scanner;
public class CP_SU48 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int maxM = scan.nextInt();
        int maxA = scan.nextInt();
        int[] m = new int[n];
        int[] a = new int[n];
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(y == 1){
                if(m[x-1] < maxM){
                    m[x-1]++;
                    System.out.println(1);
                }
                else if(a[x-1] < maxA){
                    a[x-1]++;
                    System.out.println(2);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(y == 2){
                if(a[x-1] < maxA){
                    a[x-1]++;
                    System.out.println(2);
                }
                else if(m[x-1] < maxM){
                    m[x-1]++;
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(m[i] + " ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
