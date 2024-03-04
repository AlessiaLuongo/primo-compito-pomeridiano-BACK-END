import java.util.Scanner;

public class Esercizio2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Caro utente, per favore inserisci il tuo nome, cognome e città in cui vivi in seguito dal tasto invio")
            ;
            String risposta1 = scanner.nextLine();
            String risposta2 = scanner.nextLine();
            String risposta3 = scanner.nextLine();

            System.out.println(risposta1 + " " + risposta2 + " " +  risposta3);
            System.out.println(risposta3 + " " + risposta2 + " " +  risposta1);
            scanner.close();
        }


}
