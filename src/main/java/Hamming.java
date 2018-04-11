 class Hamming {
    private final String s1;
    private final String s;

    Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;
        if (s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        char[] chars = s.toCharArray();
        char[] chars1 = s1.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars1[i]) {
                count++;
            }
        }
        return count;
    }
}
