
public class PetManager {

    private int petCount;
    private Pet[] pets;

    public PetManager(int numberOfPets) {
        pets = new Pet[numberOfPets];
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

    public boolean removePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null && pets[i].equals(pet)) {
                for (int j = 0; j < pets.length - 1; j++) {
                    pets[j] = pets[j + 1];

                }
                pets[pets.length - 1] = null;
                petCount--;
                return true;
            }
        }
        return false;
    }

    public Pet[] getPets() {
        Pet[] petlist = new Pet[this.petCount];

        for (int i = 0; i < this.petCount; i++) {
            petlist[i] = this.pets[i];
        }
        return petlist;
    }
}
