public class HCF {
    public int findHcf(int num1, int num2){
        // Set<Integer> num1Set = new TreeSet<>();
        // Set<Integer> num2Set = new TreeSet<>();
        // for(int i=1; i<= num1; i++){
        //     if(num1 % i == 0){
        //         num1Set.add(i);
        //     }
        // }
        // for(int i=1; i<= num2; i++){
        //     if(num2 % i == 0){
        //         num2Set.add(i);
        //     }
        // }
        // Set<Integer> common = new TreeSet<>(num1Set);
        // common.retainAll(num2Set);
        // return Collections.max(common);
        int hcf = 1;
        for(int i=1; i<= num1; i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        HCF obj = new HCF();
        System.out.println(obj.findHcf(11, 110));
    }
}
