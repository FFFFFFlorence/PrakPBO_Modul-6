package matakuliah;
import dosen.Dosen;
import java.util.ArrayList;
import mahasiswa.Mahasiswa;

public class Matakuliah {
    private String nama;
    private String kodeMK;
    private ArrayList<Dosen> pengampu;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public Matakuliah(String nama, String kodeMK) {
        this.nama = nama;
        this.kodeMK = kodeMK;
    }

    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public String getNama() {
        return nama;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public void setPengampu(ArrayList<Dosen> pengampu) {
        this.pengampu = pengampu;
    }

    public ArrayList<Dosen> getPengampu() {
        return pengampu;
    }
}
