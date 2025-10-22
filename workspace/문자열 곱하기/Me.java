public class Me {
    public static void main(String[] args) {
        Me c = new Me();

        String output = c.solution("string", 3);
        System.out.println(output);
        output = c.solution("love", 10);
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
