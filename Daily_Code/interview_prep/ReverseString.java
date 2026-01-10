package Daily_Code.interview_prep;

public class ReverseString {
    String reverse(String str){
        char[] strArray = str.toCharArray();
        char[] strArrayRev = new char[strArray.length];
        int index = 0;
        for(int i=strArray.length-1; i>=0; i--){
            strArrayRev[index++] = strArray[i];
        }
        return new String(strArrayRev);       
    }
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        String str = "darshan";
        System.out.println(obj.reverse(str));
    }
}



