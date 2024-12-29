package requestValidation;

import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        CustomerInquiryRequest request = new CustomerInquiryRequest(
            new Customer("123"),
            new CustomerProduct("456")
        );

        try {
            validateRequest(request, 10, 15);
            System.out.println("Request is valid.");
            System.out.println("Customer ID: " + request.getCustomer().getCustomerID());
            System.out.println("Product Number: " + request.getCustomerProduct().getProductNumber());
        } catch (BusinessException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void validateRequest(CustomerInquiryRequest request, int customerFieldLength, int productFieldLength) {
        // 1. Check both parameters are not null and not empty strings
        checkCustomerInquiryNotNullOrEmpty(request);
        
        // 2. Check both parameters aren't populated
        checkCustomerInquiryNullOrEmpty(request);
        
        // 3. Check CustomerID for field length and pad the parameter
        checkCustomerIDValid(request, customerFieldLength);
        
        // 4. Check ProductNumber for field length and pad the parameter
        checkProductNumberValid(request, productFieldLength);
    }

    private static void checkCustomerInquiryNotNullOrEmpty(CustomerInquiryRequest request) {
        if (request.getCustomerProduct().getProductNumber() != null && !request.getCustomerProduct().getProductNumber().isEmpty() &&
            request.getCustomer().getCustomerID() != null && !request.getCustomer().getCustomerID().isEmpty()) {
            // Both were populated
            throw new BusinessException(HandledErrors.INVALID_BOTH_PARAMETER_MESSAGE);
        }
    }

    private static void checkCustomerInquiryNullOrEmpty(CustomerInquiryRequest request) {
        if ((request.getCustomer().getCustomerID() == null || request.getCustomer().getCustomerID().isEmpty()) &&
            (request.getCustomerProduct().getProductNumber() == null || request.getCustomerProduct().getProductNumber().isEmpty())) {
            // Both are null or empty string
            throw new BusinessException(HandledErrors.CUSTOMER_EMPTY_MESSAGE);
        }
    }

    private static void checkCustomerIDValid(CustomerInquiryRequest request, int customerIDFieldLength) {
        String customerID = request.getCustomer().getCustomerID();
        if (customerID != null && !customerID.isEmpty()) {
            // Check Customer ID length
            if (customerID.length() > customerIDFieldLength) {
                throw new BusinessException(HandledErrors.CUSTOMER_INVALID_LENGTH_MESSAGE);
            }

            // Pad the left of the customer ID
            request.getCustomer().setCustomerID(String.format("%0" + customerIDFieldLength + "d", Integer.parseInt(customerID)));
        }
    }

    private static void checkProductNumberValid(CustomerInquiryRequest request, int productFieldLength) {
        String productNumber = request.getCustomerProduct().getProductNumber();
        if (productNumber != null && !productNumber.isEmpty()) {
            // Check Product Length
            if (productNumber.length() > productFieldLength) {
                throw new BusinessException(HandledErrors.PRODUCT_INVALID_LENGTH_MESSAGE);
            }

            // Pad the left of the product number
            request.getCustomerProduct().setProductNumber(String.format("%0" + productFieldLength + "d", Integer.parseInt(productNumber)));
        }
    }
}