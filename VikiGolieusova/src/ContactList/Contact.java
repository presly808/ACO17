package ContactList;


public class Contact {

    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Contact(String name, String phone){
        this. name  = name;
        this.phone =  phone;
    }

    public String showInfo(){
        return String.format("name %s , phone %s", name, phone);
    }


}
