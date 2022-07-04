package ru.netology.javaqamvn12.services;
public class Repository {
    private Product[] products = new Product[0];

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] findAll() {
        return products;
    }

    public void removeById(int id) {
        Product[] tmp = new Product[products.length - 1];
        int rem = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[rem] = product;
                rem++;
            }
        }
        products = tmp;
    }
}
