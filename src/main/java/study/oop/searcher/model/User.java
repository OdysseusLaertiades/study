package study.oop.searcher.model;

public class User {
    public String id = "9";
    public String name = "Glenna Reichert";
    public String username = "Delphine";
    public String email = "Chaim McDerm ott@dana.io";
    public String phone = "(775)976-6794x41206";
    public String website = "conrad.com";

    public User() {
    }

    public User(Company company, Address address, Geo geo) {
        company.setName("Yost and Sons");
        company.setCatchPhrase("Switchable contextually-based project");
        company.setBs("aggregate real-time technologies");

        address.setStreet("Dayna Park");
        address.setSuite("Suite 449");
        address.setCity("Bartholomburry");

        geo.setLat(24.6463);
        geo.setLng(-168.8889);
    }
}
