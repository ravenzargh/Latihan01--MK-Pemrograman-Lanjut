class Lingkaran {
    String nama;
    double jariJari;

    public Lingkaran(String nama, double jariJari) {
        this.nama = nama;
        this.jariJari = jariJari;
    }

    public void info() {
        System.out.println("Nama Bidang: " + nama);
    }

    public double luas() {
        return 3.14 * jariJari * jariJari;
    }
}