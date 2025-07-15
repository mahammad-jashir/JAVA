class Swiggy{

static double price;

public static double getPrice(String foodName){
if(foodName=="Burger"){
  price=199.00;
}
else if(foodName=="Pizza"){
  price=249.00;
}
else if(foodName== "Sandwich"){
    price = 149.00;
}
else if(foodName== "Pasta"){
    price = 229.00;
}
else if(foodName== "French Fries"){
    price = 99.00;
}
else if(foodName== "Noodles"){
    price = 179.00;
}
else if(foodName== "Wrap"){
    price = 159.00;
}
else if(foodName== "Fried Rice"){
    price = 199.00;
}
else if(foodName == "Momos"){
    price = 129.00;
}
else if(foodName == "Salad"){
    price = 119.00;
}
else{
System.out.println("Given food name is Invalid");
}
return price;
}
}