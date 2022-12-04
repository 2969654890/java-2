package Second_Xier;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop{

    private double balance;

    private boolean isWorking;

    private double profit;


    public MyAnimalShop(double balance, boolean isWorking) {
        this.balance = balance;
        this.isWorking = isWorking;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public void addNewAnimals(Animal animal, ArrayList<Animal> listAnimal,double aninmalBuyProce,MyAnimalShop myAnimalShop) {

        if(myAnimalShop.getBalance() - animal.getAninmalBuyPrice() <0){

            throw new InsufficientBalanceException("购买资金不足。");

        }else {

            animal.setAninmalBuyPrice(aninmalBuyProce) ;

            balance = balance - animal.getAninmalBuyPrice() ;

            listAnimal.add(animal);

        }

    }

    @Override
    public void sellAnimals(Animal animal, Customer customer,ArrayList<Customer> listCustomer,ArrayList<Animal> listAnimal,MyAnimalShop myAnimalShop) {

        if(listAnimal == null){

            throw new ArithmeticException("宠物店无动物。");

        } else {

            boolean f = true;

            for (Customer Customer : listCustomer){

                if(Customer.equals(customer)){

                    f = false;

                    break;

                }
            }

            if(f){

                listCustomer.add(customer);

            }

            customer.setPresentTime(customer.getPresentTime() + 1);

            customer.setMoneyReward(customer.getMoneyReward() + animal.getAnimalSellPrice() - animal.getAninmalBuyPrice());

            balance = animal.getAnimalSellPrice() + balance;

            listAnimal.remove(animal);

        }

    }

    @Override
    public void isWorking(ArrayList<Customer> listCustomer) {

        if(isWorking) System.out.println("The shop is working.");

        else {

            System.out.println("The shop is not working.");

            for (Customer customer : listCustomer) {

                if (customer.getArriveTime().isEqual(LocalDate.now())) {

                    profit = profit + customer.getMoneyReward();

                    System.out.println(customer.toString());

                }
            }

            System.out.println();

            System.out.println("今天的利润为: " + profit + "元");

        }
    }



}
