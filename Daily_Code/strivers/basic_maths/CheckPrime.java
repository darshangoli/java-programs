package Daily_Code.strivers.basic_maths;

public class CheckPrime {
    public boolean checkForPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count != 2) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPrime obj = new CheckPrime();
        System.out.println(obj.checkForPrime(113));
    }
}



