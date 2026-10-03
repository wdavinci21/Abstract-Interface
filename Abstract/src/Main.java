public class Main {
    public static void main (String[] argv){
        System.out.println("Segitiga Sama Kaki");
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungKeliling();
        stsk.hitungLuas();
        System.out.println("Luas SegiTigaSamaKaki =" + stsk.luas);
        System.out.println("Keliling STSK="+ stsk.keliling);
        System.out.println("----------");
        
        System.out.println("Lingkaran");
        Lingkaran l = new Lingkaran();
        l.jariJari = 28;
        l.hitungKeliling();
        l.hitungLuas();
        System.out.println("Luas Lingkaran =" + l.luas);
        System.out.println("Keliling Lingkaran="+ l.keliling);
    }
}
