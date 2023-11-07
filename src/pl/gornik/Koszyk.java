package pl.gornik;

import pl.gornik.model.Book;
import pl.gornik.model.Disc;
import pl.gornik.model.Product;
import pl.gornik.model.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Koszyk {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Book book1 = new Book("Pan Tadeusz", 100, 75, "Adam Mickiewicz");
        Book book2 = new Book("Zemsta", 40, 25, "Aleksander Fredro");
        Book book3 = new Book("Wesele", 20, 40, "Stanisław Wyspiański");
        Book book4 = new Book("Balladyna", 30, 20, "Juliusz Słowacki");
        Disc disc1 = new Disc("Zabójstwo liryczne 2", 10, 200, "Sentino");
        Disc disc2 = new Disc("BFF", 200, 50, "Babmi");
        Disc disc3 = new Disc("Atypowy", 25, 100, "Szpaku");
        Disc disc4 = new Disc("Patocelebryta", 15, 150, "Kizo");
        Toy toy1 = new Toy("lego duplo", 1000, 230, 10);
        Toy toy2 = new Toy("Samolot", 250, 2300, 15);
        Toy toy3 = new Toy("samochodzik", 500, 109, 3);
        Toy toy4 = new Toy("kucyk", 50, 115, 4);
        products.add(book1);
        products.add(book2);
        products.add(book3);
        products.add(book4);
        products.add(disc1);
        products.add(disc2);
        products.add(disc3);
        products.add(disc4);
        products.add(toy1);
        products.add(toy2);
        products.add(toy3);
        products.add(toy4);


        for(Product product: products){
            product.displayProduct();
        }


        List<Product>buscet = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tytuł");
        String nazwa = scanner.nextLine();
        System.out.println("podaj ilość");

        int ilosc = scanner.nextInt();
        for(int i = 0; i< products.size(); i++){
            Product temp = new Product(products.get(i));
            if(products.contains(nazwa)){
                buscet.add(products.get(i));
                products.get(i).setQuantity(products.get(i).getQuantity() - ilosc);

            }

        }
        for(Product product: products){
            product.displayProduct();
        }
        }

        }



