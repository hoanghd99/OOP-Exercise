package BaiTapOOP.Bai10;

public class VanBan {
    private String st;

    public VanBan() {
        this.st = new String();
    }

    public VanBan(String st) {
        this.st = st;
    }

    public int wordCount(String st) {
        int count = 0;
        for (int i = 0; i < st.length(); i++){
            if (st.charAt(i) == ' '){
                count++;
            }
            return count;
        }
        return 0;
    }

    public int countAa(String st) {
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'A') {
                count++;
            }
            return count;
        }
        return 0;
    }

    //public boolean matching(String st) {
        //String regex =
    //}
}









































