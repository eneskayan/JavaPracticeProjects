package oop1;

public class Main {

	public static void main(String[] args) {
		// set value
		Product product1 = new Product();
		product1.setName("Delonghi");
		product1.setUnitPrice(7500);
		product1.setDiscount(3);
		product1.setUnitsInStock(5);
		product1.setImageUrl("coffee.jpg");
		
		
		Product product2 = new Product();
		product2.setName("Arzum");
		product2.setUnitPrice(7500);
		product2.setDiscount(3);
		product2.setUnitsInStock(5);
		product2.setImageUrl("coffee.jpg");
		
		
		Product product3 = new Product();
		product3.setName("Dell");
		product3.setUnitPrice(7500);
		product3.setDiscount(3);
		product3.setUnitsInStock(5);
		product3.setImageUrl("coffee.jpg");
		
		
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setCustomerNumber("12315");
		individualCustomer.setId(1);
		individualCustomer.setPhone("5302658974");
		individualCustomer.setFirstName("Ali");
		individualCustomer.setLastName("Doğan");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setCompanyName("İ2İ SYSTEMS");
		corporateCustomer.setCustomerNumber("2563");
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("4225698745");
		corporateCustomer.setTaxNumber("321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
	}

}
