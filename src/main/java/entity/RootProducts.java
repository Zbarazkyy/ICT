package entity;

import java.util.List;

public class RootProducts {

    private List<Products> products;

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "RootProducts{" +
               "products=" + products +
               '}';
    }
}
