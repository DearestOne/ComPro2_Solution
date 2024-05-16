import java.util.Scanner;
public class TrainTicket {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] seat = new int[n];
        int p = scan.nextInt();
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            boolean result = true;
            for(int j=x-1;j<y-1;j++){
                if(seat[j] + z > p){
                    result = false;
                }
            }
            if(result == true){
                System.out.println("Y");
                for(int j=x-1;j<y-1;j++){
                    seat[j] += z;
                }
            }
            else{
                System.out.println("N");
            }
        }
    }
}
