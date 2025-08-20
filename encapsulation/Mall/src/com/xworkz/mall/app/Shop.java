package com.xworkz.mall.app;


    public class Shop {

        private String name;
        private String owner;
        private String type;
        private int floorNumber;
        private double area;
        private boolean openOnWeekend;
        private String contactNumber;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getOwner() {
            return owner;
        }
        public void setOwner(String owner) {
            this.owner = owner;
        }

        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }

        public int getFloorNumber() {
            return floorNumber;
        }
        public void setFloorNumber(int floorNumber) {
            this.floorNumber = floorNumber;
        }

        public double getArea() {
            return area;
        }
        public void setArea(double area) {
            this.area = area;
        }

        public boolean isOpenOnWeekend() {
            return openOnWeekend;
        }
        public void setOpenOnWeekend(boolean openOnWeekend) {
            this.openOnWeekend = openOnWeekend;
        }

        public String getContactNumber() {
            return contactNumber;
        }
        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }
}
