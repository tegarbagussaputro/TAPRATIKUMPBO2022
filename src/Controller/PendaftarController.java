package Controller;

import Entity.pendaftar;
import Model.pendaftarModel;
import java.util.ArrayList;

public class PendaftarController {
    public pendaftarModel pendaftar_m = new pendaftarModel();

    public PendaftarController(){

    }

    public ArrayList<pendaftar> view(){
        return pendaftar_m.getDatapendaftar();
    }

    public void insert(pendaftar pendaftar){
        pendaftar_m.insert(pendaftar);
    }

    public void delete(int index){
        pendaftar_m.delete(index);
    }

    public int cekpendaftar(String idpendaftar){
        int keterangan = -1;
        if(pendaftar_m.getDatapendaftar().size()>0){
            for(int i=0;i<pendaftar_m.getDatapendaftar().size();i++){
                if(idpendaftar.equals(pendaftar_m.getDatapendaftar().get(i).getNo_id())){
                    keterangan = i;
                    break;
                }else{
                    keterangan = -1;
                }
            }
        }
        return keterangan;
    }
    public pendaftar showDaftarAnggota(int index){
        return pendaftar_m.getDatapendaftar().get(index);
    }
}
