public class Me {
    public static void main(String[] args) {
        Me c = new Me();

        String result = c.solution("aaaa",  "bbbb");
        System.out.println(result);
    }

    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();

        int length = str1.length();

        for(int index = 0; index < length; index++) {
            char ch1 = str1.charAt(index);
            sb.append(ch1);

            char ch2 = str2.charAt(index);
            sb.append(ch2);
        }

        return sb.toString();
    }
}
