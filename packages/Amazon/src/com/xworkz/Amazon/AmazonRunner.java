package com.xworkz.Amazon;

import com.xworkz.Amazon.app.Product;
import com.xworkz.Amazon.management.Amazon;

public class AmazonRunner {
    public static void main(String[] args) {
        System.out.println("Amazon product management started...");

        Product product = new Product();
        product.setProductId("AMZ001");
        product.setName("Samsung Galaxy S25");
        product.setCategory("Mobile");
        product.setPrice(69999.99);
        product.setQuantity(50);
        product.setSeller("Samsung Official Store");
        product.setRating(4.5);
        product.setAddedOn("16/08/2025");

        Amazon amazon = new Amazon();
        boolean added = amazon.addProduct(product);
        System.out.println("Product added: " + added);

        if (added) {
            amazon.getProductInfo();
        }
        amazon.updateProductprice(97699.00);
        if(amazon.updateProductprice(product.getPrice())){
            System.out.println("-------After update------------");
            amazon.getProductInfo();
        }else System.out.println("NOT UPDATED");
    }
}
