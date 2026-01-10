package Daily_Code.interview_prep;

public class ReverseStringEff {
    String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        ReverseStringEff obj = new ReverseStringEff();
        String str = "satya";
        System.out.println(obj.reverse(str));
    }
}



