import java.util.*;

public class AnagramList {
    public static void main(String args[]){
        List<String> words = new ArrayList<>(Arrays.asList("bat","tab","tap","pat","sat"));
        Map<String,List<String>> anagramGroups = new HashMap<>();

        for(String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!anagramGroups.containsKey(sortedWord)){
                anagramGroups.put(sortedWord, new ArrayList<>());
            }

            anagramGroups.get(sortedWord).add(word);
        }

        for(List<String> groups : anagramGroups.values()){
            System.out.println(groups);
        }
    }
}
