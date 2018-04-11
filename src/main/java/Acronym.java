import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Acronym {
    private final String phrase;

    public Acronym(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        String acronym = Arrays.stream(phrase.trim().replace("-"," ").split(" "))
                .map(word -> word.charAt(0))
                .map(c -> c.toString().toUpperCase())
                .collect(Collectors.joining());
        return acronym;
    }
}
