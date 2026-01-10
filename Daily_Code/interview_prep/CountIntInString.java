package Daily_Code.interview_prep;

import java.util.Scanner;

public class CountIntInString {
    public int countIntInString(String str){
        int[] ints = {1,2,3,4,5,6,7,8,9,0};
        int count = 0;
        for(int i=0; i<ints.length; i++){
            char[] charArray = str.toCharArray();
            for(int j = 0; j<charArray.length; j++){
                if(ints[i] == (charArray[j] - '0')){
                    count++;
                }
            }
        }
        return count;
    }
    public int easyCountInString(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountIntInString obj = new CountIntInString();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(obj.easyCountInString(str));
    }
}



