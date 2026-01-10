package Daily_Code.ExceptionHandling;

class GenderException extends Exception{
    GenderException(String message){
        super(message);
    }
}

public class CustomException2 {
    static void validateGender(String gender) throws GenderException{
        if(gender.equals("male")){
            throw new GenderException("You should be female!");
        }
        else if(gender.equals("female")){
            System.out.println("you are a female");
        }
        else{
            System.out.println("please go");
        }
    }
    public static void main(String[] args) {
        try{
            validateGender("females");
        } catch(GenderException e){
            System.out.println(e.getMessage());
        }
    }
}



