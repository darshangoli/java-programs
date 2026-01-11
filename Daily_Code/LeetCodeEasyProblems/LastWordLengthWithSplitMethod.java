package Daily_Code.LeetCodeEasyProblems;

public class LastWordLengthWithSplitMethod {
    int lengthOfLastWord(String str){
        String[] strings = str.split(" ");
        return strings[strings.length - 1].length();
    }
    public static void main(String[] args) {
        LastWordLengthWithSplitMethod obj = new LastWordLengthWithSplitMethod();
        System.out.println(obj.lengthOfLastWord("i got this thing"));
    }
}
