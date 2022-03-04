/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UjianBabPewarisan;

/**
 *
 * @author WINDOWS 10
 */
public class Siswa extends Perusahaan {
    public String nama,jk,alamat,asalSekolah,kelas;
    public int tanggalInOut;
    //overriding
    @Override
    public void IdentitasSiswa(){
        System.out.println("Nama: "+nama);
        System.out.println("Jenis Kelamin: "+jk);
        System.out.println("Alamat: "+alamat);
        System.out.println("Asal Sekolah: "+asalSekolah);
        System.out.println("Kelas: "+kelas);
    }
    @Override
    public void StatusPekerjaan(){
        System.out.println("Prakerin di "+super.Tempat);
        System.out.println("Berstatus sebagai "+super.status);
}
    //overloading    
    public int InOut (int MasukPrakerin){
        this.tanggalInOut=MasukPrakerin;
        return tanggalInOut;
    }
    public void InOut (Double KeluarPrakerin){
        System.out.println("Keluar Prakerin: "+KeluarPrakerin);
    }
}
