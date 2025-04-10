package dosen;

public class Dosen {
    public String nama;
    public String NIDN;

    public Dosen (String nama, String NIDN) {
        this.nama = nama;
        this.NIDN = NIDN;
    }

    public String getNama() {
        return nama;
    }
    
    public String getNIDN() {
        return NIDN;
    }
}
