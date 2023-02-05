public class Company {
    String name;
    String country;
    int yearOfFoundation;
    Person founder;
    Group[] groups;

    public Company(String name, String country, int yearOfFoundation, Person founder, Group[] groups) {
        this.name = name;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public Person getFounder() {
        return founder;
    }

    public Group[] getGroups() {
        return groups;
    }

}
