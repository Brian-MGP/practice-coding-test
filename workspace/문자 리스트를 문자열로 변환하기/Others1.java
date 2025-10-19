public class Others1 {
    public static void main(String[] args) {
        Others1 others1 = new Others1();

        String[] input = {"a", "b", "c"};
        String output = others1.solution(input);

        System.out.println(output);
    }
    
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}
