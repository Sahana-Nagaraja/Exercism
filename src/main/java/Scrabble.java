import com.sun.org.apache.regexp.internal.CharacterArrayCharacterIterator;

import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    private final String input ;
    public int totalScore;

    public char[] lettersWithScore1 = {'A', 'E', 'I', 'O', 'U','L','N','R','S', 'T'};
    char[] lettersWithScore2 = {'D','G'};
    char[] lettersWithScore3 = {'B','C','M','P'};
    char[] lettersWithScore4 = {'F','H','V','W','Y'};
    char[] lettersWithScore5 = {'K'};
    char[] lettersWithScore8 = {'J', 'X'};
    char[] lettersWithScore10 = {'Q','Z'};

    private static final Map<Character, Integer> lettersMap;

    static {
        lettersMap = new HashMap<Character, Integer>();
    }

    public Scrabble(String a) {
        this.input = a;
    }

    public int getScore() {
        for(int i = 0; i < lettersWithScore1.length; i++) {
            lettersMap.put(lettersWithScore1[i], 1);
        }
        for(int i = 0; i < lettersWithScore2.length; i++) {
            lettersMap.put(lettersWithScore2[i], 2);
        }
        for(int i = 0; i < lettersWithScore3.length; i++) {
            lettersMap.put(lettersWithScore3[i], 3);
        }
        for(int i = 0; i < lettersWithScore4.length; i++) {
            lettersMap.put(lettersWithScore4[i], 4);
        }
        for(int i = 0; i < lettersWithScore5.length; i++) {
            lettersMap.put(lettersWithScore5[i], 5);
        }
        for(int i = 0; i < lettersWithScore8.length; i++) {
            lettersMap.put(lettersWithScore8[i], 8);
        }
        for(int i = 0; i < lettersWithScore10.length; i++) {
            lettersMap.put(lettersWithScore10[i], 10);
        }


        char[] ch = input.toUpperCase().toCharArray();

        for (int i = 0; i < ch.length; i++){
            totalScore += lettersMap.get(ch[i]);
        }
        return totalScore;
    }
}
