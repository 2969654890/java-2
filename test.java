package Second_Xier;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Mark",1,"Male",100);

        Cat cat1 = new Cat("May",0,"Female",200);

        fireloli fireloli1 = new fireloli("Opp",2,"Female",540);

        Customer customer1 = new Customer("John",0);

        Customer customer2 = new Customer("Peter",0);

        ArrayList<Animal> animalArrayList = new ArrayList<>();

        ArrayList<Customer> customerArrayList = new ArrayList<>();

        MyAnimalShop myAnimalShop = new MyAnimalShop(10000,true);

        myAnimalShop.addNewAnimals(dog1,animalArrayList,20,myAnimalShop);

        myAnimalShop.addNewAnimals(cat1,animalArrayList,20,myAnimalShop);

        myAnimalShop.addNewAnimals(fireloli1,animalArrayList,20,myAnimalShop);

        myAnimalShop.sellAnimals(cat1,customer1,customerArrayList,animalArrayList,myAnimalShop);

        myAnimalShop.sellAnimals(dog1,customer1,customerArrayList,animalArrayList,myAnimalShop);

        myAnimalShop.sellAnimals(fireloli1,customer2,customerArrayList,animalArrayList,myAnimalShop);

        myAnimalShop.setWorking(false);

        myAnimalShop.isWorking(customerArrayList);




    }

}
