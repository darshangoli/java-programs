package Daily_Code.interview_prep;

public class PrintOnlyDupsInArray {
    int[] onlySups(int[] arr){
        int index = 0;
        int length = arr.length;
        int[] dups = new int[length];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    dups[index] = arr[i];
                    index++;
                }
            }
        }
        return dups;
    }
    public static void main(String[] args) {
        PrintOnlyDupsInArray obj = new PrintOnlyDupsInArray();
        int[] arr = {1,3,2,4,3,5,4,8};
        int[] result = obj.onlySups(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
