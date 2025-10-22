import java.util.Arrays;
import java.util.stream.Collectors;

public class Others3 {
    public static void main(String[] args) {
        Others3 c = new Others3();

        String[] input = {"a", "b", "c"};
        String output = c.solution(input);

        System.out.println(output);
    }
    
    public String solution(String[] arr) {
        return Arrays.stream(arr).collect(Collectors.joining());
    }
}
