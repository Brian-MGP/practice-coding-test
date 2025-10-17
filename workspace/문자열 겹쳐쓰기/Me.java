public class Me {
    public static void main(String[] args) {
        Me me = new Me();
        String answer = me.solution("He11oWor1d", "lloWorl", 2);

        System.out.println(answer);
    }

    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int my_string_length = my_string.length();
        int overwrite_string_length = overwrite_string.length();

        int my_string_index = 0;
        int overwrite_string_index = 0;
        while(my_string_index < my_string_length) {
            char ch;
            if(my_string_index < s) {
                ch = my_string.charAt(my_string_index);
            }
            else if(s <= my_string_index && my_string_index < s + overwrite_string_length) {
                ch = overwrite_string.charAt(overwrite_string_index++);
            }
            else {
                ch = my_string.charAt(my_string_index);
            }
            sb.append(ch);
            my_string_index++;
        }

        answer = sb.toString();
        return answer;
    }
}
