import java.util.Collections;

public class Others3 {
    public static void main(String[] args) {
        Others3 others = new Others3();

        String output = others.solution("string", 3);
        System.out.println(output);
        output = others.solution("love", 10);
        System.out.println(output);
    }

    public String solution(String my_string, int k) {
        return String.join("", Collections.nCopies(k, my_string));
    }
}
