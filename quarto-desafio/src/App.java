import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int caseNumber;
        caseNumber = sc.nextInt();
        sc.nextLine();

        List<String> messagesList = new ArrayList<>();

        for(int i = 0; i < caseNumber; i++){
            String message = sc.nextLine();

            if(message.length() < 2 || message.length() > 100){
                System.out.println("Erro! O tamanho da string não é valido");
                sc.close();
                return;
            }

            messagesList.add(message);
        }

        for(String message: messagesList){
            String decipheredMessage = decryptMessage(message);
            System.out.println(decipheredMessage);
        }

        sc.close();
    }

    public static String decryptMessage(String message){
        int size = message.length();
        int middle = size / 2;

        StringBuilder decipheredMessage = new StringBuilder();

        for(int i = middle - 1; i >= 0; i--){
            decipheredMessage.append(message.charAt(i));
        }

        for(int i = size - 1; i >= middle; i--){
            decipheredMessage.append(message.charAt(i));
        }

        return decipheredMessage.toString();


    }
}
