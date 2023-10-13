package org.example.model;

import java.util.Arrays;

public class ProductsArray {

    private Product[] products;

    public ProductsArray(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }



    // nuevas funciones implentadas

    public Product[] getProductsByStartingLetter(char letra){
        // la variable posiciones almancenas las posicioes delos array que cumplen con la condicion
        String posiciones ="";

        // recorremos para encontrar las posicioones de los prodcutos que cumplen con la condicion
        for (int i = 0; i < this.products.length; i++) {
            //String letra = Character.toString(this.products[i].getName().charAt(0));
            char letraArray =  Character.toLowerCase(this.products[i].getName().charAt(0));
            if (letra == letraArray){
                posiciones+= i + " ";
            }
        }

        String[] arrayPosiciones= posiciones.split(" ");
        int sizeArrayResponse= arrayPosiciones.length;
        Product[] arrayResponse= new Product[sizeArrayResponse];

        // agregamos los productos que cimpen con la condiciones
        for ( int i= 0; i < sizeArrayResponse;i++){
            // posicion en el que estan los prodcutos que debo agregar al array de respuestas
            //int posicionProduct= Character.getNumericValue(posiciones.charAt(i));
            int posicionProduct= Integer.parseInt(arrayPosiciones[i]);
            arrayResponse[i]=this.products[posicionProduct];

        }

        return arrayResponse;
    }

    public Product[] sortProducts() {

        String[] nombres = new String[this.products.length];
        Product[] arrayOrdenado = new Product[this.products.length];

        // recorremos para extraer lo nombres y ordenarlos
        for (int i = 0; i < this.products.length; i++) {
            nombres[i] = this.products[i].getName();
        }

        // ordeno el array de nombres
        Arrays.sort(nombres);

        // ponerlos en el nuevo array de manera ordenada
        boolean bandera = true;
        for (int i = 0; i < this.products.length; i++) {
            int j = 0;

            while (bandera || j < this.products.length) {

                if ( nombres[i].equals(this.products[j].getName())) {
                    arrayOrdenado[i] = this.products[j];
                    bandera = false;
                }

                j++;
            }


        }
        for( Product producto:arrayOrdenado ){
            System.out.println(producto);
        }
        return arrayOrdenado;
    }





    @Override
    public String toString() {
        return super.toString();
    }
}
