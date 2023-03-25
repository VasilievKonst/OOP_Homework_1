package org.example;

import java.util.Arrays;

public class Category {
    private String name;
    Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Категории: " + name +
                ", товары: " + Arrays.toString(products);
    }

    public static void displayProductCatalogByCategory(Category category) {
        System.out.println("Каталог товаров: \n" + category.getName());
        for (Product p : category.products) {
            System.out.println(p);
        }
    }

    public static void displayCatalog(Category[] catalog) {
        System.out.println("Все котологи:");
        for (Category c : catalog) {
            System.out.println(c.name);
        }
    }

}
