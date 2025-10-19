public class soal11 {
    
    static class Mahasiswa {
        private String nama;
        private int nilai;

        public Mahasiswa(String nama, int nilai) {
            this.nama = nama;
            this.nilai = nilai;
        }

        public String getNama() {
            return nama;
        }

        public int getNilai() {
            return nilai;
        }
    }

    public static void main(String[] args) {
        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("King Zaki", 95),
            new Mahasiswa("Prince Ardi", 85),
            new Mahasiswa("Ajudan Farrash", 60)
        };

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("Nama: " + m.getNama() + " - Nilai: " + m.getNilai());
        }

        Mahasiswa tertinggi = daftarMahasiswa[0];
        for (int i = 1; i < daftarMahasiswa.length; i++) {
            if (daftarMahasiswa[i].getNilai() > tertinggi.getNilai()) {
                tertinggi = daftarMahasiswa[i];
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi: " 
            + tertinggi.getNama() + " (" + tertinggi.getNilai() + ")");
    }
}
