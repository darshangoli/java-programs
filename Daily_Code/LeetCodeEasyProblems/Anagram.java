package Daily_Code.LeetCodeEasyProblems;

public class Anagram {
    public boolean anagram(String s1, String s2){
        int[] count = new int[26];
        
        if(s1.length() != s2.length()){
            return false;
        }

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            count[ch - 'a']++;
        }

        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            count[ch - 'a']--;
        }

        for(int i=0; i<count.length; i++){
            if(count[i] > 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Anagram obj = new Anagram();
        System.out.println(obj.anagram("anagram", "nagaram"));
    }
}
