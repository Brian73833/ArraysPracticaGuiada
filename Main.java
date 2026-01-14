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
            System.out.println("Pet added successfully");
        } else {
            System.out.println("Failed to add pet");
        }

        if (person.removePet(pet1)) {
            System.out.println("Pet removed successfully");
        } else {
            System.out.println("Failed to remove pet");
        }

    }
}