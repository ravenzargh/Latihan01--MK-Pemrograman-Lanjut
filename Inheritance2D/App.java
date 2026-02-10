public class App {
    public static void main(String[] args) {
        PersegiBS kotak = new PersegiBS("Persegi", 4.0);
        Lingkaran lingk = new Lingkaran("Lingkaran", 7.0);
        kotak.info();
        System.out.println("Luas: " + kotak.luas());

        lingk.info();
        System.out.println("Luas: " + lingk.luas());
    }
}