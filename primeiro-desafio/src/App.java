import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int numberOfEntries;
        
        numberOfEntries = sc.nextInt();
    
        int[] values = new int[numberOfEntries];
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        

        for(int i = 0; i < numberOfEntries; i++){
            values[i] = sc.nextInt();

            if(values[i] % 2 == 0){
                evenNumbers.add(values[i]);
            }
            else{
                oddNumbers.add(values[i]);
            }            
        }

        Collections.sort(evenNumbers);
        Collections.sort(oddNumbers, Collections.reverseOrder());

        List<Integer> sortedNumbers = new ArrayList<>(numberOfEntries);
        sortedNumbers.addAll(evenNumbers);
        sortedNumbers.addAll(oddNumbers);

        System.out.print("\n");

        for (Integer number : sortedNumbers) {
            System.out.println(number);
        }

        sc.close();
        
    }
}
