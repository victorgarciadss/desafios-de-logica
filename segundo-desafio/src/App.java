
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double monetaryValue;
        double[] monetaryValueNote = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        double[] monetaryValueCoin = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        monetaryValue = sc.nextDouble();

        if(monetaryValue < 0 || monetaryValue > 1000000){
            System.out.println("Valor inválido");
            sc.close();
            return;
        }

        System.out.println("NOTAS:");

        for(int i = 0; i < monetaryValueNote.length; i++){
            int quantityNote = (int) (monetaryValue / monetaryValueNote[i]);
            
            System.out.println(
                quantityNote + " Nota(s) de R$ " + String.format("%.2f", monetaryValueNote[i])
            );

            monetaryValue %= monetaryValueNote[i];
        }

        System.out.println("MOEDAS: ");
        for(int i = 0; i < monetaryValueCoin.length; i++){
            int quantityCoin = (int) (monetaryValue / monetaryValueCoin[i]);

            System.out.println(
                quantityCoin + " Moeda(s) de R$ " + String.format("%.2f", monetaryValueCoin[i])
            );

            monetaryValue %= monetaryValueCoin[i];
            
        }

        sc.close();

        

    }
}
