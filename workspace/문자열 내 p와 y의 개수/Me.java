public class Me {
    public boolean Solution(String s) {
        long countP = s.chars().filter(x -> x == 'p' || x == 'P').count();
        long countY = s.chars().filter(x -> x == 'y' || x == 'Y').count();

        return countP == countY;
    }
}
