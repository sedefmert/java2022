package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"laptop","asus laptop",3000,2,"siyah");
	
//		
//		Product product = new Product();
//		product.setName("laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop"); 
//		product.setPrice(5000); 
//		product.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod()); 
		
		
	}
	

}
		// attribute = özellik
		//field = alan
		//encapsulation = kapsülleme
		//constructor = yapıcı