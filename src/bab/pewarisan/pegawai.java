/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab.pewarisan;

/**
 *
 * @author WINDOWS 10
 */
public class pegawai extends Perusahaan{
    public String nama, jk;
    public int nomorPegawai;
    public int pendapatanGaji;
    //overriding
    @Override
    public void identitasPegawai(){
        System.out.println("Nama: "+nama);
        System.out.println("Jenis Kelamin: "+jk);
        System.out.println("Nomor Pegawai: "+nomorPegawai);
    }
    public void BagianPekerjaan(){
        System.out.println("Bekerja dibagian "+super.bidang);
    }
    //overloading
    public int Cekgaji(int PendapatanGaji){
        this.pendapatanGaji=PendapatanGaji;
        return pendapatanGaji;
    }
    
    public void Cekgaji (double pendapatanMaksimal){
        System.out.println("Gaji maksimal: "+pendapatanMaksimal);
   }
}

