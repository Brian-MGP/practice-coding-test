import java.util.Arrays;

public class Me {
    public static void main(String[] args) {
        Me me = new Me();

        int[] output = me.solution("01110");

        System.out.println(Arrays.toString(output));
    }
    public int[] solution(String s) {
        long totalDeletedZeroCount = 0;
        long totalRepeatCount = 0;
        while (true) {
            if(s.equals("1"))
                break;

            totalDeletedZeroCount += s.chars().filter(x -> x == '0').count();
            String deleted = s.replace("0", "");
            s = Integer.toString(deleted.length(), 2);
            totalRepeatCount++;
        }

        int[] answer = {(int)totalRepeatCount, (int)totalDeletedZeroCount};
        return answer;
    }
}
