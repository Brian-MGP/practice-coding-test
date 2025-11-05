import 삼각달팽이.Me;

public class Me {
    public static void main(String[] args) {
        Me c = new Me();

        int output = c.solution("<", "=", 20, 50);
        System.out.println(output);
        output = c.solution(">", "!", 41, 78);
        System.out.println(output);
    }
    public int solution(String ineq, String eq, int n, int m) {
        // 문자열 비교는 equals
        if("=".equals(eq) && n == m) {
            return 1;
        }
        else if("<".equals(ineq) && n < m) {
            return 1;
        }
        else if(">".equals(ineq) && n > m) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
