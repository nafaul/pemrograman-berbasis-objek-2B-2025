public class Burung {

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
        System.out.println("Nama Burung : " + nama);
        System.out.println("Warna       : " + warna);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println(); // buat baris kosong biar rapi
    }

    // Main method
    public static void main(String[] args) {
        // Bikin objek kucing
        Burung b1 = new Burung();
        Burung b2 = new Burung();
        Burung b3 = new Burung();

        // Isi datanya
        b1.setData("Phoenix", "Oranye", 3);
        b2.setData("coackroach", "Hitam", 2);
        b3.setData("Bird", "Putih", 4);

        // Loop untuk menampilkan data (loop biasa tanpa array)
        for (int i = 1; i <= 3; i++) {
            System.out.println("=== Data Burung ke-" + i + " ===");

            if (i == 1) {
                b1.tampilkanInfo();
            } else if (i == 2) {
                b2.tampilkanInfo();
            } else if (i == 3) {
                b3.tampilkanInfo();
            }
        }
    }
}
