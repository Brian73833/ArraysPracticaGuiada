public class Person {

    private String name;
    private int age;
    private PetManager petManager;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public boolean addPet(Pet pet) {
        return petManager.addPet(pet);
    }

}
