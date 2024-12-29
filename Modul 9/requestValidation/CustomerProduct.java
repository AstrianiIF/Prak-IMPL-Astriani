package requestValidation;

public class CustomerProduct {
    private String productNumber;

    public CustomerProduct(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductNumber() {
        return productNumber;
    }
    
    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }
}

