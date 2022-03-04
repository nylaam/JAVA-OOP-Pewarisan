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
public class Bulan {
    public static String kalender (String a){
      String bulan[] = {"Januari","Februari","Maret","April","Mei","Juni","Juli",
          "Agustus","September","Oktober","November","Desember"};
      String b=a;
      int c=0;
      switch(b){
          case "Januari":
              c=1;
              break;
          case "Februari":
              c=2;
              break;
          case "Maret":
              c=3;
              break;
          case "April":
              c=4;
              break;
          case "Mei":
              c=5;
              break;
          case "Juni":
              c=6;
              break;
          case "Juli":
              c=7;
              break;
          case "Agustus":
              c=8;
              break;
          case "September":
              c=9;
              break;
          case "Oktober":
              c=10;
              break;
          case "November":
              c=11;
              break;
          case "Desember":
              c=12;
              break;
      }
   int d=c+5;
       return bulan[d];
       
   } 
}
