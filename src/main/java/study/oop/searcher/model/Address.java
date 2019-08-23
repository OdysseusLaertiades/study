package study.oop.searcher.model;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;

    public String setStreet (String street) {
        return this.street = street;
    }
    public String setSuite (String suite) {
        return this.suite = suite;
    }
    public String setCity (String city) {
        return this.city = city;
    }
    public String setZipcode (String zipcode) {
        return this.zipcode = zipcode;
    }
}
