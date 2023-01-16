package Controller;
import Entity.jurusan;
import Model.jurusanModel;
import java.util.ArrayList;

public class JurusanController {
    public jurusanModel jurusan_m = new jurusanModel();

    public JurusanController(){

    }
    public ArrayList<jurusan> view(){
        return jurusan_m.getDatajurusan();
    }

    public void insert(jurusan jurusan){
        jurusan_m.insert(jurusan);
    }

    public void update(int index,jurusan jurusan){
        jurusan_m.update(index,jurusan);
    }

    public void delete(int index){
        jurusan_m.delete(index);
    }

    public int cekjurusan(String idjurusan){
        int keterangan = -1;
        if(jurusan_m.getDatajurusan().size()>0){
            for(int i=0;i<jurusan_m.getDatajurusan().size();i++){
                if(idjurusan.equals(jurusan_m.getDatajurusan().get(i).getKodejurusan())){
                    keterangan = i;
                    break;
                }else{
                    keterangan = -1;
                }
            }
        }
        return keterangan;
    }
    public jurusan showDaftarjurusan(int index){
        return jurusan_m.getDatajurusan().get(index);
    }
}
