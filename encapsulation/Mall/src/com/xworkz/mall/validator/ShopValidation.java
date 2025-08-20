package com.xworkz.mall.validator;

import com.xworkz.mall.app.Shop;

public class ShopValidation {
    public  boolean validateShop(Shop shop) {
        boolean validated = false;

        boolean nameValid = false;
        boolean ownerValid = false;
        boolean typeValid = false;
        boolean floorValid = false;
        boolean areaValid = false;
        boolean contactValid = false;

        if (shop.getName() != null && !shop.getName().isEmpty()) {
            nameValid = true;
        } else System.out.println("Invalid Shop Name");

        if (shop.getOwner() != null && !shop.getOwner().isEmpty()) {
            ownerValid = true;
        } else System.out.println("Invalid Shop Owner");

        if (shop.getType() != null && !shop.getType().isEmpty()) {
            typeValid = true;
        } else System.out.println("Invalid Shop Type");

        if (shop.getFloorNumber() >= 0) {
            floorValid = true;
        } else System.out.println("Invalid Floor Number");

        if (shop.getArea() > 100) {
            areaValid = true;
        } else System.out.println("Invalid Shop Area");

        if (shop.getContactNumber() != null && shop.getContactNumber().length() == 10) {
            contactValid = true;
        } else System.out.println("Invalid Contact Number");

        if (nameValid && ownerValid && typeValid && floorValid && areaValid && contactValid) {
            validated = true;
        }

        return validated;
    }
}

