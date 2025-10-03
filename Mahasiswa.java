public class Mahasiswa extends Orang {
    public String nim;
    public String jurusan;
    private double ipk;

    public Mahasiswa(String nama, int umur, String alamat, String nim, String jurusan, double ipk) {
        super(nama, umur, alamat);
        this.nim = nim;
        this.jurusan = jurusan;
        setIpk(ipk);
    }

    public void setIpk(double ipk) {
        if (ipk >= 0 && ipk <= 4.0) this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public void belajar() {
        System.out.println("Mahasiswa " + nim + " sedang belajar di jurusan " + jurusan);
    }
}
