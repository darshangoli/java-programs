package Daily_Code.LeetCodeEasyProblems;

public class DetectCapitals {
    static boolean detectCapitals(String str){
        if (str == null || str.isEmpty()) {
            return false;
        }

        boolean allUpperCase = true;
        boolean allLowerCase = true;
        boolean firstUpperRestLower = Character.isUpperCase(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                allLowerCase = false;
                firstUpperRestLower = false;
            } else {
                allUpperCase = false;
            }
        }

        return allUpperCase || allLowerCase || firstUpperRestLower;
    }
}
