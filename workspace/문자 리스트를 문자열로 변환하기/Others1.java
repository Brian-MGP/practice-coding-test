public class Others1 {
    public static void main(String[] args) {
        Others1 c = new Others1();

        String[] input = {"a", "b", "c"};
        String output = c.solution(input);

        System.out.println(output);
    }
    
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}
