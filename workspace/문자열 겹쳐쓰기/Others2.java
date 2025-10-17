public class Others2 {
    public static void main(String[] args) {
        Others2 others2 = new Others2();
        String answer = others2.solution("He11oWor1d", "lloWorl", 2);

        System.out.println(answer);
    }

    public String solution(String my_string, String overwrite_string, int s) {
        char[] my_chars = my_string.toCharArray();
        char[] overwrite_chars = overwrite_string.toCharArray();
        for(int i = 0; i < overwrite_chars.length; i++) {
            my_chars[s + i] = overwrite_chars[i];
        }

        return String.valueOf(my_chars);
    }
}
