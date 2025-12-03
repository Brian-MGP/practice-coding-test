import java.util.List;

public class Me {
    final static List<String> alphabets = List.of("A", "E", "I", "O", "U");
    static int count = 0;
    
    public static void main(String[] args) {
        Me me = new Me();
        int output = me.solution("AAAE");

        System.out.println(output);
    }
    public int solution(String word) {
        find("A", word);
        return count;
    }

    public void find(String alphabet, String word) {
        count++;
        if(alphabet.equals(word)) {
            return;
        }
        String last = alphabet.substring(alphabet.length() - 1);
        System.out.println(alphabet);
        if(alphabet.length() < 5) {
            find(alphabet + last, word);
        }
        else if(last.equals("UUUUUU")) {
            return;
        }
        else if(last.equals("U")) {
            return;
        }
        else {
            int index = alphabets.indexOf(last);
            String next = alphabets.get(index + 1);
            String without = alphabet.substring(0, alphabet.length() - 1);
            find(without + next, word);
        }
    }
}
