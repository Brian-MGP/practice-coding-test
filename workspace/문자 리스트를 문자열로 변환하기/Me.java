public class Me {
    public static void main(String[] args) {
        Me me = new Me();

        String[] input = {"a", "b", "c"};
        String output = me.solution(input);

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
