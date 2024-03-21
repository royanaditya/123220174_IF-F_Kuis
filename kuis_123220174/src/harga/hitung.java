/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harga;

/**
 *
 * @author Lab Informatika
 */
public class hitung implements operasi{
    private double jumlah,kategori;
    
    public hitung (double jumlah,kategori){
        this.jumlah = jumlah;
        this.kategori = kategori;       
    }

   
    public double getJumlah (){
        return jumlah;
    }
    public void setJumlah (double jumlah){
        this.jumlah = jumlah;
    }
    public double getKategori (){
        return kategori;
    }
    public void setkategori (double kategori){
        this.kategori = kategori;
    }
     @Override
    public double hitung() {
        return jumlah * kategori;
    }
}
