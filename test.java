import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        double boy, kilo, vkindeksi ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (Metre cinsinden) Giriniz :");
        boy= inp.nextDouble();

        System.out.print("Lütfen Kilonuzu giriniz :");
        kilo=inp.nextDouble();

        vkindeksi = kilo / (boy * boy) ;
        System.out.print("Vücut Kitle İndeksiniz : " +vkindeksi);




}}



