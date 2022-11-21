package Package1;

public class Human {

    private int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name.isBlank()) {
            this.name = "~информация не указана~";
        } else {
            this.name = name;
        }
        if (town == null || town.isBlank()) {
            this.town = "~информация не указана~";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isBlank()) {
            this.jobTitle = "~без работы~";
        } else {
            this.jobTitle = jobTitle;
        }
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null && town.isBlank()) {
            this.town = "~Информация не указана~";
        } else {
            this.town = town;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + getTown() + " Я родился в " + getYearOfBirth() + " году. Моя должность: " +
                jobTitle + ". Будем знакомы!";
    }
}