import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Others2 {
    public static void main(String[] args) {
        Others2 c = new Others2();

        String output = c.solution("string", 3);
        System.out.println(output);
        output = c.solution("love", 10);
        System.out.println(output);
    }

    public String solution(String my_string, int k) {
        String answer = IntStream.range(0, k).mapToObj(x -> my_string).collect(Collectors.joining());
        return answer;
    }
}
