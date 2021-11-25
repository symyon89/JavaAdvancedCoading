package Ex8;

import java.util.Random;

public class Supplier {
    double getPriceForProduct(Product product){
        Random number = new Random();
        return number.nextDouble() * product.getId();

    }
}
