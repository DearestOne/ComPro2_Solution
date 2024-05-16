import java.util.Scanner;
public class Crypto {
    static Scanner scan = new Scanner(System.in);
    static boolean case1(int x[],int start,int key){
        if(x[start] + key <= 51743 || x[start+1] - key > 7832){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean case2(int x[],int start,int key){
        if(x[start + 2] - key < 2394 || x[start+3] + key > 9213){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        int start = scan.nextInt();
        int key = scan.nextInt();
        if(case1(x, start, key) == true){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        if(case2(x, start, key) == true){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        if(case1(x, start, key) == true && case2(x, start, key) == true){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
