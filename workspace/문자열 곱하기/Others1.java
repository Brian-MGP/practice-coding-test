public class Others1 {
    public static void main(String[] args) {
        Others1 others = new Others1();

        String output = others.solution("string", 3);
        System.out.println(output);
        output = others.solution("love", 10);
        System.out.println(output);
    }

    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
