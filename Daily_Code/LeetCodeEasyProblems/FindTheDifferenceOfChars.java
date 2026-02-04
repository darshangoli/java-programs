package Daily_Code.LeetCodeEasyProblems;

public class FindTheDifferenceOfChars {
    char difference(String a, String b){
        int sum_a = 0;
        int sum_b = 0;
        for(int i=0; i<a.length(); i++){
            sum_a += a.charAt(i);
        }
        for(int i=0; i<b.length(); i++){
            sum_b += b.charAt(i);
        }
        int result = sum_b - sum_a;
        return (char)result;
    }
    public static void main(String[] args) {
        FindTheDifferenceOfChars obj = new FindTheDifferenceOfChars();
        System.out.println(obj.difference("darshan", "darshan"));
    }
}
