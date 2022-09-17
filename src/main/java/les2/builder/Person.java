package les2.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person(){

    }

    public Person(String firstName, String lastName, String middleName, String country, String address, String phone, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final Person person;

        public Builder() {
            this.person = new Person();
        }

        public Builder withFirstName(String firstName){
            this.person.setFirstName(firstName);
            return this;
        }

        public Builder withLastName(String lastName){
            this.person.setLastName(lastName);
            return this;
        }
        public Builder withMiddleName(String middleName){
            this.person.setMiddleName(middleName);
            return this;
        }
        public Builder withCountry(String country){
            this.person.setCountry(country);
            return this;
        }
        public Builder withAddress(String address){
            this.person.setAddress(address);
            return this;
        }
        public Builder withPhone(String phone){
            this.person.setPhone(phone);
            return this;
        }
        public Builder withAge(int age){
            this.person.setAge(age);
            return this;
        }
        public Builder withGender(String gender){
            this.person.setGender(gender);
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
