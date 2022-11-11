package HomeWork;

public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name.isBlank()) {
            this.name = "----";
        } else {
            this.name = name;
        }
        if (town == null || town.isBlank()) {
            this.town = "----";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isBlank()) {
            this.jobTitle = "----";
        } else {
            this.jobTitle = jobTitle;
        }
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. Моя должность: " +
                jobTitle + ". Будем знакомы!";
    }
}
