public class RmvDupsFrmSrtdArr {
    void removeDups(int[] sortArr){
        int[] anoArr = new int[sortArr.length];
        int index = 0;
        anoArr[index++] = sortArr[0];
        for(int i=1; i<sortArr.length; i++){
            if(sortArr[i-1] != sortArr[i]){
                anoArr[index++] = sortArr[i];
            }
        }
        for(int i=0; i<index; i++){
            System.out.print(anoArr[i]+" ");
        }
    }
    public static void main(String[] args) {
        RmvDupsFrmSrtdArr obj = new RmvDupsFrmSrtdArr();
        int[] sortArr = {2,3,3,4,5,5,7,8,9,9};
        obj.removeDups(sortArr);
    }
}
