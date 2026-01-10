package Daily_Code.interview_prep;

public class PowerOf2 {
    static Boolean checkPowerOf2(int num){
        return (num & (num - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(checkPowerOf2(8));
    }
}



