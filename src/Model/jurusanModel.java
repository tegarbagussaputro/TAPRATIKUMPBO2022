package Model;

import Entity.jurusan;
import java.util.ArrayList;

public class jurusanModel implements ModelInterfaces{
    private static ArrayList<jurusan> Datajurusan;
    public ArrayList<jurusan> getDatajurusan;

    public jurusanModel(){
        Datajurusan = new ArrayList<>();
    }
    public static ArrayList<jurusan> getDatajurusan(){
        return Datajurusan;
    }
    @Override
    public void view(){

    }
    @Override
    public void insert(Object x){
        Datajurusan.add((jurusan) x);
    }
    @Override
    public void update(int index, Object x){
        Datajurusan.set(index ,(jurusan) x);
    }
    @Override
    public void delete(int index){
        Datajurusan.remove(index);
    }

    public void get_where(int index){
        Datajurusan.get(index);
    }
}
