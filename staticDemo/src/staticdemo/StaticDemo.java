package staticdemo;

public class StaticDemo {

    public static void main(String[] args) {
        Product product=new Product();
        product.name="mouse";
        product.price=50;
        ProductManager productManager=new ProductManager();
        productManager.add(product);
        DatabaseHelper.Connetcion.bagla();
    }

}
