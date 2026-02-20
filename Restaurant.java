public class Restaurant{
    private String[] namaMakanan;
    private Double[] hargaMakanan;
    private int[] stok;
    private int id = 0;
    
    public Restaurant(){
        namaMakanan = new String[10];
        hargaMakanan = new Double[10];
        stok = new int[10];
    }
    
    //Getter untuk mengambil data 
    public String[] getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String[] namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public Double[] getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(Double[] hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public int[] getStok() {
        return stok;
    }

    public void setStok(int[] stok) {
        this.stok = stok;
    }

    public void tambahMenuMakanan(String nama, double harga, int stok){
        if(stok < 0){
            System.out.println("Stok tidak boleh negatif!");
            return;
        }

        this.namaMakanan[id]= nama;
        this.hargaMakanan[id]= harga;
        this.stok[id]= stok;
        id++;
    }

    public void tampilMenuMakanan(){
        for (int i = 0; i <= id; i++){
            if(stok[i]> 0){
                System.out.println(
                    namaMakanan[i] + "\tRp." + hargaMakanan[i]
                );
            }
        }
    }

    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        } else{
            return false;
        }
    }

    public void pemesananMenu(String namaMenu, int jumlah){
        for (int i = 0; i < id; i++){

            if(namaMakanan[i].equalsIgnoreCase(namaMenu)){
                if (jumlah <= 0) {
                    System.out.println("jumlah pesanan tidak valid!");
                    return;
                }

                if (stok[i] >= jumlah){
                    stok[i] -= jumlah;
                    double total = hargaMakanan[i] * jumlah;

                    System.out.println("pesanan berhasil!");
                    System.out.println("Total bayar: Rp." + total);
                    System.out.println("Sisa stok: " + stok[i]);
                }else{
                    System.out.println("pesanan ditolak! Stok tidak mencukupi.");
                }
                return;
            }
        }
        System.out.println("Menu tidak ditemukan");
    }

}