/*
 * To lchange this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_80;

/**
 *
 * @author ismailtasdelen
 */
public class newclass {
    private String bolumkodu;
    private String numarasi;
    private String kayityili;
    private static int ogrencisayisi=0;
    public String adsoyad;
    public String sinifi;
    public int [][]notlar = new int[8][2];
    public String []dersler = new String[8];
    public String get_bolumkodu()
    {
        return bolumkodu;
    }
    public String get_numarasi()
    {
        return numarasi;
    }
    public String kayityili()
    {
        return kayityili;
    }
    public int get_ogrencisayisi()
    {
        return ogrencisayisi;
    }
    public void set_bolumkodu(String bolumkodu)
    {
        this.bolumkodu = bolumkodu;
    }
    public void set_numarasi(String numarasi)
    {
        this.numarasi = numarasi;
    }
    public void set_kayityili(String kayityili)
    {
        this.kayityili = kayityili;
    }
    public newclass(String adsoyad, String bolumkodu)
    {
        this.bolumkodu = bolumkodu;
        this.adsoyad = adsoyad;
        ogrencisayisi++;
    }
    public newclass(String adsoyad)
    {
        this.adsoyad = adsoyad;
        ogrencisayisi++;
    }
    public newclass(String adsoyad, String kayityili, String sinifi)
    {
        this.adsoyad = adsoyad;
        this.sinifi = sinifi;
        this.kayityili = kayityili;
        ogrencisayisi++;
    }
    
}