public class PersegiBS {
    String nama;
    Double sisi;

    public PersegiBS(String nama, Double sisi) {
        this.nama = nama;
        this.sisi = sisi;
    }
    public void info() {
        System.out.println("Bidang Dua Dimensi: " + nama);
    }
    public double luas() {
        return sisi * sisi;
    }
}
