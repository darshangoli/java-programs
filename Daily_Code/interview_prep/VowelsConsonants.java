package Daily_Code.interview_prep;

public class VowelsConsonants {
    public String str;
    char[] vowels = {'a','e','i','o','u'};
    int count = 0;

    public VowelsConsonants(String str) {
        this.str = str;
    }

    public int countVowels(){
        for(char ch : str.toCharArray()){
            for(char v : vowels){
                if(ch == v){
                    count++;
                }
            }
        }
        return count;
    }

    public int countConsonants(){
        return str.length() - count;
    }
    public static void main(String[] args) {
        String str = "darshan";
        VowelsConsonants obj = new VowelsConsonants(str);
        
        System.out.println("Vowels in String in "+str+" are "+obj.countVowels());
        System.out.println("Consonants in String "+str+" are "+obj.countConsonants());
    }
}



