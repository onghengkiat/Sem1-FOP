
public class PersonProfile {

    protected String name, gender, dateOfBirth;

    public PersonProfile() {

    }

    public PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public void display() {
        System.out.println("The name of the person is " + this.name);
        System.out.println("The gender of the person is " + this.gender);
        System.out.println("The date of birth of the person is " + this.dateOfBirth);
    }
}