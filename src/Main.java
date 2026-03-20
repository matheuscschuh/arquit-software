import domain.Product;

void main() {
    Product product = new Product();

    product.setName("Celular");
    product.setSku("TSH-BLK-002-SM");
    product.setPrice(new BigDecimal("1000"));
    product.setPrice(new BigDecimal("999"));

    Product product2 = new Product();

    product.setName("Notebook");
    product.setSku("TUI-GHJ-004-KL");
    product.setPrice(new BigDecimal("4000"));
    product.setPrice(new BigDecimal("3000"));

    Product product3 = new Product();

    product.setName("Mouse");
    product.setSku("RTY-DJG-006-AS");
    product.setPrice(new BigDecimal("200"));
    product.setPrice(new BigDecimal("100"));


    System.out.println(product.toString());
}
