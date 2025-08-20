package com.xworkz.mall.management;

import com.xworkz.mall.app.Shop;
import com.xworkz.mall.validator.ShopValidation;

public class ShoppingMall {
    private Shop shop;

    public boolean addShop(Shop shop) {
        boolean added = false;

        ShopValidation validator = new ShopValidation();
        boolean isValid = validator.validateShop(shop);

        if (isValid) {
            this.shop = shop;
            added = true;
        }
        return added;
    }

    public void getShopInfo() {
        System.out.println("Shop Name: " + shop.getName());
        System.out.println("Owner: " + shop.getOwner());
        System.out.println("Type: " + shop.getType());
        System.out.println("Floor: " + shop.getFloorNumber());
        System.out.println("Area: " + shop.getArea() + " sq.ft.");
        System.out.println("Open on Weekend: " + (shop.isOpenOnWeekend() ? "Yes" : "No"));
        System.out.println("Contact: " + shop.getContactNumber());
    }
}
