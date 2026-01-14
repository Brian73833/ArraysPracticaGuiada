
public class PetManager {

    private int petCount;
    private Pet[] pets;

    public PetManager(int numberOfPets) {

    }

    public boolean addPet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = pet;
                petCount++;
                return true;
            }
        }
        return false;
    }

    public boolean removePet(Pet pet){
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null && pets[i].equals(pet)) {
                for (int j = 0; j < pets[].length - 1; j++) {
                    
                }
            }
        }
        return false;
    }

}
