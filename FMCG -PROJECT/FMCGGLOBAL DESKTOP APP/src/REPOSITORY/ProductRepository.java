package REPOSITORY;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import FMCGGLOBALMODEL.Products;

public class ProductRepository {;

	public static List<Products> findAll() {
		// LIST TO STORE PRODUCTS
		List<Products> productsList = new ArrayList<Products>();
		ResultSet resultSet = MYSQLDBConnection.getResultSet("SELECT * FROM PRODUCTS");
		// ITERATE THROUGH THE RESULT SET AND CREATE THE PRODUCT MODEL
		try {
			while (resultSet.next()) {
				String PRODUCT_ID = resultSet.getString("PRODUCT_ID");
				String PRODUCT_NAME = resultSet.getString("PRODUCT_NAME");
				int PRICE = resultSet.getInt("PRICE");
				int AVAILABLE_QUANTITY= resultSet.getInt("AVAILABLE_QUANTITY");
				String EXPIRY_DATE = resultSet.getString("EXPIRY_DATE");
				String SUPPLIER_ID = resultSet.getString("SUPPLIER_ID");
				String CUSTOMER_ID= resultSet.getString("CUSTOMER_ID");
				int REORDER_LEVEL = resultSet.getInt("REORDER_LEVEL");
				String REMARKS = resultSet.getString("REMARKS");

				// CREATE A PRODUCT OBJECT FOR THE PRODUCT
				Products product = new Products(PRODUCT_ID,PRODUCT_NAME,PRICE,AVAILABLE_QUANTITY,EXPIRY_DATE,SUPPLIER_ID,CUSTOMER_ID,REORDER_LEVEL,REMARKS);
				productsList.add(product);
			}
			return productsList;
		} catch (SQLException sqlException) {
			System.out.println("Problem in Result Set " + sqlException);
		}
		return null;
	}
public static Products save(Products product) {
	// CREATE THE INSERT QUERY
	String insertQuery = "INSERT INTO PRODUCTS VALUES ('" + product.getProductId() + "','"
			+ product.getProductName() + "'," + product.getPrice() + "," + product.getAvailable_Quantity() + "," + product.getExpiryDate() + "," + product.getSupplierId() + "," + product.getCustomerId() + "," + product.getReorderLevel() + "," + product.getRemarks() +");";
	System.out.println(insertQuery);
	return product;
}
}