public class Others3 {
    public static void main(String[] args) {
        Others3 c = new Others3();

        int output = c.solution(9, 91);
        System.out.println(output);
        output = c.solution(89, 8);
        System.out.println(output);
    }
    public int solution(int a, int b) {
        int answer = 0;

        // a, b의 자릿수 구하기
        int lengthA = (int) (Math.log10(a) + 1);
        int lengthB = (int) (Math.log10(b) + 1);

        // a + b, b + a 구하기
        int addAB = (int) (a * Math.pow(10, lengthB) + b);
        int addBA = (int) (b * Math.pow(10, lengthA) + a);

        // 값 비교
        if(addAB >= addBA) {
            answer = addAB;
        }
        else if(addAB < addBA) {
            answer = addBA;
        }

        return answer;
    }
    
}
