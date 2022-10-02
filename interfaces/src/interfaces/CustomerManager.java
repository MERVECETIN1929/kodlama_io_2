
package interfaces;


public class CustomerManager {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal iCustomerDal){
        this.customerDal=iCustomerDal;
    }
    public void add(){
        // iş kodları
        customerDal.add();
    }
}
