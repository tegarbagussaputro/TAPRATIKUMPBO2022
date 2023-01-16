package Controller;

import Model.petugasModel;
import Entity.petugasloket;
import java.util.ArrayList;

public class PetugasloketController {
    public petugasModel petugas_m = new petugasModel();

    public PetugasloketController(){

    }

    public ArrayList<petugasloket> view(){
        return petugas_m.getDataPetugas();
    }

    public void insert(petugasloket petugas){
        petugas_m.insert(petugas);
    }

    public void update(int index, petugasloket petugas){
        petugas_m.update(index, petugas);
    }

    public void delete(int index){
        petugas_m.delete(index);
    }

    public void dataPetugas(){
        String no_id [] = {"001"};
        String nama [] = {"tegar"};
        String alamat [] = {"Surabaya"};
        String password [] = {"123"};

        for(int i = 0; i<nama.length; i++){
            petugas_m.insert(new petugasloket(no_id[i],nama[i],alamat[i],password[i]));
        }
    }
}

