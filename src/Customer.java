public class Customer {
    private String id;
    private String name;
    private String address;
    private String meternumber;

  Customer(String id, String name, String address, String meternumber){
      this.id=id;
      this.name=name;
      this.address=address;
      this.meternumber=meternumber;
  }

    public Customer() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMeternumber() {
        return meternumber;
    }

    public void setMeternumber(String meternumber) {
        this.meternumber = meternumber;
    }
}
