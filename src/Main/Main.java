package Main;

import Controller.*;
import Entity.datajurusan;
import Entity.jurusan;
import Entity.pendaftar;
import Model.jurusanModel;
import Model.pendaftarModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    public PendaftarController pendaftar = new PendaftarController();
    public JurusanController jurusan = new JurusanController();
    public PetugasloketController petugas = new PetugasloketController();

    public static void main(String args[]) {
        Scanner input1 = new Scanner(System.in);
        Main main = new Main();
        main.petugas.dataPetugas();
        System.out.println("SELAMAT DATANG DI KAMPUS MERDEKA !! ");

        int pil;
        do{
            System.out.println("\n"
                    +"1. Login petugas"+"\n"
                    +"0. Exit"+"\n"
                    +"Pilih : ");
            pil = input1.nextInt();

            switch(pil){
                case 1:

                    System.out.print("No.Id Petugas = ");
                    String id = input1.next();
                    System.out.print("Password = ");
                    String password = input1.next();
                    main.login(id,password);
            }

        }while(pil != 0);
    }

    void login(String id, String password){
        boolean cekLogin = false;
        int i;
        for(i=0;i<petugas.petugas_m.getDataPetugas().size();i++){
            //mengecek pass & id
            try{
                if(id.equals(petugas.petugas_m.getDataPetugas().get(i).getNo_id()) &&
                        password.equals(petugas.petugas_m.getDataPetugas().get(i).getPassword())){
                    cekLogin = true;
                    break;
                }
            }catch(Exception e){
                cekLogin = false;
            }
        }

        if(cekLogin){
            System.out.println("\n"+"Hallo "+petugas.petugas_m.getDataPetugas().get(i).
                    getNama()+" Selamat Datang di Kampus merdeka!!");
            menuUtama();
        }else{
            System.out.println("Maaf Password atau ID SALAH!!");
        }
    }
    //======================= MENU UTAMA =======================
    void menuUtama(){
        int pilih;
        do{
            System.out.println("\n"
                    +" == Menu Utama == "+"\n"
                    +"1. Data Jurusan"+"\n"
                    +"2. Data Pendaftar"+"\n"
                    +"3. Data berkas"+"\n"
                    +"0.Exit"+"\n"
                    +"Pilih : ");
            pilih = input.nextInt();

            switch(pilih){
                case 1:
                    menuJurusan();
                    break;
                case 2:
                    menuPendaftar();
                    break;
                case 3:
                    databerkas();
                    break;
            }
        }while(pilih != 0);
    }

    //======================= MENU BUKU =======================
    void menuJurusan(){
        int pilihan;
        do{
            System.out.println("\n"
                    +"===== MENU Buku ====="+"\n"
                    +"1. Tambah jurusan"+"\n"
                    +"2. Lihat jurusan"+"\n"
                    +"3. Ubah Data jurusan"+"\n"
                    +"4. Hapus jurusan"+"\n"
                    +"0. Keluar"+"\n"
                    +"Pilih : ");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1 :
                    insert();
                    break;
                case 2 :
                    view();
                    break;
                case 3 :
                    update();
                    break;
                case 4 :
                    delete();
                    break;
            }
        }while(pilihan != 0);
    }

    void view(){
        if(jurusan.jurusan_m.getDatajurusan().size()>0){
            int noUrut = 0;
            for (int i = 0; i < jurusan.jurusan_m.getDatajurusan().size(); i++) {
                noUrut++;
                System.out.println("\n"
                        +"[jurusan " + noUrut + "]"+"\n"
                        +"Kode jurusan              : "+jurusan.jurusan_m.getDatajurusan().get(i).getKodejurusan()+"\n"
                        +"Nama jurusan              : "+jurusan.jurusan_m.getDatajurusan().get(i).getJuduljurusan()+"\n"
                        +"Dosen wali                : "+jurusan.jurusan_m.getDatajurusan().get(i).getWalidosen()+"\n"
                        +"Tahun jurusan             : "+jurusan.jurusan_m.getDatajurusan().get(i).getTahunjurusan()+"\n"
                        +"Batas jumlah mahasiswa    : "+jurusan.jurusan_m.getDatajurusan().get(i).getJumlah());
            }
        }else{
            System.out.println("Data jurusan Kosong!!");
        }
    }
    void insert() {

        System.out.println("Masukkan Kode jurusan :  ");
        String Kodejurusan = input.next();

        System.out.println("Masukkan Judul jurusan : ");
        String Juduljurusan = input.next();

        System.out.println("Masukkan Nama walidosen : ");
        String walidosen = input.next();

        System.out.println("Masukkan Tahun jurusan : ");
        String Tahunjurusan = input.next();

        System.out.println("Jumlah mahasiswa : ");
        int Jumlah = input.nextInt();

        jurusan.insert(new jurusan(Kodejurusan,Juduljurusan, walidosen, Tahunjurusan, Jumlah));
        System.out.println("Data jurusan Berhasil Disimpan !!\n");
    }

    void update() {
        if(jurusan.jurusan_m.getDatajurusan().size()>0){
            for (int i = 0; i < jurusan.jurusan_m.getDatajurusan().size(); i++) {
                System.out.println("["+i+"] "+jurusan.jurusan_m.getDatajurusan().get(i).getJuduljurusan());
            }

            System.out.println("Pilih Index jurusan : ");
            int selectIndex = input.nextInt();

            System.out.println("Masukkan Kode jurusan : ");
            String Kodejurusan = input.next();

            System.out.println("Masukkan Nama jurusan : ");
            String Juduljurusan = input.next();

            System.out.println("Masukkan Walidosen : ");
            String walidosen = input.next();

            System.out.println("Masukkan Tahun jurusan : ");
            String Tahunjurusan = input.next();

            System.out.println("Jumlah mahasiswa jurusan : ");
            int Jumlah = input.nextInt();

            jurusan.update(selectIndex, new jurusan(Kodejurusan, Juduljurusan,
                    walidosen, Tahunjurusan, Jumlah));
            System.out.println("Data jurusan Berhasil Diubah !!\n");
        }else{
            System.out.println("Data jurusan Kosong\n");
        }
    }

    void delete() {
        if(jurusan.jurusan_m.getDatajurusan().size()>0){
            for (int i = 0; i < jurusan.jurusan_m.getDatajurusan().size(); i++) {
                System.out.println("["+i+"] "+jurusan.jurusan_m.getDatajurusan().get(i).getJuduljurusan());
            }

            System.out.println("Pilih Index jurusan : ");
            int selectIndex = input.nextInt();

            jurusan.jurusan_m.getDatajurusan().remove(selectIndex);
            System.out.print("Data jurusan Berhasil Dihapus !!\n");
        }else{
            System.out.println("Data jurusan Kosong\n");
        }
    }

    //======================= MENU ANGGOTA =======================
    void menuPendaftar(){
        int pilihan;
        do{
            System.out.println("");
            System.out.println("===== MENU Pendaftar =====");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Mahasiswa");
            System.out.println("3. Hapus Hapus Mahasiswa");
            System.out.println("0. Keluar");
            System.out.println("Pilih : ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1 :
                    insertpendaftar();
                    break;
                case 2 :
                    viewpendaftar();
                    break;
                case 3 :
                    deletependaftar();
                    break;

            }
        }while(pilihan!=0);
    }

    void insertpendaftar(){

        System.out.println("Masukkan No ID :  ");
        String no_id = input.next();

        System.out.println("Masukkan Nama : ");
        String nama = input.next();

        System.out.println("Masukkan Alamat : ");
        String alamat = input.next();

        System.out.println("Masukkan Telepon : ");
        String no_telp = input.next();

        pendaftar.insert(new pendaftar(no_id, nama, alamat, no_telp));
        System.out.println("Data pendaftar Berhasil Disimpan !!\n");
    }

    void viewpendaftar(){
        if(pendaftar.pendaftar_m.getDatapendaftar().size()>0){
            int noUrut = 0;
            for (int i = 0; i < pendaftar.pendaftar_m.getDatapendaftar().size(); i++) {
                noUrut++;
                System.out.println("\n"
                        +"[Pendaftar " + noUrut + "]" + "\n"
                        +"No ID      : "+pendaftar.pendaftar_m.getDatapendaftar().get(i).getNo_id()+ "\n"
                        +"Nama       : "+pendaftar.pendaftar_m.getDatapendaftar().get(i).getNama()+ "\n"
                        +"Alamat     : "+pendaftar.pendaftar_m.getDatapendaftar().get(i).getAlamat()+ "\n"
                        +"No Telepon : "+pendaftar.pendaftar_m.getDatapendaftar().get(i).getNo_Telp());
            }
        }else{
            System.out.println("Data Kosong!!");
        }
    }

    void deletependaftar(){
        if(pendaftar.pendaftar_m.getDatapendaftar().size()>0){
            for (int i = 0; i < pendaftar.pendaftar_m.getDatapendaftar().size(); i++) {
                System.out.println("["+i+"] "+pendaftar.pendaftar_m.getDatapendaftar().get(i).getNama());
            }

            System.out.println("Pilih Index Nama : ");
            int selectIndex = input.nextInt();

            pendaftar.pendaftar_m.getDatapendaftar().remove(selectIndex);
            System.out.print("Data Anggota Berhasil Dihapus !!\n");
        }else{
            System.out.println("Data Anggota Kosong\n");
        }
    }
    //======================= MENU PEMINJAMAN =======================
    void databerkas(){
        int pilihan;
        do{
            System.out.println("\n"
                    +"===== MENU BERKAS ====="+ "\n"
                    +"1. BERKAS MAHASISWA"+ "\n"
                    +"2. List Mahasiswa"+ "\n"
                    +"0. Keluar"+ "\n"
                    +"Pilih : ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1 :
                    berkasmahasiswa();
                    break;
                case 2 :
                    viewberkas();
                    break;
            }
        }while(pilihan!=0);
    }

    void berkasmahasiswa(){
        if(pendaftar.pendaftar_m.getDatapendaftar().size()>0 && jurusan.jurusan_m.getDatajurusan().size()>0){
            String Kodependaftar;
            String Kodejurusan;
            String pilih="";

        System.out.print("Masukkan kode pendaftar = ");
            Kodependaftar = input.next();
            int indexpendaftar= pendaftar.cekpendaftar(Kodependaftar);
            pendaftar.cekpendaftar(Kodependaftar);
            if(pendaftar.cekpendaftar(Kodependaftar) == -1){
                System.out.println("Data Tidak Ada");
            }else{
                do{
                    System.out.print("Masukkan kode jurusan = ");
                    Kodejurusan = input.next();
                    int indexjurusan = jurusan.cekjurusan(Kodejurusan);

                    if(jurusan.cekjurusan(Kodejurusan) == -1){
                        System.out.print("Kode Tersebut Tidak Ada"+"\n"+
                                "Memilih kode jurusan lagi? (y/t)");
                        pilih = input.next();
                    }
                    else{
                        System.out.println("\n ***** Berkas ***** ");
                        System.out.println("Judul jurusan : "+jurusan.showDaftarjurusan(indexjurusan).getJuduljurusan());
                        //output lengkap
                        System.out.println("Nama pendaftar : "+pendaftar.showDaftarAnggota(indexpendaftar).getNama());

                    }
                }while(pilih == "y");
                //if, jika cek kode bku != -1 ==> isi menginputkan tanggan dan jumlah, lalu simpan/tidak
            }
        }
        else{
            System.out.println("Data Anggota atau Buku Kosong");
        }
    }


    void viewberkas(){
        ArrayList<jurusan> view = jurusanModel.getDatajurusan();
        ArrayList<pendaftar> pdf = pendaftarModel.getDatapendaftar();
        try{
        for (int i = 0; i < view.size(); i++) {
            System.out.println(view.get(i).getJuduljurusan());
            System.out.println(pdf.get(i).getNama());
        }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("error bos ");
        }
    }
}
