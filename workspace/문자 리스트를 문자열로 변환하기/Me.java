public class Me {
    public static void main(String[] args) {
        Me c = new Me();

        String[] input = {"a", "b", "c"};
        String output = c.solution(input);

        System.out.println(output);
    }
    
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();

        for(String str : arr) {
            sb.append(str);
        }

        return sb.toString();
    }
}
