package Controller;

import Entity.datajurusan;
import Model.datajurusanModel;
import java.util.ArrayList;

public class DatajurusanController {
    datajurusanModel datajurusan_m  = new datajurusanModel();

    public DatajurusanController(){

    }
    public ArrayList<datajurusan> view(){
        return datajurusan_m.getDatajurusan();
    }
}
