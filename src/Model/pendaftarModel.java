package Model;

import Entity.jurusan;
import Entity.pendaftar;
import java.util.ArrayList;

public class pendaftarModel implements ModelInterfaces{
    private static ArrayList<pendaftar> Datapendaftar;
    public ArrayList<pendaftar> getDatapendaftar;
    public pendaftarModel(){
        Datapendaftar = new ArrayList<>();
    }
    public static ArrayList<pendaftar> getDatapendaftar(){
        return Datapendaftar;
    }
    @Override
    public void view(){

    }
    @Override
    public void insert(Object x){
        Datapendaftar.add((pendaftar) x);
    }
    @Override
    public void update(int index, Object x){
        Datapendaftar.set(index ,(pendaftar) x);
    }
    @Override
    public void delete(int index){
        Datapendaftar.remove(index);
    }

    public void get_where(int index){
        Datapendaftar.get(index);
    }


}
