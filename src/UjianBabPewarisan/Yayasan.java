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
public class Yayasan extends Perusahaan{
    String namaYayasan="Yayasan Pendidikan Telkom ";
    String statusYayasan=" Swasta ";
    int tahunBerdiri=1990;
    //overriding
    @Override
    public void IdentitasYayasan(){
        System.out.println("Nama Yayasan: "+namaYayasan);
        System.out.println("Status: "+statusYayasan);
        System.out.println("Tahun Berdiri: "+tahunBerdiri);
    }
}
    
