package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user1 = new User("Федя", "pass1", new Basket(5));
        User user2 = new User("Миша", "pass2", new Basket(3));
        // user1.checkUserNameAndPassword(scanner);

        Product clothing1 = new Product("Брюки", 4.99, 4);
        Product clothing2 = new Product("Рубашка", 6.99, 5);
        Product clothing3 = new Product("Туфли", 7.99, 3);
        Product furniture1 = new Product("Стул", 75.99, 5);
        Product furniture2 = new Product("Софа", 179.99, 5);
        Product furniture3 = new Product("Стол", 149.99, 4);
        Category clothing = new Category("Одежда", new Product[]{clothing1, clothing2, clothing3});
        Category furniture = new Category("Мебель", new Product[]{furniture1, furniture2, furniture3});
        Category sport = new Category("Спорттовары", new Product[]{new Product("Мяч", 120.0, 5),
                new Product("Велосипед", 675.00, 5)});

        Category[] catalog = new Category[]{clothing, furniture, sport};

        user1.basket.addProduct(clothing2);
        user1.basket.deleteProduct(clothing2);
        System.out.println();
        user1.basket.addProduct(furniture2);
        user1.basket.addProduct(furniture3);
        System.out.println();
        Category.displayCatalog(catalog);
        System.out.println("________");

        Product[] products = new Product[]{clothing1, clothing2, clothing3, furniture1, furniture2, furniture3};

        Category.displayProductCatalogByCategory(clothing);
        System.out.println();
        Category.displayProductCatalogByCategory(furniture);
        System.out.println();
        Category.displayProductCatalogByCategory(sport);
        System.out.println("________");
        Basket.displayProducts(products);
        System.out.println();
    }
}