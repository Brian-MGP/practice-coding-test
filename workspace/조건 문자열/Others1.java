import java.util.Map;
import java.util.function.BiFunction;

public class Others1 {
    public static void main(String[] args) {
        Others1 c = new Others1();

        int output = c.solution("<", "=", 20, 50);
        System.out.println(output);
        output = c.solution(">", "!", 41, 78);
        System.out.println(output);
    }
    public int solution(String ineq, String eq, int n, int m) {
        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
            ">=", (a, b) -> a >= b,
            "<=", (a, b) -> a <= b,
            ">!", (a, b) -> a > b,
            "<!", (a, b) -> a < b
        );

        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
    }
}
