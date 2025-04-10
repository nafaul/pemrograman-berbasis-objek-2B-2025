public class Manusia {
    String nama;
    String alamat;
    int umur;


    void setManusia(String x, String y,int z) {
        nama = x;
        alamat = y;
        umur = z;
    
    }
    
    void berjalan(){
        System.out.println(nama + " sedang berjalan");

    }
    void berlari(){
        System.out.println(nama + " sedang berlari");
    }
    public static void main(String[]args){
        Manusia makhluk1 = new Manusia();
        Manusia makhluk2 = new Manusia();
        Manusia makhluk3 = new Manusia();
        Manusia makhluk4 = new Manusia ();
        Manusia makhluk5 = new Manusia();
        makhluk1.setManusia("Zaki","Pati",18);
        makhluk2.setManusia("Aldi","Semarang",20);
        makhluk3.setManusia("Aldo", "Kudus", 30);
        makhluk4.setManusia("Fadil", "Demak", 21);
        makhluk5.setManusia("Mia", "Jepara", 22);
        makhluk1.berjalan();
        makhluk2.berlari();
        makhluk3.berjalan();
        makhluk4.berlari();
        makhluk5.berjalan();
        
        
    }
}    