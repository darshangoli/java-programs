package Daily_Code.LeetCodeEasyProblems;


public class LengthOfLastWord {
    int lengthOfLastWord(String str){
        int length = 0;
        int i = str.length() - 1;

        while(i>=0 && str.charAt(i) == ' '){
            i--;
        }

        while(i>=0 && str.charAt(i) != ' '){
            i--;
            length++;
        }

        return length;
    }
    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println(obj.lengthOfLastWord("goli satya "));
    }
}
