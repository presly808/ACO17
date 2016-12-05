package week3.rozetka.models;

public class Product {

    private String name;
    private int price;
    private String specify;
    private int deliveryTime;

    public Product() {
    }

    public Product(String name, int price, String specify, int deliveryTime) {

        if (name == null || price <= 0 || specify == null || deliveryTime <= 0) {
            return;
        }

        this.name = name;
        this.price = price;
        this.specify = specify;
        this.deliveryTime = deliveryTime;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getSpecify() {
        return specify;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", specify=" + specify +
                ", deliveryTime=" + deliveryTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        if (deliveryTime != product.deliveryTime) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        return specify != null ? specify.equals(product.specify) : product.specify == null;

    }
}
