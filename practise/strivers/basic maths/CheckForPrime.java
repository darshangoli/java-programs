

public class CheckForPrime {
    public boolean isPrime(int num){
        for(int i = 2; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        CheckForPrime obj = new CheckForPrime();
        int num = 4;
        System.out.println(obj.isPrime(num));
    }
}