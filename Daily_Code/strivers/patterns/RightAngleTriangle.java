package Daily_Code.strivers.patterns;

public class RightAngleTriangle {

    public void rightAngleTriangle(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void reverseRightAngleTriangle(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void reverseRightAngleNumbers(int rows){
        for(int i=0; i<=rows; i++){
            for(int j=1; j<rows-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void triangle(int rows){
        for(int i=0; i<rows; i++){
            //spaces
            for(int j=0; j<rows-i-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            // spaces
            for(int j=0; j<rows-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void reverseTriangle(int rows){
        for(int i=0; i<rows; i++){
            //spaces
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*rows - (2*i+1); j++){
                System.out.print("*");
            }
            // spaces
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void rightHalfDiamond(int rows){
        for(int i=1; i<=(2*rows-1); i++){
            int stars = i;
            if(i > rows){
                stars = 2*rows - i;
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void rightAngleBinary(int rows){
        int start = 0;
        for(int i=1; i<=rows; i++){
            if(rows % 2 == 0){
                start = 0;
            }
            else{
                start = 1;
            }
            for(int j=1; j<=i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows = 5;
        RightAngleTriangle obj = new RightAngleTriangle();
        obj.rightAngleTriangle(rows);
        obj.reverseRightAngleTriangle(rows);
        obj.reverseRightAngleNumbers(rows);
        obj.triangle(rows);
        obj.reverseTriangle(rows);
        obj.rightHalfDiamond(rows);
        obj.rightAngleBinary(rows);
    }
}



