import java.util.List;
import java.util.ArrayList;

class Product
{
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart
{
    private List<Product> cartItems;


    public ShoppingCart()
    {
        cartItems = new ArrayList<>();
    }

    public void addItem(Product product)
    {
        cartItems.add(product);
    }

    public void removeItem(Product product)
    {
        cartItems.remove(product);
    }

    public void displayCart()
    {
        if (cartItems.isEmpty())
        {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Items in your shopping cart:");
            for (Product item : cartItems) {
                System.out.println(item.getName() + " - $" + item.getPrice());
            }
        }
    }
}
