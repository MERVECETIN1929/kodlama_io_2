package methods;

public class Methods {
    public static void sayiBulmaca(){
        int[] sayilar=new int[]{1,2,5,7,1};
        int aranacak=1;
        boolean varMı=false;
        for(int sayi:sayilar){
            if(sayi==aranacak){
                mesajVer("sayı bulundu: "+aranacak);
                varMı=true;
                return;
        }
        
    }
         mesajVer("sayı bulunadı : "+aranacak);
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
    public static void main(String[] args) {
        sayiBulmaca();
    }

}
