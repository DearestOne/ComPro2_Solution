import java.util.Scanner;
public class HowLongest {
    static Scanner scan = new Scanner(System.in);
    static void display(int n,int x[]){
        int max = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(x[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            if(count > max){
                max = count;
            }
        }
        System.out.println(max);
        count = 0;
        int start = 0;
        for(int i=0;i<n;i++){
            if(x[i] == 1){
                count++;
            }
            else{
                count = 0;
                start = i + 1;
            }
            if(count == max){
                System.out.print(start + 1 + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] x =new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        display(n, x);
    }
}
