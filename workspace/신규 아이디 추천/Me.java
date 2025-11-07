import java.util.Arrays;

public class Me {
    public static void main(String[] args) {
        Me me = new Me();

        String output = me.solution("abcdefghijklmn.p");
        System.out.println(output);
    }
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-zA-Z0-9-_.]", "");
        new_id = new_id.replaceAll("\\.{2,}", ".");
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        new_id = new_id.isBlank() ? "a" : new_id;
        new_id = new_id.length() <= 15 ? new_id : new_id.substring(0, 15);
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        
        StringBuilder sb = new StringBuilder(new_id);
        if(sb.length() <= 2) {
            char last = new_id.toCharArray()[new_id.length() - 1];
            int restCount = 3 - new_id.length();
            char[] rest = new char[restCount];
            Arrays.fill(rest, last);

            sb.append(rest);
        }

        return sb.toString();
    }
}
