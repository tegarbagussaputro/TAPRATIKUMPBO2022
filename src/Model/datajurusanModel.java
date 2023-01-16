package Model;

import Entity.datajurusan;
import java.util.ArrayList;

public class datajurusanModel {
    private ArrayList<datajurusan> Datajurusan;

    public datajurusanModel(){
        Datajurusan = new ArrayList<>();
    }

    public ArrayList<datajurusan> getDatajurusan(){
        return Datajurusan;
    }

    public void insertDatajurusan(datajurusan datajurusan){
        Datajurusan.add(datajurusan);
    }
}
