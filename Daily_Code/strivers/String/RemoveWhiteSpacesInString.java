package Daily_Code.strivers.String;

public class RemoveWhiteSpacesInString {
    public String removeSpaces(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : charArray) {
            if (c != ' ') {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Darshan is Good";
        RemoveWhiteSpacesInString obj = new RemoveWhiteSpacesInString();
        System.out.println(obj.removeSpaces(str));
    }
}



