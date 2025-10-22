public class Others2 {
    public static void main(String[] args) {
        Others2 c = new Others2();

        String[] input = {"a", "b", "c"};
        String output = c.solution(input);

        System.out.println(output);
    }
    
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}
