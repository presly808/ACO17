package week3.rozetka.models;

public class Order {

    private int ownerId;
    private Address address;
    private int index;

    public Order() {
    }

    public Order(int ownerId, Address address, int index) {

        if (ownerId < 0 || address == null) {
            return;
        }

        this.ownerId = ownerId;
        this.address = address;
        this.index = index;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public Address getAddress() {
        return address;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ownerId=" + ownerId +
                ", address=" + address +
                ", index=" + index +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (ownerId != order.ownerId) return false;
        if (index != order.index) return false;
        return address != null ? address.equals(order.address) : order.address == null;

    }
}
