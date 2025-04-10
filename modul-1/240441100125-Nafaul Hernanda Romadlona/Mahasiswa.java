import java.util.Scanner; // buat input dari user

public class Mahasiswa {
    // Atribut (ciri-ciri mahasiswa)
    String nama;
    String nim;
    String jurusan;
    String alamat;

    // Method untuk ngisi data dari user
    void setData(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Method untuk nampilin data
    void tampilkanData() {
        System.out.println("\n--- Data Mahasiswa ---");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Alamat   : " + alamat);
    }

    // main method: titik awal program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // buat inputan

        // Buat objek mahasiswa
        Mahasiswa mhs = new Mahasiswa();

        // Input data dari user
        System.out.print("Masukkan Nama    : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM     : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Jurusan : ");
        String jurusan = input.nextLine();
        System.out.print("Masukkan Alamat  : ");
        String alamat = input.nextLine();

        // Set data ke objek
        mhs.setData(nama, nim, jurusan, alamat);

        // Tampilkan hasilnya
        mhs.tampilkanData();
    }
}
