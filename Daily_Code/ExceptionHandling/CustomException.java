package Daily_Code.ExceptionHandling;

class AgeException extends Exception{
    AgeException(String message){
        super(message);
    }
}

public class CustomException {
    public void validateAge(int age) throws AgeException{
        if(age < 18){
            throw new AgeException("Age should be greater than 18 !");
        }else{
            System.out.println("Good");
        }
    }

    public static void main(String[] args) {
        CustomException obj = new CustomException();
        try{
            obj.validateAge(20);
        }catch (AgeException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}



