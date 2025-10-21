import java.util.function.Function;

class Me2 {
    public int solution(int n) {
        int answer = 0;
        Function<Integer, Integer> fn = null;

        if(n % 2 == 1) {
            fn = x -> x;
        }
        else {
            fn = x -> x * x;
        }

        int count = n;
        while(0 < count) {
            answer += fn.apply(count);
            count = count - 2;
        }

        return answer;
    }
}