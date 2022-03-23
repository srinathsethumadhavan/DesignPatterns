interface Payment{

    void pay(int amount);
}


class Paypal implements Payment{
    void pay(int amount){

    }
}

class GooglePay implements Payment{
    void pay(int amount){

    }
}


class DebitCard implements Payment{
    void pay(int amount){
        
    }
}

class ShoppingCart{

    List<Product> productsList;

    void makePayment(Payment paymentType){
        
        paymentType.pay();
    }
}

class Product{
    String name;
    String productId;
}



class Driver{

    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.add(new Product(1));
    shoppingCart.add(new Product(2));

    shoppingCart.pay(new Paypal());

    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.add(new Product(1));
    shoppingCart.add(new Product(2));
    shoppingCart.pay(new DebitCard());


     ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.add(new Product(1));
    shoppingCart.add(new Product(2));
    shoppingCart.pay(new GooglePay());

}