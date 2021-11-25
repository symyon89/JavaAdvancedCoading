package Ex8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {
    Map<Integer,Integer> cantitateProduse = new HashMap<>();
    private final List<Product> products = new ArrayList<>();

    public void addItem(Product product,int quantity) {
        // verific daca produsul exista si il adaug TODO de implementat equals si has in generic
        products.add(product);
        cantitateProduse.put(product.getId(),quantity);
    }

    public void removeItem(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

}
