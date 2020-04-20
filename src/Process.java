import java.sql.Timestamp;
import java.util.Date;

public class Process {
    public static void main(String[] args) {
        Date flourDate = new Date(2019-1900, 6-1, 20);
        Date meetDate = new Date(2020-1900, 4-1, 19);
        Material[] listOfMaterial = new Material[10];
        listOfMaterial[0] = new CrispyFlour("Vedan", flourDate, 10, 20000);
        listOfMaterial[1] = new CrispyFlour("Knor", flourDate, 10, 25000);
        listOfMaterial[2] = new CrispyFlour("Ạinomoto", flourDate, 10, 15000);
        listOfMaterial[3] = new CrispyFlour("Chinsu", flourDate, 10, 20000);
        listOfMaterial[4] = new CrispyFlour("Bako", flourDate, 10, 30000);
        listOfMaterial[5] = new Meat("Pork", meetDate, 20, 150000, 5);
        listOfMaterial[6] = new Meat("Chicken", meetDate, 20, 45000, 5);
        listOfMaterial[7] = new Meat("Beef", meetDate, 20, 200000, 5);
        listOfMaterial[8] = new Meat("Shrimp", meetDate, 20, 500000, 5);
        listOfMaterial[9] = new Meat("Duck", meetDate, 20, 50000, 5);

        setID(listOfMaterial);
        display(listOfMaterial);
        System.out.println("======");
        System.out.println("Total price: " + totalPrice(listOfMaterial));
        System.out.println("Amont of discount: " + discount(listOfMaterial));
        System.out.println("======");
        System.out.println("Price after discounted: " + (totalPrice(listOfMaterial) - discount(listOfMaterial)));

    }
    public static void display(Material[] arr){
        for (Material x : arr) {
            if (x instanceof Meat) {
                x = (Meat) x;
                System.out.println(((Meat) x).display());
            } else if (x instanceof CrispyFlour) {
                x = (CrispyFlour) x;
                System.out.println(((CrispyFlour) x).display());
            }
        }
    }

    public static void setID(Material[] arr) {
        for (Material x : arr) {
            x.setId();
        }
    }

    public static int discount(Material[] arr) {
        int discount = 0;
        for (Material x : arr) {
            if (x instanceof Meat) {
                x = (Meat) x;
                discount = ((Meat) x).discountMoney(10);
            } else if (x instanceof CrispyFlour) {
                x = (CrispyFlour) x;
                discount = ((CrispyFlour) x).discountMoney(5);
            }
        }
        return discount;
    }

    public static int totalPrice(Material[] arr){
        int sum = 0;
        for (Material x : arr) {
            if (x instanceof Meat) {
                x = (Meat) x;
                sum += ((Meat) x).checkBill();
            } else if (x instanceof CrispyFlour) {
                x = (CrispyFlour) x;
                sum += ((CrispyFlour) x).checkBill();
            }
        }
        return sum;
    }
}

