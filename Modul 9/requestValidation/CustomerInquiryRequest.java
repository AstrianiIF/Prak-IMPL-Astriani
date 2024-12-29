package requestValidation;

public class CustomerInquiryRequest {
	
    private Customer customer;
    private CustomerProduct customerProduct;

    public CustomerInquiryRequest(Customer customer, CustomerProduct customerProduct) {
        this.customer = customer;
        this.customerProduct = customerProduct;
    }

    public Customer getCustomer() {
        return customer;
    }

    public CustomerProduct getCustomerProduct() {
        return customerProduct;
    }
}

