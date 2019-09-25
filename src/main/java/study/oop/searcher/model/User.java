package study.oop.searcher.model;

public class User {
    private String id = "9";
    private String name = "Glenna Reichert";
    private String username = "Delphine";
    private String email = "Chaim McDerm ott@dana.io";
    private String phone = "(775)976-6794x41206";
    private String website = "conrad.com";
    private Address address;
    private Company company;

    public User() {

    }

    public User(String id, String name, String username, String email, String phone, String website) {
        this(id, name, username, email, phone, website, null, null);
    }

    public User(String id, String name, String username, String email, String phone, String website, Address address) {
        this(id, name, username, email, phone, website, address, null);
    }

    public User(String id, String name, String username, String email, String phone, String website, Address address, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.website = website;
        this.address = address;
        this.company = company;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsetName() {
        return name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }
}
