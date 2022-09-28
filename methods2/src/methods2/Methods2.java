package methods2;

public class Methods2 {

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void güncelle() {
        System.out.println("güncellendi");
    }

    public static int topla(int sayi1,int sayi2) {
        System.out.println("ikili");
        return sayi1+sayi2;
    }
    public static int topla(int... sayilar){
        int toplam=0;
        for (int sayi : sayilar) {
            toplam+=sayi;
        }
        System.out.println("çoklu");
        return toplam;
    }
    public static String sehir() {
        return "Ankara";
    }

    public static void main(String[] args) {
        String mesaj = "bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0, 2);
        System.out.println(yeniMesaj);
        System.out.println(topla(5,8));
        int[]deneme={1,5,8};
        System.out.println(topla(deneme));
        System.out.println(topla(1,5));
    }

}
