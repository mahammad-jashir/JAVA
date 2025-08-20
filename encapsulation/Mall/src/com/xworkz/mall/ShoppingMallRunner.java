package com.xworkz.mall;

import com.xworkz.mall.app.Shop;
import com.xworkz.mall.management.ShoppingMall;

    public class ShoppingMallRunner {
        public static void main(String[] args) {
            System.out.println("Shopping Mall started...");

            Shop shop = new Shop();
            shop.setName("Trendy Wear");
            shop.setOwner("Rahul Mehta");
            shop.setType("Clothing");
            shop.setFloorNumber(2);
            shop.setArea(450.5);
            shop.setOpenOnWeekend(true);
            shop.setContactNumber("9876543210");

            ShoppingMall mall = new ShoppingMall();
            boolean added = mall.addShop(shop);
            System.out.println("Shop added: " + added);

            if (added) {
                mall.getShopInfo();
            }
        }
    }


