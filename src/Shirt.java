public class Shirt {
    public int shirtID = 5;
    public String description = "-some description-";
    public String colorCode = "red";
    public double price = 20.4;
    public int quantityInStock = 581;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}