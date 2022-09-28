public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Monster Laptop"); ;
        product.setPrice(10_000);
        product.setStockAmount(3);
        System.out.println(product.getKod());

        Product product2 = new Product(2,"Mouse","Kablosuz Mouse",300,15);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        productManager.Add(product2);
    }
}