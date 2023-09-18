public class Main
{
    public static void main(String[] args)
    {
        Product product1 = new Product(1,"Laptop", 999.99);
        Product product2 = new Product(2,"Smartphone", 499.99);
        Product product3 = new Product(3,"Headphones", 79.99);
        Product product4 = new Product(4, "Mouse",50);

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);
        cart.addItem(product4);

        cart.displayCart();

        cart.removeItem(product2);

        cart.displayCart();
    }

}