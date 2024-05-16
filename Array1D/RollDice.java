import java.util.Scanner;
public class RollDice {
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] board = new int[n];
        int[] effect = new int[n];
        for(int i=0;i<n;i++){
            board[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            effect[i] = scan.nextInt();
        }
        int round = scan.nextInt();
        int index = 0;
        int score = 0;
        int place;
        for(int i=0;i<round;i++){
            int x = scan.nextInt();
            index += x;
            if(index < 0){
                place = n + (index%n);
            }
            else{
                place = (index%n);
            }
            score += board[place];
            if(effect[place] == 0){
                System.out.println(place + " " + score);
            }
            else{
                index += effect[place];
                if(index < 0){
                    place = n + (index%n);
                }
                else{
                    place = (index%n);
                }
                score += board[place];
                System.out.println(place + " " + score);
            }
        }
    }
}
