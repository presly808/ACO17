package contactList;

public class Contact {

    private String name;
    private String phone;
    private String email;
    private int id;
    private String operator;

    public Contact(String name, String phone, String email, int id) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.id = id;

        if (phone.startsWith("+38095") || phone.startsWith("38095") || phone.startsWith("095")) {
            this.operator = "Vodafone";
        } else if (phone.startsWith("+38067") || phone.startsWith("38067") || phone.startsWith("067")) {
            this.operator = "Kyivstar";
        } else {
            this.operator = "unknown";
        }
    }

    public String ShowInfo() {

        return String.format("name - %s\nphone - %s\nemail - %s\noperator - %s\nid - %d",
                this.name, this.getPhone(), this.email, this.operator, this.id);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getOperator() {
        return operator;
    }
}
