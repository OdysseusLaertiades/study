package study.oop.searcher.model;

public class User {
    public String id = "9";
    public String name = "Glenna Reichert";
    public String username = "Delphine";
    public String email = "Chaim McDerm ott@dana.io";
    public String phone = "(775)976-6794x41206";
    public String website = "conrad.com";

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Dayna Park");
        address.setSuite("Suite 449");
        address.setCity("Bartholomburry");
        address.setZipcode("76495-3109");

        Geo geo = new Geo();
        geo.setLat(24.6463);
        geo.setLng(-168.8889);

        Company company = new Company();
        company.setName("Yost and Sons");
        company.setCatchPhrase("Switchable contextually-based project");
        company.setBs("aggregate real-time technologies");
    }
}
