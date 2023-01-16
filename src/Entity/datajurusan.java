package Entity;
import java.util.Date;

public class datajurusan {
    private pendaftar pendaftar;
    private jurusan jurusan;
    private int nojurusan;
    private Date tglmasuk;

    public datajurusan( pendaftar pendaftar,jurusan jurusan,int nojurusan,Date tglmasuk) {
        this.pendaftar=pendaftar;
        this.tglmasuk=tglmasuk;
        this.jurusan = jurusan;
        this.nojurusan = nojurusan;
        this.tglmasuk= tglmasuk;


    }

    public pendaftar getPendaftar() {
        return pendaftar;
    }

    public void setPendaftar(pendaftar pendaftar) {
        this.pendaftar = pendaftar;
    }

    public jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(jurusan jurusan) {
        this.jurusan = jurusan;
    }

    public int getNojurusan() {
        return nojurusan;
    }

    public void setNojurusan(int nojurusan) {
        this.nojurusan = nojurusan;
    }

    public Date getTglmasuk() {
        return tglmasuk;
    }

    public void setTglmasuk(Date tglmasuk) {
        this.tglmasuk = tglmasuk;
    }


}
