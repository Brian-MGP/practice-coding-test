public class Others2 {
    public static void main(String[] args) {
        Others2 c = new Others2();
        String output = c.solution("He11oWor1d", "lloWorl", 2);

        System.out.println(output);
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
