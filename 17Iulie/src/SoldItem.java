public class SoldItem {
    private Product soldItem;
    private int ID;
    private String date;
    public int getQuantity(){
        return soldItem.getStockNumber();
    }

    public Product getSoldItem() {
        return soldItem;
    }

    public void setSoldItem(Product soldItem) {
        this.soldItem = soldItem;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
