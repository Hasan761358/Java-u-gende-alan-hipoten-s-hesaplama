import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hipotenüs, taban, yükseklik, hip;



        while (true){
            String options = "----1 Hipotenüs Bulma.\n" + "--- 2 Ücgenin alanını hesaplama";
            System.out.println(options);
            System.out.print("   Yapmak istediğiniz işlemi seçiniz(1-2) : ");
            options = scanner.nextLine();


            if (options.equals("1")) {

                System.out.print("   Yükseklik giriniz : ");
                yükseklik = scanner.nextInt();
                System.out.print("   Taban giriniz : ");
                taban = scanner.nextInt();
                hipotenüs = taban * taban + yükseklik * yükseklik;

                System.out.println("   Hipotenüs :  " + Math.sqrt(hipotenüs));
                break;

            } else if (options.equals("2")) {

                int a, b, alan;
                System.out.print(" Tabanı giriniz : ");
                a = scanner.nextInt();
                System.out.print(" Yüksekliği giriniz : ");
                b = scanner.nextInt();
                alan = (a*b)/2 ;
                System.out.print(" Üçgenin alanı = " + alan);
                break;

            }else {
                System.out.println(" Hatalı seçim yaptınız!!! Lütfen tekrar deneyin.");
            }


        }


    }
}