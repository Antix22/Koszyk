package pl.gornik.model;

public class Disc extends Product{
    String performer;

    public Disc(String title, int quantity, double price) {
        super(title, quantity, price);
    }

    public Disc(String title, int quantity, double price, String performer) {
        super(title, quantity, price);
        this.performer = performer;
    }
    @Override
    public void displayProduct() {
        System.out.println("Produkt{" +
                "tytuł='" + super.getTitle() + '\'' +
                ", ilosc=" + super.getQuantity() +
                ", cena=" + super.getPrice() +
                ", wykonawca=" + performer +
                '}'
        );
    }
}
