import java.util.ArrayList;
import java.util.List;

public class RaindropConverter {

    String convert(int number) {
        StringBuilder raindrop = new StringBuilder("");
        if(isFactorOf(number, 3)) raindrop.append("Pling");
        if(isFactorOf(number, 5)) raindrop.append("Plang");
        if(isFactorOf(number, 7)) raindrop.append("Plong");
        return (raindrop.length() == 0) ? Integer.toString(number) : raindrop.toString();
    }

    boolean isFactorOf(int number, int factor) {
        return (number%factor == 0);
    }
}
