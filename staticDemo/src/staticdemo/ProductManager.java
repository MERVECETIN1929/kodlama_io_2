
package staticdemo;


public class ProductManager {
    public void add(Product product){
        
        if(ProductValidator.isValid(product)){System.out.println("Eklendi");}
        else{System.out.println("ürün eklenemedi");}
        ProductValidator productValidator=new ProductValidator();
        productValidator.birsey();
        
    }
}
