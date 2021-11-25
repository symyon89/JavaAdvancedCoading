package Ex7;

import java.util.Locale;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

    private String name;
    private String id;
    private Double salary;

    public Employee(String name, String id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
    //returneaza -1 daca obiectul curent este mai mic decat obiectul primit ca parametru
    // 0 daca sunt egali
    // 1 daca este mai mare
    @Override
    public int compareTo(Employee o) {
        /*
        Ordonam dupa nume si prenume exemplu
        String = numesiprenume = this.nume + this.prenume;
        le aducem la acelasi case ca nu avem probleme la comparatie

         */
        return o.getName().toLowerCase().compareTo(this.getName().toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        // daca rfeintele sunt egale ele sunt egale
        if (this == o) return true;

        //daca obiectul primit ca parametru nu este employee obiectele nu au cum sa fie egale
        if (!(o instanceof Employee)) return false;

        //daca ajung aici , am un employee pot sa ii fac cast in siguranta
        Employee employee = (Employee) o;
        return id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}