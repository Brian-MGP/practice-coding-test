public class Others3 {
    public static void main(String[] args) {
        Others3 others = new Others3();
        String answer = others.solution("He11oWor1d", "lloWorl", 2);

        System.out.println(answer);
    }

    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        return sb.toString();
    }
}
