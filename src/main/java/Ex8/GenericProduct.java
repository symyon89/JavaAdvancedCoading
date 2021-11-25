package Ex8;

import java.time.LocalDate;

public class GenericProduct implements Product {
    private String nume;
    private int id;
    private Supplier supplier;
    private double price;
    private LocalDate date;


    public GenericProduct(int id,Supplier supplier) {
        this.supplier = supplier;
        this.price = supplier.getPriceForProduct(this);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean checkAvaibility(LocalDate date) {
        return false;
    }
}
