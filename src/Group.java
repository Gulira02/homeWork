public class Group {
    String groupName;
    String startDate;
    Person mentor;
    public Group(String groupName, String startDate, Person mentor) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getStartDate() {
        return startDate;
    }

    public Person getMentor() {
        return mentor;
    }
}
