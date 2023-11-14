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
        List<Product> shop = new ArrayList<>();
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
        shop.add(book1);
        shop.add(book2);
        shop.add(book3);
        shop.add(book4);
        shop.add(disc1);
        shop.add(disc2);
        shop.add(disc3);
        shop.add(disc4);
        shop.add(toy1);
        shop.add(toy2);
        shop.add(toy3);
        shop.add(toy4);

        double grossPrice = 0;

        for (Product product : shop) {
            product.displayProduct();
            grossPrice += product.countPrice();
        }

        System.out.println("wartość sklepu to " + grossPrice);

        List<Product> basket = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isFind = false;
        String nazwa;
        int ilosc;
        String choice;
        do{
            System.out.println("podaj tytuł");
            nazwa = scanner.nextLine();

            System.out.println("podaj ilość");
            ilosc = scanner.nextInt();
            scanner.nextLine();

            for (Product prod : shop) {
                if (prod.getTitle().equalsIgnoreCase(nazwa.toLowerCase())) {
                    Product product = new Product(prod);

                    if (product.getQuantity() > ilosc) {
                        product.setQuantity(ilosc);
                        prod.setQuantity(product.getQuantity() - ilosc);
                        basket.add(product);
                        isFind = true;
                        break;
                    } else if (product.getQuantity() == ilosc) {
                        product.setQuantity(ilosc);
                        shop.remove(prod);
                        basket.add(product);
                        isFind = true;
                        break;

                    } else {
                        System.out.println("Nie ma tylu na stanie. Do koszyka dodany bedzie stan sklepu");
                        product.setQuantity(prod.getQuantity());
                        shop.remove(prod);
                        basket.add(product);
                        isFind = true;
                        break;
                    }
                }
            }
            if(isFind)
                System.out.println("czy chcesz cos dodać");
            choice = scanner.nextLine();
        }
        while (choice.equalsIgnoreCase("Tak")) ;

        String kup;
        do{

            for (Product prod : shop){
                Product product = new Product(prod);
                prod.setQuantity(prod.getQuantity() + ilosc);
                basket.remove(product);
                isFind = true;
                break;
            }
            if(isFind)
                System.out.println("Czy chcesz to kupić");
            kup = scanner.nextLine();
        }while(kup.equalsIgnoreCase("Nie"));




        grossPrice = 0;
        for (Product koszyk : basket) {
            koszyk.displayProduct();
            grossPrice+= koszyk.countPrice();
        }
        System.out.println("Wartośc koszyka wynosi " + grossPrice);
    }
        }



