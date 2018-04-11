public class PangramChecker {
    public boolean isPangram(String s) {
        s = s.toLowerCase();
        if (s == "")
            return false;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}
