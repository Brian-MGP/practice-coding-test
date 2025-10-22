public class Me {
    public static void main(String[] args) {
        Me c = new Me();

        int output = c.solution(2, 91);
        System.out.println(output);

        output = c.solution(91, 2);
        System.out.println(output);
    }
    public int solution(int a, int b) {
        int answer = 0;

        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ab2 = 2 * a * b;

        if(ab < ab2) {
            answer = ab2;
        }
        else {
            answer = ab;
        }

        return answer;
    }
}
