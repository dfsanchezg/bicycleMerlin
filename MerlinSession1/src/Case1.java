import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Case1 {

    public static Map<String, Long> findRepeatedWord(String s){

        Map<String, Long> collectionOfWords =
                Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       return collectionOfWords;
    }

    private static String findMostRepeatedWord(Map<String, Long> collectionWord){

        return collectionWord.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
    }

    private static String isAnagram(String text){

        List<Set<String>> collectionAnagrams =
                Arrays.stream(text.split(" "))
                        .collect(Collectors.groupingBy(Case1::sortWord))
                            .entrySet()
                            .stream()
                            .map(m -> new HashSet<String>(m.getValue()))
                            .collect(Collectors.toList());
        System.out.println(collectionAnagrams);
        return "";
    }

    private static String sortWord(String word) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }

    public static void main(String... args) {
        Map<String,Long> collectionOfWords = findRepeatedWord("hola si is no no hola hola");
        Integer numberOfWords = collectionOfWords.size();
        String mostRepeatedWord = findMostRepeatedWord(collectionOfWords);

        System.out.println("The number of words is: " + numberOfWords);
        System.out.println("The most reapeated word is " + mostRepeatedWord);
        isAnagram("hola si is no no hola hola");
        System.out.println(sortWord("hola"));
    }
}
