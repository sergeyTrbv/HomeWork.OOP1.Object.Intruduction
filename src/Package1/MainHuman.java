package Package1;

import java.time.LocalDate;

public class MainHuman {
    public static void main(String[] args) {
        int currentYear = 2022;
        Human maxim = new Human("Максим", "Минск", 1988, "бренд менеджер");
        Human anna = new Human("Аня", "Москва", 1993, "методист образоватльных программ");
        Human katya = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        Human artyem = new Human("Артём", "Москва", 1998, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", currentYear - 21, null);

        System.out.println(maxim.toString());
        System.out.println(anna.toString());
        System.out.println(katya.toString());
        System.out.println(artyem.toString());
        System.out.println(vladimir.toString());
        System.out.println(LocalDate.now());


    }
}