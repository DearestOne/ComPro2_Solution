import java.util.Scanner;
public class AlternateJump {
    static Scanner scan = new Scanner(System.in);
    static void jump(int n,int a[],int b[]){
        int index_a = 0;
        int index_b = 0;
        int count_a = 0;
        int count_b = 0;
        boolean AB = true;
        int j = 0;
        for(;;){
            if(AB == true){
                index_a += j;
                if(index_a > n-1){
                    break;
                }
                System.out.println("1 " + (index_a+1) + " " + a[index_a]);
                count_a++;
                j = a[index_a];
                if(a[index_a] % 2 != 0){
                    AB = false;
                }
            }
            else if(AB == false){
                index_b += j;
                if(index_b > n-1){
                    break;
                }
                System.out.println("2 " + (index_b+1) + " " + b[index_b]);
                count_b++;
                j = b[index_b];
                if(b[index_b] % 2 != 0){
                    AB = true;
                }
            }
        }
        System.out.println(count_a);
        System.out.println(count_b);
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] a = new int[n]; 
        int[] b = new int[n]; 
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i] = scan.nextInt();
        }
        jump(n, a, b);
    }
}
