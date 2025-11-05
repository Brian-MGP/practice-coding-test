public class Me {
    public static void main(String[] args) {
        Me me = new Me();

        String output = me.solution("try hello world");
        System.out.println(output);
    }
    public String solution(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            char changed = ' ';
            if(c == ' ') {
                index = 0;
            }
            else if(index % 2 == 0) {
                changed = Character.toUpperCase(c);
                index++;
            }
            else if(index % 2 == 1) {
                changed = Character.toLowerCase(c);
                index++;
            }

            sb.append(changed);
        }

        return sb.toString();
    }   
}
