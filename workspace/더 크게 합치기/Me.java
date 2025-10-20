public class Me {
    public static void main(String[] args) {
        Me solution = new Me();

        int output = solution.solution(9, 91);
        System.out.println(output);
        output = solution.solution(89, 8);
        System.out.println(output);
    }
    public int solution(int a, int b) {
        int answer = 0;

        String strAB = Integer.toString(a) + Integer.toString(b);
        String strBA = Integer.toString(b) + Integer.toString(a);

        int intAB = Integer.parseInt(strAB);
        int intBA = Integer.parseInt(strBA);

        if(intAB < intBA) {
            answer = intBA;
        }
        else {
            answer = intAB;
        }

        return answer;
    }
}
