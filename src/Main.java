import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar, kdv = 0.18, kdvTutari, kdvliTutar;


        Scanner input = new Scanner(System.in);

        System.out.print("Ücreti giriniz: ");
        tutar = input.nextDouble();

        kdvTutari = (tutar * kdv);
        kdvliTutar = (tutar + kdvTutari);

        System.out.println("KDVsiz tutar: " + tutar + " tl");
        System.out.println("KDVli tutar: " + kdvliTutar + " tl");
        System.out.println("KDV tutarı:" + kdvTutari+ " tl");
    }
}