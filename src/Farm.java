import java.util.Arrays;

public class Farm {
    private String ownerName;
    private String address;
    private DomesticAnimal[] animals;

    public Farm(String ownerName, String address){
        this.ownerName = ownerName;
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DomesticAnimal[] getAnimals() {
        return animals;
    }

    public void setAnimals(DomesticAnimal[] animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "ownerName='" + ownerName + '\'' +
                ", address='" + address + '\'' +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}
