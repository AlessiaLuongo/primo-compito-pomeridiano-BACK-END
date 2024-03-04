public class Esercizio3 {

    public static void main(String[] args) {
          System.out.println("Il perimetro è:" + perimetroRettangolo( + 5,3));
        System.out.println(pariDispari(10));
    }
    public static int perimetroRettangolo(int primoNumero, int secondoNumero){
        return (primoNumero + secondoNumero)*2;
    }
    public  static int pariDispari(int n1){
        if (n1 % 2 == 0) {
return 0;
        }else return 1;
    }
}
