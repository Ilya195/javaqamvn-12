public class ProductManager {
    private Repository repository;
    // добавьте необходимые поля, конструкторы и методы

    public ProductManager(Repository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.save(product);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        int fact = 0;
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {
                ;
                result[fact] = product;
                fact++;
                // "добавляем в конец" массива result продукт product
            }
        }
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
        // или в одну строку:
        //return product.getName().contains(search);
    }
}