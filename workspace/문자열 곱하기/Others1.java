public class Others1 {
    public static void main(String[] args) {
        Others1 c = new Others1();

        String output = c.solution("string", 3);
        System.out.println(output);
        output = c.solution("love", 10);
        System.out.println(output);
    }

    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
