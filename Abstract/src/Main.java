public class Main {
    public static void main (String[] argv){
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungKeliling();
        stsk.hitungLuas();
        System.out.println("Luas SegiTigaSamaKaki =" + stsk.luas);
        System.out.println("Keliling STSK="+ stsk.keliling);
        
        BangunDatar bd = new BangunDatar();
    }
}
