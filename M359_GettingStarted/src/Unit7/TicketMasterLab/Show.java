package Unit7.TicketMasterLab;

public class Show {
    private String date, performer, city;
    private double price;
    private int qty;

    public Show(String date, double price, int qty, String performer, String city){
        this.date = date;
        this.price = price;
        this.qty = qty;
        this.performer = performer;
        this.city = city;
    }

    public String toString(){
        String str = "";
        str += date + "\t";
        str += "$" + price + "\t\t";
        str += qty + "\t\t";
        str += performer + "\t\t";
        str += city + "\n";
        return str;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
