import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    Product product1 = new Product(11,"Овощи",250);
    Product product2 = new Product(12,"Фрукты",300);
    Product product3 = new Product(13,"Батон",120);
    Product product4 = new Product(14,"Молоко",290);
    Product product5 = new Product(15,"Мясо",540);


    @Test
    public void test() {
        Repository repository = new Repository();
        repository.save(product1);
        repository.save(product2);
        repository.save(product3);
        repository.save(product4);
        repository.save(product5);


        Product[] expected  = {product1,product2,product3,product4,product5};
        Product[] actual = repository.getProducts();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void test2() {
        Repository repository = new Repository();
        repository.save(product1);
        repository.save(product2);
        repository.save(product3);
        repository.save(product4);
        repository.save(product5);
        repository.removeById(product1.getId());
        repository.removeById(product5.getId());

        Product[] expected  = {product2,product3,product4};
        Product[] actual = repository.getProducts();

        Assertions.assertArrayEquals(expected,actual);
    }
}
