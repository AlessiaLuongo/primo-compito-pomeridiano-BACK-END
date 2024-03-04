import java.sql.Array;
import java.util.Arrays;

public class Esercizio1 {
    public static String[] arrayEbasta = {"Ciao", "Ciao","Ciao","Ciao","Ciao"};
    public static void main(String[] args) {

        System.out.println(moltiplicazioneTraDueInteri(3,3));
        System.out.println(concatenaStringEnumero("ciao", 5));
        System.out.println(inserisciInArray(arrayEbasta, "Un altro ciao"));
    } public static int moltiplicazioneTraDueInteri(int primoNumero, int secondoNumero){
        return primoNumero*secondoNumero;
    }
    public static String concatenaStringEnumero(String stringa, int numero){
        return stringa.concat(String.valueOf(numero));
    }
    public static String[] inserisciInArray(String[] arrayDiStringhe, String elementoDaInserire){
        String[] nuovoArrayDiSeiElementi = new String[6];
        for (int i = 0; i < nuovoArrayDiSeiElementi.length; i++) {
            nuovoArrayDiSeiElementi[i]  = arrayDiStringhe[i];
            if (i == 2) {
              nuovoArrayDiSeiElementi[i] = elementoDaInserire;
               i++;
            }

        }return nuovoArrayDiSeiElementi;
    }
}
