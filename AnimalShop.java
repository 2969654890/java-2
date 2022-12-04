package Second_Xier;

import java.time.LocalDate;
import java.util.ArrayList;

public interface AnimalShop {


    void addNewAnimals(Animal animal, ArrayList<Animal> listAnimal,double aninmalBuyProce,MyAnimalShop myAnimalShop);

    void sellAnimals(Animal animal, Customer customer,ArrayList<Customer> listCustomer,ArrayList<Animal> listAnimal,MyAnimalShop myAnimalShop);

    void isWorking(ArrayList<Customer> listCustomer);

}
