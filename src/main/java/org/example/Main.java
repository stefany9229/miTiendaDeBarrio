package org.example;

import jdk.swing.interop.LightweightFrameWrapper;
import org.example.model.Product;
import org.example.model.ProductsArray;

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


        // Crear un array de productos
        Product[] products = new Product[6]; // Puedes ajustar el tamaño según tus necesidades

        // Agregar productos al array
        products[0] = new Product("Crema", 10.99, 20);
        products[1] = new Product("Almidon", 7.99, 15);
        products[2] = new Product("Aros de cebolla 3", 5.49, 30);
        products[3] = new Product("Zapayo", 10.99, 20);
        products[4] = new Product("Yuca", 7.99, 15);
        products[5] = new Product("Buñuelos", 5.49, 30);

        ProductsArray prodcutsArray = new ProductsArray((products));

        //System.out.println(prodcutsArray.getProductsByStartingLetter('c')[0]);
        //System.out.println(prodcutsArray.getProductsByStartingLetter('a')[0]);
       // System.out.println(prodcutsArray.getProductsByStartingLetter('a')[1]);

        prodcutsArray.sortProducts();


    }
}
