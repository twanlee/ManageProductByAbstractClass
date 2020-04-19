import java.util.Calendar;
import java.util.Date;

public class Meat extends Material implements ExpiryDateAndBilling, Discount{
    private int weight;
    public Meat(){};
    public Meat(String name, Date dateOfManufacture, int quantity, int cost, int weight){
        super(name, dateOfManufacture, quantity, cost);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public Date expiryDate() {
        Date expiryDate;
        Calendar cal = Calendar.getInstance();
        cal.setTime(getDateOfManufacture());
        cal.add(Calendar.DATE, 15);
        return expiryDate = cal.getTime();
    }

    @Override
    public int checkBill() {
        return getWeight()*getCost()*getQuantity();
    }

    @Override
    public int discountMoney(int percent) {
        return (checkBill()*percent)/100;
    }
    @Override
    public String display(){
        return super.display()+". Hạn sử dụng đến: " + expiryDate();
    }
}
