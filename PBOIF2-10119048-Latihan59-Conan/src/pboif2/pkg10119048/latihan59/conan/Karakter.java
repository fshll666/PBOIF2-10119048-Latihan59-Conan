/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan59.conan;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Berisi Program Karakter
 */
public class Karakter extends Detective{
    private String keahlian;

    public Karakter(String nama, String asal, boolean detective, String keahlian) {
        super(nama, asal, detective);
        this.keahlian = keahlian;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void tampil() {
        System.out.println("Nama\t\t : " +getNama());
        System.out.println("Dari\t\t : " +getAsal());
        if(isDetective()) {
            System.out.println("Detective\t : Iya");
        } else {
            System.out.println("Detective\t : Tidak");
        }
        System.out.println("Keahlian\t : " + getKeahlian());
        System.out.println();
    }
}