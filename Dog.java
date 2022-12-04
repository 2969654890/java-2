package Second_Xier;

public class Dog extends Animal{

    private boolean isVaccineInjected;

    public Dog(String name, int age, String gender, double price) {

        super(name, age, gender, price);


    }

    public boolean isVaccineInjected() {
        return isVaccineInjected;
    }

    public void setVaccineInjected(boolean vaccineInjected) {
        isVaccineInjected = vaccineInjected;
    }
}
