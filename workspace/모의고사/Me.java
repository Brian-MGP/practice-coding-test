import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Me {
    static final List<Integer> one = List.of(1, 2, 3, 4, 5);
    static final List<Integer> two = List.of(2, 1, 2, 3, 2, 4, 2, 5);
    static final List<Integer> three = List.of(3, 3, 1, 1, 2, 2, 4, 4, 5, 5);

    public static void main(String[] args) {
        Me me = new Me();

        int[] answers = {1,2,3,4,5};
        int[] output = me.solution(answers);
        System.out.println(Arrays.toString(output));
    }
    public int[] solution(int[] answers) {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(1, 0);
        result.put(2, 0);
        result.put(3, 0);

        for(int i = 0; i < answers.length; i++) {
            int answer = answers[i];

            int oneIndex = i - ((i / one.size()) * one.size());
            int twoIndex = i - ((i / two.size()) * two.size());
            int threeIndex = i - ((i / three.size()) * three.size());

            if(one.get(oneIndex).intValue() == answer) {
                result.put(1, result.get(1) + 1);
            }
            if(two.get(twoIndex).intValue() == answer) {
                result.put(2, result.get(2) + 1);
            }
            if(three.get(threeIndex).intValue() == answer) {
                result.put(3, result.get(3) + 1);
            }
        }

        int max = result.values().stream().mapToInt(x -> x).max().getAsInt();
        return result.entrySet().stream().filter(m -> m.getValue().intValue() == max).map(m -> m.getKey()).mapToInt(Integer::intValue).toArray();
    }
}
