public class Me {
    public static void main(String[] args) {
        Me c = new Me();

        int output = c.solution(98, 2);
        System.out.println(output);
        output = c.solution(34, 3);
        System.out.println(output);
    }
    public int solution(int num, int n) {
        int answer = 0;

        if(num % n == 0) {
            answer = 1;
        }
        else {
            answer = 0;
        }
        return answer;    }
}
