import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        int minDegereYakin = 0;
        int maxDegereYakin = 0;

        Arrays.sort(list);                       // dizideki değerler küçükten büyüğe sıralandı.

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");       // Kullanıcıdan veri girmesi istendi.
        int sayi = input.nextInt();
        for (int i : list) {                     // Girilen değere en yakın büyük ve küçük sayı bulundu.
            if (i < sayi) {
                minDegereYakin = i;
            }
            if (i > sayi) {
                maxDegereYakin = i;
                break;                           // Break eklenmezse, döngü en byük sayıyı bulana kadar devam edecektir.
            }
        }

        //Bulunan değerler ekrana yazıldı.
        System.out.println("Minimum Değere Yakın Küçük Sayı " + minDegereYakin);
        System.out.println("Maximum Değere Yakın Büyük Sayı " + maxDegereYakin);

    }
}