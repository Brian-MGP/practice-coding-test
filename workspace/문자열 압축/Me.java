public class Me {
    public static void main(String[] args) {
        Me me = new Me();

        int output = me.solution("a");

        System.out.println(output);
    }
    public int solution(String s) {
        int length = s.length();
        int min = Integer.MAX_VALUE;

        for(int window = 1; window <= length; window++) {
            int size = length / window;

            StringBuilder sb = new StringBuilder();
            int currentIndex = 0;
            int i = 0;

            while(i < size) {
                int count = 1;
                String current = s.substring(currentIndex, currentIndex + window);

                int j = i + 1;
                while(j < size) {
                    int nextIndex = j * window;
                    String next = s.substring(nextIndex, nextIndex + window);
                    
                    if(current.equals(next)) {
                        j++;
                        count++;
                    }
                    else {
                        currentIndex = nextIndex;
                        break;
                    }
                }

                i = j;
                sb.append(getString(current, count));
            }

            if(length % window > 0) {
                String rest = s.substring(size * window);
                sb.append(rest);
            }

            min = sb.length() < min ? sb.length() : min;
        }

        return min;
    }

    public String getString(String s, int n) {
        return n == 1 ? s : n + s;
    }
}
