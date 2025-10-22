public class Others2 {
    public static void main(String[] args) {
        Others2 c = new Others2();

        int output = c.solution(9, 91);
        System.out.println(output);
        output = c.solution(89, 8);
        System.out.println(output);
    }
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }
}
