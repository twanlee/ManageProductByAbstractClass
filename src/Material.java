import java.util.Date;

public abstract class Material {
    private static int id = 0;
    private int materialID;
    private String name;
    private Date dateOfManufacture;
    private int quantity;
    private int cost;
    public Material(){};
    public Material(String name, Date dateOfManufacture, int quantity,int cost){
        this.name = name;
        this.dateOfManufacture = dateOfManufacture;
        this.quantity = quantity;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getId() {
        return materialID;
    }

    public void setId() {
        materialID = id;
        id++;
    }
    public String display(){
        return "Lô hàng: "+ getName() + " có mã id: " + getId() + " có giá: " + getCost() + " số lượng : " + getQuantity();
    }
}
