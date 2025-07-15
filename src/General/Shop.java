package General;

class Product {
    private String itemNo;
    private String name;
    private int price;
    private int qty;

    Product (String itemNo,String name,int price,int qty) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() { return name; }
    public String getItemNo() { return itemNo; }
    public int getPrice() { return price; }
    public int getQty() { return qty; }
}

class Customer {
    private String custID;
    private String  name;
    private String address;
    private String phone;

    Customer(String custID,String name) {
        this.custID = custID;
        this.name = name;
    }
    Customer(String custID,String name,String address,String phone) {
        this.custID = custID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public void setPhone(String phone) { this.phone = phone;}
    public void setAddress(String address) { this.address = address;}
    public String getName() {
        return  name;
    }
    public String getCustID() {
        return custID;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
}
public class Shop {
    public static void main(String[] args) {

    }
}
