package requestValidation;

public class HandledErrors {
	
	 public static final String INVALID_BOTH_PARAMETER_MESSAGE = "Both CustomerID and ProductNumber cannot be populated at the same time.";
	 public static final String CUSTOMER_EMPTY_MESSAGE = "CustomerID and ProductNumber cannot both be empty.";
	 public static final String CUSTOMER_INVALID_LENGTH_MESSAGE = "CustomerID exceeds the allowed length.";
	 public static final String PRODUCT_INVALID_LENGTH_MESSAGE = "ProductNumber exceeds the allowed length.";
}
