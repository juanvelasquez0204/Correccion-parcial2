package model;

public class Item {
    private String tipo;
    private String name;
    private Double price;
    private Long stock;

    public Item(String tipo, String name, Double price, Long stock) {
        this.tipo = tipo;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Item() {
    }
    
    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

   
}
