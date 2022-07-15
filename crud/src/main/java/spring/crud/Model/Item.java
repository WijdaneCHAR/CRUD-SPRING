package spring.crud.Model;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @Column(nullable = false)
    private int id_item;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
