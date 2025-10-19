public class Me {
    public static void main(String[] args) {
        Me me = new Me();

        String output = me.solution("string", 3);
        System.out.println(output);
        output = me.solution("love", 10);
        System.out.println(output);
    }
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();

        for(int count = 0; count < k; count++) {
            sb.append(my_string);
        }

        return sb.toString();
    }
}
