import java.util.HashMap;
import java.util.Map;

public class WordsChecker {
    String value;

    public WordsChecker(String value) {
        this.value = value;
    }

    public boolean hasWord(String word) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = value.split("\\P{IsAlphabetic}+");
        for (String wordSet : words) {
            map.put(wordSet, 1);
        }
        return map.containsKey(word);
    }
}
