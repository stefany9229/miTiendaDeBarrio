package org.example.model;

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

    public Product[] sortProducts(){
    return null;

    }


    @Override
    public String toString() {
        return super.toString();
    }
}
