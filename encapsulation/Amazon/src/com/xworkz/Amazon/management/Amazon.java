package com.xworkz.Amazon.management;

import com.xworkz.Amazon.app.Product;
import com.xworkz.Amazon.validate.ProductValidate;

public class Amazon {
    private Product product;

    public boolean addProduct(Product product) {
        boolean added = false;

        ProductValidate validator = new ProductValidate();
        boolean isValid = validator.validateProduct(product);

        if (isValid) {
            this.product = product;
            added = true;
        }

        return added;
    }

    public void getProductInfo() {
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Name: " + product.getName());
        System.out.println("Category: " + product.getCategory());
        System.out.println("Price: ₹" + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Seller: " + product.getSeller());
        System.out.println("Rating: " + product.getRating());
        System.out.println("Added On: " + product.getAddedOn());
    }
    public boolean updateProductprice(double price){
        boolean isPriceUpdated=false;
        if(price>0){
         product.setPrice(price);
         isPriceUpdated=true;
        }
        return isPriceUpdated;

    }
}

