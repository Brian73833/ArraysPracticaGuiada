
public class Main {

    public static void main(String[] args) {

        /*
         * int[] numbers = { 10, 20, 30, 40, 50 };
         * 
         * String[] fruits = new String[3];
         * 
         * System.out.println(numbers[2]);
         * System.out.println(fruits[2]);
         * 
         * Person person = new Person("Brian", 19, 2);
         * 
         * System.out.println(person.getPets());
         * 
         * for (Pet pet : person.getPets()) {
         * System.out.println(pet.getPetName());
         * }
         */

        PetManager petManager = new PetManager(5);
        Person person = new Person("Brian", 19, petManager);
        Pet pet1 = new Pet("Goldie", "Fish");

        if (person.addPet(pet1)) {
            IOManager.printMessage("Pet added successfully");
        } else {
            IOManager.printMessage("Failed to add pet");
        }

        if (person.removePet(pet1)) {
            IOManager.printMessage("Pet removed successfully");
        } else {
            IOManager.printMessage("Failed to remove pet");
        }

        if (person.getPets().length == 0) {
            IOManager.printMessage("No pets found");
        } else {
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }

    }
}