import java.util.Calendar;
import java.util.Date;

public class CrispyFlour extends Material implements ExpiryDateAndBilling,Discount {
    public CrispyFlour(){};
    public CrispyFlour(String name, Date dateOfManufacture, int quantity,int cost){
        super(name, dateOfManufacture, quantity, cost);
    }

    public int checkPrice(){
       return getQuantity()*getCost();
    }
    @Override
    public Date expiryDate() {
        Date expirationDate;
        Calendar cal = Calendar.getInstance();
        cal.setTime(getDateOfManufacture());
        cal.add(Calendar.MONTH, 12);
        return expirationDate = cal.getTime();
    }


    @Override
    public int checkBill() {
        return getQuantity()*getCost();
    }

    @Override
    public int discountMoney(int percent) {
        return (checkBill()*percent)/100;
    }
    @Override
    public String display(){
        return super.display()+".Sản xuất ngày: " + getDateOfManufacture()+" .Hạn sử dụng đến: " + expiryDate();
    }
}
