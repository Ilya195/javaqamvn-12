public class Smartphone extends Product{
    private String title;
    private String manufacturer;

    public Smartphone(int id, String name, int price, String title, String manufacturer) {
        super(id,name,price);
        this.title = title;
        this.manufacturer = manufacturer;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


}
