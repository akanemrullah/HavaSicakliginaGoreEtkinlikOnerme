import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degisken tanimlandi.
        int heat;

        // Scanner sinifina ait bir degisken tanimlandi.
        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik degeri giriniz: ");

        // Kullanicidan aldigimiz girdi ilgili degiskene atandi.
        heat = input.nextInt();

        // Mantiksal kontroller saglanip kullaniciya cikti verildi.
        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        if (heat > 25){
            System.out.println("Yuzmeye gidebilirsiniz.");
        }
        if(heat >= 5 && heat <= 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (heat >= 15 && heat <= 25){
            System.out.println("Piknik yapabilirsiniz.");
        }
    }
}