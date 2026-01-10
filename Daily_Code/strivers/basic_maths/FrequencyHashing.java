package Daily_Code.strivers.basic_maths;

import java.util.Scanner;

public class FrequencyHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];
        for(int i=0; i<n; i++){
            hash[arr[i]]++;
        }
        System.out.println("Enter how many elements frequency you want:");
        int q = sc.nextInt();

        System.out.println("Enter the elements: ");
        while(q-- > 0){
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }

        sc.close();
    }
}



