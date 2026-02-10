abstract class BidangDuaD {
    protected String nama;
    public BidangDuaD(String nama) {
        this.nama = nama;
    }
    public void info () {
        System.out.println("Bidang Dua Dimensi: " + nama);
    }
    public abstract double luas();
}