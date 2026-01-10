package Daily_Code.interview_prep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Anagaram {
    boolean checkIfAnagram(String str1, String str2){
        List<Character> li1 = new ArrayList<>();
        List<Character> li2 = new ArrayList<>();
        for(Character ch1 : str1.toCharArray()){
            li1.add(ch1);
        }
        for(Character ch2 : str2.toCharArray()){
            li2.add(ch2);
        }
        return new HashSet<>(li1).equals(new HashSet<>(li2));
    }
    public static void main(String[] args) {
        Anagaram obj = new Anagaram();
        String str1 = "apple";
        String str2 = "lappe";
        System.out.println(obj.checkIfAnagram(str1, str2));
    }
}



