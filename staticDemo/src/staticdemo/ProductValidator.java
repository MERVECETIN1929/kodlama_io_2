//ürün kurallara uygun mu kontrolü yapılacak
package staticdemo;


public class ProductValidator {
    static{
        System.out.println("static yapıcı blok");
    }
    public ProductValidator(){
        System.out.println("yapıcı blok");
    }
   public static boolean isValid(Product product){
       if(product.price>0&& !product.name.isEmpty()){
           return true;
       }
       return false;
   } 
   public void birsey(){
       
   }
}
