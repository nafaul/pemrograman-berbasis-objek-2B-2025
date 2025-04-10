public class Ikan {

    // Atribut
    String nama;
    String warna;
    int umur;

    // Metode untuk mengisi data ke atribut
    void setData(String n, String w, int u) {
        nama = n;
        warna = w;
        umur = u;
    }

    // Metode untuk menampilkan info
    void tampilkanInfo() {
        System.out.println("Nama Ikan : " + nama);
        System.out.println("Warna       : " + warna);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println(); // buat baris kosong biar rapi
    }

    // Main method
    public static void main(String[] args) {
        // Bikin objek kucing
        Ikan ikan1 = new Ikan();
        Ikan ikan2 = new Ikan();
        Ikan ikan3 = new Ikan();

        // Isi datanya
        ikan1.setData("Fish", "Oranye", 3);
        ikan2.setData("Ironn Fish", "Hitam", 2);
        ikan3.setData("Golden Fish", "Putih", 4);

        // Loop untuk menampilkan data (loop biasa tanpa array)
        for (int i = 1; i <= 3; i++) {
            System.out.println("=== Data Kucing ke-" + i + " ===");

            if (i == 1) {
                ikan1.tampilkanInfo();
            } else if (i == 2) {
                ikan2.tampilkanInfo();
            } else if (i == 3) {
                ikan3.tampilkanInfo();
            }
        }
    }
}
