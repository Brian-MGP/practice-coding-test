public class Others1 {
    public static void main(String[] args) {
        Others1 others1 = new Others1();
        String answer = others1.solution("He11oWor1d", "lloWorl", 2);

        System.out.println(answer);
    }

    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }
}
