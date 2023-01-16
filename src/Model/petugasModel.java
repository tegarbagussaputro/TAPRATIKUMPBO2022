package Model;

import Entity.petugasloket;
import java.util.ArrayList;

public class petugasModel implements ModelInterfaces {
    public ArrayList<petugasloket> DataPetugas;

    public petugasModel(){
        DataPetugas = new ArrayList<>();
    }
    public ArrayList<petugasloket> getDataPetugas(){
        return DataPetugas;
    }
    @Override
    public void view(){

    }
    @Override
    public void insert(Object x){
        DataPetugas.add((petugasloket) x);
    }
    @Override
    public void update(int index, Object x){
        DataPetugas.set(index ,(petugasloket) x);
    }
    @Override
    public void delete(int index){
        DataPetugas.remove(index);
    }
}
