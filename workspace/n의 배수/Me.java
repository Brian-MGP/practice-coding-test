public class Me {
    public static void main(String[] args) {
        Me solution = new Me();

        int output = solution.solution(98, 2);
        System.out.println(output);
        output = solution.solution(34, 3);
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
