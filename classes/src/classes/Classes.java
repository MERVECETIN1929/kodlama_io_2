package classes;

public class Classes {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        System.out.println(customerManager);
        CustomerManager customerManager2 = new CustomerManager();
        System.out.println(customerManager2);
        customerManager = customerManager2;
        System.out.println(customerManager);
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        // primitive tipler değer tipli değişkenlerdir
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        // refereans tipli değişkenlerF
        int[] sayilar = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{3, 4, 5};
        sayilar2 = sayilar;
        sayilar[0] = 10;
        System.out.println(sayilar2[0]);
    }

}
