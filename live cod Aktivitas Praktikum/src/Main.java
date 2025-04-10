import dosen.Dosen;
import java.util.ArrayList;
import mahasiswa.Mahasiswa;
import matakuliah.Matakuliah;

public class Main {

    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Budi", "123456");
        Dosen dosen2 = new Dosen("Cahya", "654321");

        
        Mahasiswa mhs1 = new Mahasiswa("Tiara", "001", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Diana", "002", "Informatika");

        
        ArrayList<Dosen> daftarPengampu = new ArrayList<>();
        daftarPengampu.add(dosen1);
        daftarPengampu.add(dosen2);

    
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(mhs1);
        daftarMahasiswa.add(mhs2);

        
        Matakuliah mk1 = new Matakuliah("PBO", "CS101");
        Matakuliah mk2 = new Matakuliah("Kompar", "CS102");
        Matakuliah mk3 = new Matakuliah("Metnum", "CS103");
        mk1.setPengampu(daftarPengampu);
        mk1.setDaftarMahasiswa(daftarMahasiswa);

        
        tampilkanData(mk1);
    }

    public static void tampilkanData(Matakuliah matakuliah) {
        System.out.println("Mata Kuliah: " + matakuliah.getNama());
        System.out.println("Kode MK   : " + matakuliah.getKodeMK());

        System.out.println("\nPengampu:");
        for (Dosen d : matakuliah.getPengampu()) {
            System.out.println("- " + d.getNama() + ", NIDN: " + d.getNIDN());
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa m : matakuliah.getDaftarMahasiswa()) {
            System.out.println("- " + m.getNama() + ", NIM: " + m.getNIM());
        }
    }
}