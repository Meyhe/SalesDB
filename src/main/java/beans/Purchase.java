package beans;

public class Purchase {
    private int id;
    private String name;
    private int price;
    private int id_person;

    public Purchase(int id, String name, int price, int id_person) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.id_person = id_person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }
}
