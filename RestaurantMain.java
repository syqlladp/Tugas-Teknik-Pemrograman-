import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 20);
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);

        menu.tampilMenuMakanan();

        String lanjut;

        do{
            System.out.print("\nMasukkan nama menu yang ingin dipesan: ");
            String nama = input.nextLine();

            System.out.print("Masukkan jumlah pesanan: ");
            int jumlah = input.nextInt();
            input.nextLine();

            menu.pemesananMenu(nama, jumlah);

            System.out.println("\n=== MENU SETELAH PEMESANAN ===");
            menu.tampilMenuMakanan();

            System.out.print("\nIngin pesan lagi? (ya/tidak): ");
            lanjut = input.nextLine();

        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("Terimakasih!");
        input.close();
    }
    
}
