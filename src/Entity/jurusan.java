package Entity;

public class jurusan {
    private String kode_jurusan, judul_jurusan, walidosen, tahun_jurusan;
    private int jumlah;

    public jurusan(String kode_jurusan, String judul_jurusan, String walidosen,
                          String tahun_jurusan, int jumlah){
        this.kode_jurusan = kode_jurusan;
        this.judul_jurusan = judul_jurusan;
        this.walidosen = walidosen;
        this.tahun_jurusan = tahun_jurusan;
        this.jumlah=jumlah;
    }

    public void setKode_jurusan(String kode_jurusan) {
        this.kode_jurusan = kode_jurusan;
    }

    public void setJudul_jurusan(String judul_jurusan) {
        this.judul_jurusan = judul_jurusan;
    }

    public void setWalidosen(String walidosen) {
        this.walidosen = walidosen;
    }

    public void setTahun_jurusan(String tahun_jurusan) {
        this.tahun_jurusan = tahun_jurusan;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public jurusan(){

    }

    public String getKodejurusan(){
        return this.kode_jurusan;
    }

    public String getJuduljurusan(){
        return this.judul_jurusan;
    }

    public String getWalidosen(){
        return this.walidosen;
    }

    public String getTahunjurusan(){
        return this.tahun_jurusan;
    }

    public int getJumlah(){
        return this.jumlah;
    }
}
