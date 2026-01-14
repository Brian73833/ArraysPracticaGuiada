public class Person {

    private String name;
    private int age;
    private PetManager petManager;

    public Person(String name, int age, PetManager petManager) {
        this.name = name;
        this.age = age;
        this.petManager = petManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PetManager getPetManager() {
        return petManager;
    }

    public void setPetManager(PetManager petManager) {
        this.petManager = petManager;
    }

    public boolean addPet(Pet pet) {
        return petManager.addPet(pet);
    }

    public boolean removePet(Pet pet) {
        return petManager.removePet(pet);
    }

}
