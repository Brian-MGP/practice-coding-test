import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Me {
    public int solution(int n) {
        IntUnaryOperator calc = null;
        IntPredicate filter = null;

        if(n % 2 == 1) {
            calc = x -> x;
            filter = x -> x % 2 == 1;
        }
        else {
            calc = x -> x * x;
            filter = x -> x % 2 == 0;
        }
        
        return IntStream.rangeClosed(1, n).filter(filter).map(calc).sum();
    }
}
