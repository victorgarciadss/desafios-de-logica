import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int n;
        int k;

        n = sc.nextInt();
        k = sc.nextInt();

        System.out.print("\n");

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int equalK = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length -1; j >= 0; j--){
                if(arr[i] - arr[j] == k){
                    equalK++;
                }
            }
        }

        System.out.print("\n");

        System.out.println(equalK);

        sc.close();
        
        
    }
}
