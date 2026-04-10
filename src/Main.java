import adapter.DatabaseStorage;
import domain.EntityInterface;
import domain.Product;
import service.ProductService;
import utils.GenerateValue;

void main() {
    ProductService productService = new ProductService();

    Product product = new Product(
            2f,
            "SKU",
            GenerateValue.getUUID(),
            "produto"
    );
    productService.create(product);

    productService.listAll();

    product.setPrice(3f);



}