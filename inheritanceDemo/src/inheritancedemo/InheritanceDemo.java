package inheritancedemo;

public class InheritanceDemo {

    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
        ogretmenKrediManager.hesapla();
        KrediUI krediUI=new KrediUI();
        krediUI.krediHesapla(new TarimKrediManager());
    }

}
