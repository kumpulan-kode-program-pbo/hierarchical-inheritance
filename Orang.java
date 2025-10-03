public class Orang {
    public String nama;
    public int umur;
    private String alamat;

    public Orang(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public void perkenalan() {
        System.out.println("Halo, saya " + nama + " umur " + umur + " dari " + alamat);
    }
}
