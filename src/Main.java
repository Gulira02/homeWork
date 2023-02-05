
public class Main {
    public static void main(String[] args) {
        //Company деген класс тузунуз, полелери (company name, country, year of foundation,
        // founder, groups[]).
        //Group деген класс тузунуз, полелери(group name, start date, mentor),
        // ушул класс Company класска поле катары массив болуп барат.
        //Person деген класс тузунуз, полелери(first name, last name, date of birth)
        // ушул класс Company жана Group класстарга поле катары барат.
        //main ден класстардын объектин тузуп полелерине маани бериниз жана консольго чыгарыныз.
        Person founder = new Person("Gottlieb ", " Daimler", "17.03.1834");

        Group group1 = new Group("Mercedes-Benz", "05.02.2021", founder);
        Group group2 = new Group("MayBach", "01.02.2022", founder);
        Group group3 = new Group("Smart", "01.02.2023", founder);
        Group[] groups = {group1, group2, group3};// array

        Company company = new Company("DAIMLER", "Germany", 1926, founder, groups);
        System.out.println("Company name: " + company.getName());
        System.out.println("Company country: " + company.getCountry());
        System.out.println("Company year of foundation: " + company.getYearOfFoundation());
        System.out.println("Founder:  ");
        System.out.println("First name: " + company.getFounder().getFirstName());
        System.out.println("Last name: " + company.getFounder().getLastName());
        System.out.println("Date of birth: " + company.getFounder().getDateOfBirth());


        System.out.println("Groups: ");
        for (Group group : company.getGroups()) {
            System.out.println("Name: " + group.groupName + " Start date: " + group.startDate +
                    " Mentor: " + group.getGroupName() + " " + group.mentor.getLastName());
        }

    }
}




