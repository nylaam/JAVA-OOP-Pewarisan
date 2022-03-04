/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab.pewarisan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class tampil {
    public static void main(String[] args) {
        pegawai p= new pegawai();
        Scanner scan=new Scanner(System.in);
        System.out.println("---Identitas pegawai PT Indosiar---");
        System.out.print("Nama Pegawai: ");
        String nama=scan.nextLine();
        System.out.print("Jenis Kelamin: ");
        String jk=scan.nextLine();
        System.out.print("Nomor pegawai: ");
        int nomorPegawai=scan.nextInt();
        p.BagianPekerjaan();
        System.out.println("Gaji yang didapatkan: "+p.Cekgaji(1200000));
        System.out.println("Gaji yang didapatkan jika kinerja baik: "+p.Cekgaji(1200000)*2);
        
         
       
    }
}
