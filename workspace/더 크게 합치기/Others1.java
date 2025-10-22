public class Others1 {
    public static void main(String[] args) {
        Others1 c = new Others1();

        int output = c.solution(9, 91);
        System.out.println(output);
        output = c.solution(89, 8);
        System.out.println(output);
    }
    public int solution(int a, int b) {
        int answer = 0;
        int aLong = Integer.parseInt("" + a + b);
        int bLong = Integer.parseInt("" + b + a);

        answer = aLong > bLong ? aLong : bLong;

        return answer;
    }
    
}
