public class Dosen extends Orang {
    public String nidn;
    public String prodi;

    public Dosen(String nama, int umur, String alamat, String nidn, String prodi) {
        super(nama, umur, alamat);
        this.nidn = nidn;
        this.prodi = prodi;
    }

    public void mengajar() {
        System.out.println("Dosen " + nidn + " sedang mengajar di prodi " + prodi);
    }
}
