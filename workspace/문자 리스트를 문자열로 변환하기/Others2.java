public class Others2 {
    public static void main(String[] args) {
        Others2 others2 = new Others2();

        String[] input = {"a", "b", "c"};
        String output = others2.solution(input);

        System.out.println(output);
    }
    
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}
