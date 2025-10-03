public class MainHierarkis {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa("Budi", 20, "Bandung", "12345", "Informatika", 3.5);
        m.perkenalan();
        m.belajar();

        Dosen d = new Dosen("Pak Andi", 45, "Jakarta", "67890", "Informatika");
        d.perkenalan();
        d.mengajar();
    }
}
