package Package2;

import transport.Auto;

import java.time.LocalDate;

public class MainAuto {
    public static void main(String[] args) {

        Auto lada = new Auto("Lada", " Granta", 1.7, "Желтый", 2015, "Россия", "Механика", "Седан",
                "х111хх111", 3, "Летняя", new Auto.Key("БезУЗД", "БезБД"),
                new Auto.Incurance(LocalDate.now(), 10000, "111111111"));

        Auto audi = new Auto("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия", "Автомат",
                "Хэтчбэк", "х222хх222", 5, "Зимняя", new Auto.Key("УЗД", "БД"),
                new Auto.Incurance(LocalDate.now(), 12000, "222222222"));

        Auto bmw = new Auto("BMW", "Z8", 3.0, "Черный", 2021, "Германия", "Автомат", "Седан",
                "х333хх333", 2, "Летняя", new Auto.Key("УЗД", "БД"),
                new Auto.Incurance(LocalDate.now(), 14000, "333333333"));

        Auto kia = new Auto("KIA", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея", "Механика",
                "Пикап", "х444хх444", 7, "Зимняя", new Auto.Key("БезУЗД", "БезБД"),
                new Auto.Incurance(LocalDate.now(), 17000, "444444444"));

        Auto hyundai = new Auto("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея", "Автомат",
                "Седан", "х555хх555", 2, "Летняя", new Auto.Key("УЗД", "БД"),
                new Auto.Incurance(LocalDate.now(), 30000, "555555555"));
        ;

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        hyundai.setSeasonTires();
        System.out.println(hyundai);
    }
}
