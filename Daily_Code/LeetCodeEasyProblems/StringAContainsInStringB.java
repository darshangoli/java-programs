package Daily_Code.LeetCodeEasyProblems;

public class StringAContainsInStringB {
    boolean canConstruct(String a, String b){
        if(a.contains(b)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        StringAContainsInStringB obj = new StringAContainsInStringB();
        System.out.println(obj.canConstruct("darshan", "han"));
    }
}
