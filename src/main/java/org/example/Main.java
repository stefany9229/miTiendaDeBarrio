package org.example;

import org.example.model.Product;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva instancia de Product
        Product product = new Product("Laptop", 999.99, 5);

        // Verificar si el producto se quedó sin inventario
        boolean outOfStock = product.isOutOfStock();
        if (outOfStock) {
            System.out.println("El producto está agotado.");
        } else {
            System.out.println("El producto no está agotado. Stock disponible: " + product.getStock());
        }

        // Verificar si el precio del producto es mayor a un valor dado
        double targetPrice = 800.0;
        //boolean priceGreaterThan = product.isPriceGreaterThan(targetPrice);
        if (product.isPriceGreaterThan(targetPrice)) {
            System.out.println("El precio del producto es mayor que " + targetPrice);
        } else {
            System.out.println("El precio del producto no es mayor que " + targetPrice);
        }

        // Verificar si el precio del producto es menor o igual a un valor dado
        double maxPrice = 1000.0;
        boolean priceLessThanOrEqualTo = product.isPriceLessThanOrEqualTo(maxPrice);
        if (priceLessThanOrEqualTo) {
            System.out.println("El precio del producto es menor o igual a " + maxPrice);
        } else {
            System.out.println("El precio del producto no es menor o igual a " + maxPrice);
        }

        // Verificar si el nombre del producto contiene una palabra clave
        String keyword = "lap";
        boolean nameContainsKeyword = product.doesNameContain(keyword);
        if (nameContainsKeyword) {
            System.out.println("El nombre del producto contiene la palabra clave: " + keyword);
        } else {
            System.out.println("El nombre del producto no contiene la palabra clave: " + keyword);
        }
    }
}
