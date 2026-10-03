/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wun
 */
public class Main {
    public static void main(String [] argv){
        System.out.println("Segi Empat");
        SegiEmpat se = new SegiEmpat();
        se.lebar = 10;
        se.panjang = 10;
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Keliling sebelum diperbesar ="+ se.keliling);
        System.out.println("Luas sebelum diperbesar ="+ se.luas);
        
        se.perbesar();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Keliling setelah diperbesar ="+ se.keliling);
        System.out.println("Luas setelah diperbesar ="+se.luas);
        
        se.perkecil();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Keliling setelah diperkecil ="+ se.keliling);
        System.out.println("Luas setelah diperkecil ="+se.luas);
        System.out.println("--------------------");
        
        
        System.out.println("Segitiga Sama Kaki");
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.tinggi = 15;
        stsk.alas = 10;
        stsk.hitungKeliling();
        stsk.hitungLuas();
        System.out.println("Keliling sebelum diperbesar ="+ stsk.keliling);
        System.out.println("Luas sebelum diperbesar ="+ stsk.luas);
        
        stsk.perbesar();
        stsk.hitungKeliling();
        stsk.hitungLuas();
        System.out.println("Keliling setelah diperbesar ="+ stsk.keliling);
        System.out.println("Luas setelah diperbesar ="+stsk.luas);
        
        stsk.perkecil();
        stsk.hitungKeliling();
        stsk.hitungLuas();
        System.out.println("Keliling setelah diperkecil ="+ stsk.keliling);
        System.out.println("Luas setelah diperkecil ="+stsk.luas);
        System.out.println("--------------------");
        
        System.out.println("Lingkaran");
        Lingkaran l = new Lingkaran();
        l.jariJari = 21;
        l.hitungKeliling();
        l.hitungLuas();
        System.out.println("Keliling sebelum diperbesar ="+ l.keliling);
        System.out.println("Luas sebelum diperbesar ="+ l.luas);
        
        l.perbesar();
        l.hitungKeliling();
        l.hitungLuas();
        System.out.println("Keliling setelah diperbesar ="+ l.keliling);
        System.out.println("Luas setelah diperbesar ="+l.luas);
        
        l.perkecil();
        l.hitungKeliling();
        l.hitungLuas();
        System.out.println("Keliling setelah diperkecil ="+ l.keliling);
        System.out.println("Luas setelah diperkecil ="+l.luas);
    }
}
