package Second_Xier;

abstract class Animal  {

    private String animalName;

    private int animalAge;

    private String animalGender;

    private double animalSellPrice;

    private double aninmalBuyPrice;

    public double getAninmalBuyPrice() {
        return aninmalBuyPrice;
    }

    public void setAninmalBuyPrice(double aninmalBuyPrice) {
        this.aninmalBuyPrice = aninmalBuyPrice;
    }

    public Animal(String name, int age, String gender, double price) {

        this.animalName = name;
        this.animalAge = age;
        this.animalGender = gender;
        this.animalSellPrice = price;

    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimalGender() {
        return animalGender;
    }

    public void setAnimalGender(String animalGender) {
        this.animalGender = animalGender;
    }

    public double getAnimalSellPrice() {
        return animalSellPrice;
    }

    public void setAnimalSellPrice(double animalSellPrice) {
        this.animalSellPrice = animalSellPrice;
    }
}
