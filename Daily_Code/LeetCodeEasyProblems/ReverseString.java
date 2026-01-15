package Daily_Code.LeetCodeEasyProblems;

public class ReverseString {
    void reverse(String str){
        char[] strArray = str.toCharArray();
        int start = 0;
        int end = strArray.length - 1;
        while(start < end){
            char ch = strArray[start];
            strArray[start] = strArray[end];
            strArray[end] = ch;
            start++;
            end--;
        }
        for(char i : strArray){
            System.out.print(i+"");
        }
    }
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.reverse("darshan");
    }
}
