/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UjianBabPewarisan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Tampil {
    public static void main(String[] args) {
        Yayasan y=new Yayasan();
        Siswa s=new Siswa();
        Bulan bulan= new Bulan();
        Scanner scan=new Scanner(System.in);
        System.out.println("---Data Yayasan---");
        System.out.println("Nama Yayasan: "+y.namaYayasan);
        System.out.println("Status Yayasan: "+y.statusYayasan);
        System.out.println("Tahun Berdiri: "+y.tahunBerdiri);
                
        System.out.println("=========================================");
        System.out.println("---Data Siswa Prakerin---");
        System.out.print("Nama Siswa: ");
        String nama=scan.nextLine();
        System.out.print("Jenis Kelamin: ");
        String jk=scan.nextLine();
        System.out.print("Alamat: ");
        String alamat=scan.nextLine();
        System.out.print("Asal Sekolah: ");
        String asalSekolah=scan.nextLine();
        System.out.print("Kelas: ");
        String kelas=scan.nextLine();
        s.StatusPekerjaan();
        System.out.print("Tanggal Masuk Prakerin: ");
        int a=scan.nextInt();
        System.out.print("Bulan Masuk Prakerin: ");
        String inOut=scan.next();
        System.out.print("Tahun masuk prakerin: ");
        int tahun=scan.nextInt(); 
        System.out.print("Tanggal Keluar Prakerin: "+a+" "+Bulan.kalender(inOut)+" "+tahun);
    }

}