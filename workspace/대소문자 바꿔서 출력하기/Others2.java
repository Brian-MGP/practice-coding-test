import java.util.Scanner;

public class Others2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        int gap = (int)('a' - 'A');

        for(char ch : a.toCharArray()) {
            if('a' <= ch && ch <= 'z') {
                sb.append((char)(ch - gap));
            }
            else {
                sb.append((char)(ch + gap));
            }
        }
        System.out.println(sb.toString());
    }
}