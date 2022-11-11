package HomeWork;

public class Main {
    public static void main(String[] args) {

        Human maxim = new Human("Максим", "Минск", 1988, "бренд менеджер");
        Human anna = new Human("Аня", "Москва", 1993, "методист образоватльных программ");
        Human katya = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        Human artyem = new Human("Артём", "Москва", 1995, "директор по развитию бизнеса");

        System.out.println(maxim.toString());
        System.out.println(anna.toString());
        System.out.println(katya.toString());
        System.out.println(artyem.toString());


    }
}
