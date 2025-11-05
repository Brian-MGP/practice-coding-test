import java.util.Arrays;
import java.util.stream.Stream;

public class Me {
    public static void main(String[] args) {
        Me me = new Me();

        me.solution(45);

    }
    public int solution(int n) {
        String tri = Integer.toString(n, 3);
        String reverse = new StringBuilder(tri).reverse().toString();
        int reversedN = Integer.parseInt(reverse, 3);

        return reversedN;
    }
}
