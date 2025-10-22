public class Me {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        int length = code.length();
        
        for(int idx = 0; idx < length; idx++) {
            char ch = code.charAt(idx);
            if(ch == '1') {
                mode = (mode == 1) ? 0 : 1;
            }
            else if(mode == 0 && idx % 2 == 0) {
                sb.append(ch);
            }
            else if(mode == 1 && idx % 2 == 1) {
                sb.append(ch);
            }
        }
        
        String ret = sb.toString();
        return ret.length() == 0 ? "EMPTY" : ret;
    }
    
}
