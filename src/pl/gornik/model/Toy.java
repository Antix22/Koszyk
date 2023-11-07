package pl.gornik.model;

public class Toy extends Product {
 private int ageRange;

    public Toy(String title, int quantity, double price) {
        super(title, quantity, price);
    }

    public Toy(String title, int quantity, double price, int ageRange) {
        super(title, quantity, price);
        this.ageRange = ageRange;
    }
    public void displayProduct() {
        System.out.println("Produkt{" +
                "tytuł='" + super.getTitle() + '\'' +
                ", ilosc=" + super.getQuantity() +
                ", cena=" + super.getPrice() +
                ", minimalny wiek" + ageRange +
                '}'
        );
    }
}
