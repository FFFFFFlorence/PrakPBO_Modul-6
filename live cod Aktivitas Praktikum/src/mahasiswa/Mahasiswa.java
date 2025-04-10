package mahasiswa;

public class Mahasiswa {
    public String nama;
    public String NIM;

    public Mahasiswa (String nama, String NIM, String prodi) {
        this.nama = nama;
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }
    
    public String getNIM() {
        return NIM;
    }
}
