import adapter.DatabaseStorage;
import domain.EntityInterface;
import domain.Product;
import service.ProductService;

void main() {
    ProductService productService = new ProductService();

    productService.create(new Product(
            new BigDecimal(2),
            "SKU",
            productService.generateUUID(),
            "asas"
            )
    );

    productService.listAll();
}