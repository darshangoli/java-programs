package Daily_Code.LeetCodeEasyProblems;

public class ReverseWordsInString {
    String reverseWords(String str){
        
        String[] words = str.split(" ");
        String[] resultArray = new String[words.length];
        int index = 0;
        for(String word : words){
            StringBuilder sb = new StringBuilder(word);
            resultArray[index++] = sb.reverse().toString();
        }
        return String.join(" ", resultArray);
    }
    public static void main(String[] args) {
        ReverseWordsInString obj = new ReverseWordsInString();
        String ans = obj.reverseWords("darshan is a good boy");
        System.out.println(ans);
    }
}
