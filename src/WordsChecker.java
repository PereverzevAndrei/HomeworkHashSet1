import java.util.*;

public class WordsChecker {
    Set<String> value;

    public WordsChecker(String value) {
        this.value = new HashSet<>(List.of(value.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return value.contains(word);
    }
}
