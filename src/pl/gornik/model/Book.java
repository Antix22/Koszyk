package pl.gornik.model;

public class Book extends Product{
    String author;

    public Book(String title, int quantity, double price) {
        super(title, quantity, price);
    }

    public Book(String title, int quantity, double price, String autor) {
        super(title, quantity, price);
        this.author = autor;
    }

    @Override
    public void displayProduct() {
        System.out.println("Produkt{" +
                "tytuł='" + super.getTitle() + '\'' +
                ", ilosc=" + super.getQuantity() +
                ", cena=" + super.getPrice() +
                ", autor=" + author +
                '}'
        );
    }
}
