package _3;

public class Person {

    private String name;
    private String address;
    private int age;

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PERSON" +
                "\nname = " + name +
                "\nage = " + age +
                "\naddress = " + address;
    }

    @Override
    public int hashCode() {
        if (name != null && address != null){
            return name.hashCode() + age + address.hashCode();
        } else {
            return 0;
        }
    }

}
