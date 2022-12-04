package Second_Xier;

import java.time.LocalDate;

public class Customer {

    private String customerName;

    private int presentTime;

    private LocalDate arriveTime;

    private double MoneyReward;

    public double getMoneyReward() {
        return MoneyReward;
    }

    public void setMoneyReward(double moneyReward) {
        MoneyReward = moneyReward;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPresentTime() {
        return presentTime;
    }

    public void setPresentTime(int presentTime) {
        this.presentTime = presentTime;
    }

    public LocalDate getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(LocalDate arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Customer(String customerName, int presentTime) {
        this.customerName = customerName;
        this.presentTime = presentTime;
        this.arriveTime = LocalDate.now();
    }

    @Override
    public String toString() {
        return "---"+"\n"+"customer Name: "+this.customerName+"\n"
                +"present time: "+this.presentTime+"\n"
                +"arrive time: "+this.arriveTime;
    }
}
