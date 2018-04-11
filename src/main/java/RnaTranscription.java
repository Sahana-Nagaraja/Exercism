import java.util.HashMap;

class RnaTranscription {
    private HashMap<Character, Character> strand = new HashMap<>();

    void setHashMap() {
        strand.put('G', 'C');
        strand.put('C', 'G');
        strand.put('T', 'A');
        strand.put('A', 'U');
    }

    String transcribe(String c) {

        StringBuilder str = new StringBuilder(c);
        int len = c.length();
        for (int i = 0; i < len; i++) {
            str.setCharAt(i, strand.get(str.charAt(i)));
        }
        return str.toString();
    }
}
