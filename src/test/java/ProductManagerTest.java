import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {


    Product product1 = new Product(11, "Овощи", 250,"P1");
    Product product2 = new Product(12, "Фрукты", 300,"P2");
    Product product3 = new Product(13, "Батон", 120,"P3");
    Product product4 = new Product(14, "Молоко", 290,"P4");
    Product product5 = new Product(15, "Мясо", 540,"P5");

    @Test
    public void test4() {
        Repository repository = new Repository();
        ProductManager product = new ProductManager(repository);
        product.add(product1);
        product.add(product2);
        product.add(product3);
        product.add(product4);
        product.add(product5);
        //product.searchBy("Фрукты");

        Product[] expected = {product1, product2, product3, product4, product5};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        Repository repository = new Repository();
        ProductManager product = new ProductManager(repository);
        product.add(product1);
        product.add(product2);
        product.add(product3);
        product.add(product4);
        product.add(product5);
        product.searchBy("P1");
        product.searchBy("p2");
        product.searchBy("P3");
        product.searchBy("P4");
        product.searchBy("P5");
        Product[] expected = {product1,product2,product3,product4,product5};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
