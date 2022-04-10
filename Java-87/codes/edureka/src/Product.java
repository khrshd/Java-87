
public class Product {
	private Integer productId;
	private String productName;
	private Float productPrice;
	
	public Product(Integer productId, String productName, Float productPrice) {		
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + " | productName=" + productName + " | productPrice=" + productPrice
				+ "]";
	}

	public static void main(String[] args) {
		Product prod = new Product(1, "Mouse", 375.5f);
		System.out.println(prod); //toString()
	}
}
