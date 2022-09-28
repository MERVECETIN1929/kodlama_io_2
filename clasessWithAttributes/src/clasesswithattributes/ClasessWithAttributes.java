package clasesswithattributes;

public class ClasessWithAttributes {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("laptop"); 
        product.setDescription("asus"); 
        product.setId(1); 
        product.setPrice(10000); 
        product.setStockAmount(10);
        System.out.println(product.getName());
        ProductManager productManager = new ProductManager();
        productManager.add2(0, "lkldfs", "lsdf", 0, 0);
        productManager.add(product);
        System.out.println(product.getKod());
        Product product1=new Product(2,"fsdf","lenvo",1255,3);
        System.out.println(product1.getKod());
        
    }

}
