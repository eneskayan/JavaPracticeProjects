package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		
		product.setId(1);


		ProductManager productManager = new ProductManager();

		productManager.Add(product);

	}

}
