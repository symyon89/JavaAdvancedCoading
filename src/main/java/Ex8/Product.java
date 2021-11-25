package Ex8;

import java.time.LocalDate;

public interface Product {

    void setId(int id);

    int getId();
    double getPrice();

    boolean checkAvaibility(LocalDate date);

}
