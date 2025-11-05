public class Me {
    public static void main(String[] args) {
        Me me = new Me();

        String output = me.solution("a B z", 4);

        System.out.println(output);
    }
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(c == ' ') {
                sb.append(' ');
            }
            else if('A' <= c && c <= 'Z') {
                int length = 'Z' - 'A' + 1;
                int index = ((c + n) - 'A')%length;
                char secret = (char)(index + 'A');
                sb.append(secret);
            }
            else if('a' <= c && c <= 'z') {
                int length = 'z' - 'a' + 1;
                int index = ((c + n) - 'a')%length;
                char secret = (char)(index + 'a');
                sb.append(secret);
            }
        }

        return sb.toString();
    }
}
