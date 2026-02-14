package Daily_Code.LeetCodeEasyProblems;

public class JewelsAndStones {
    int findStonesThatAreJewels(String jewels, String stones){
        char[] jewelsArray = new char[jewels.length()];
        int count = 0;
        for(int i=0; i<jewels.length(); i++){
            jewelsArray[i] = jewels.charAt(i);
            for(int j=0; j<stones.length(); j++){
                if(stones.charAt(j) == jewelsArray[i]){
                    count += 1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        JewelsAndStones obj = new JewelsAndStones();
        System.out.println(obj.findStonesThatAreJewels("z", "ZZ"));
    }
}
