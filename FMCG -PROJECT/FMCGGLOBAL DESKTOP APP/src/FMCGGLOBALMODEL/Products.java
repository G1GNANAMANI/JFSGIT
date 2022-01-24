package FMCGGLOBALMODEL;

public class Products extends Object {
	private String PRODUCT_ID;
	private String PRODUCT_NAME;

	public void setSupplierId(String SUPPLIER_ID) {
		SUPPLIER_ID = getSupplierId();
	}
	private int PRICE;
	private int AVAILABLE_QUANTITY;
	private String EXPIRY_DATE;
	private String SUPPLIER_ID;
	private String CUSTOMER_ID;
	private int REORDER_LEVEL;
	private String REMARKS;
	
	public Products(String PRODUCT_ID, String PRODUCT_NAME, int PRICE, int AVAILABLE_QUANTITY, String EXPIRY_DATE,
			String SUPPLIER_ID, String CUSTOMER_ID, int REORDER_LEVEL, String REMARKS) {
		this.PRODUCT_ID = PRODUCT_ID;
		this.PRODUCT_NAME = PRODUCT_NAME;
		this.PRICE = PRICE;
		this.AVAILABLE_QUANTITY = AVAILABLE_QUANTITY;
		this.EXPIRY_DATE = EXPIRY_DATE;
		this.SUPPLIER_ID = SUPPLIER_ID;
		this.CUSTOMER_ID = CUSTOMER_ID;
		this.REORDER_LEVEL = REORDER_LEVEL;
		this.REMARKS = REMARKS;

	}

	public String getProductId() {
		return PRODUCT_ID;
	}

	public String getProductName() {
		return PRODUCT_NAME;
	}

	public int getPrice() {
		return PRICE;
	}

	public int getAvailable_Quantity() {
		return AVAILABLE_QUANTITY;
	}

	public String getExpiryDate() {
		return EXPIRY_DATE;
	}

	public String getSupplierId() {
		return SUPPLIER_ID;
	}

	public String getCustomerId() {
		return CUSTOMER_ID;
	}

	public int getReorderLevel() {
		return REORDER_LEVEL;
	}

	public String getRemarks() {
		return REMARKS;
	}

	@Override
	public String toString() {
		return "PRODUCT_ID: " + PRODUCT_ID + ",\n PRODUCT_NAME: " + PRODUCT_NAME + ",\n PRICE: " + PRICE
				+ ", \n AVAILABLE_QUANTITY :" + AVAILABLE_QUANTITY + ",\n EXPIRY_DATE: " + EXPIRY_DATE + ",\n SUPPLIER_ID: "
				+ SUPPLIER_ID + ",\n CUSTOMER_ID: " + CUSTOMER_ID + ",\n REORDER_LEVEL: " + REORDER_LEVEL + ",\n REMARKS: "
				+ REMARKS + "";
	}


}