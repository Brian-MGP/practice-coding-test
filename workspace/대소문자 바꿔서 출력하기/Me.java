import java.util.Scanner;

public class Me {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int index = 0; index < a.length(); index++) {
            int toInt = (int)a.charAt(index);
            char transfered; 
            if(toInt < 97) {
                transfered = (char)(toInt + 32);
            }
            else {
                transfered = (char)(toInt - 32);
            }
            System.out.print(transfered);
        }
        System.out.println("");
    }
}