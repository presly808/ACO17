package moto;

public class Biker {

    private String name;
    private String phone;
    private String address;
    private int money;
    private boolean tools;

    private MotoShop shop = new MotoShop();

    private Motorcycle motorcycle = null;

    public Biker(String name, String phone, String address, int money) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.money = money;
    }

    public void buyMotorcycle(String model) {
        Motorcycle motorcycle = shop.buyMoto(model, this.money);

        if (motorcycle == null || this.motorcycle != null) {
            return;
        }

        this.motorcycle = motorcycle;
        this.money -= motorcycle.getPrice();
    }

    public void buyTools() {
        boolean tools = shop.buyTools(this.money);

        if (tools) {
            this.tools = tools;
            this.money -= 200;
        }
    }

    public void sellMoto() {
        if (this.motorcycle == null) {
            return;
        }

        this.money += this.motorcycle.getPrice() / 2;
        this.motorcycle = null;
    }

    public void fix(Motorcycle motorcycle) {
        motorcycle.fixInit(";olk!1hsgo@goiu#ruRy98");
    }

    public String showInfo() {
        return String.format("name - %s\nphone - %s\naddress - %s\nmoney - %d\ntools - %s",
                this.name, this.phone, this.address, this.money, this.tools);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getMoney() {
        return money;
    }

    public boolean isTools() {
        return tools;
    }

    public Motorcycle getMotorcycle() {
        return motorcycle;
    }
}
