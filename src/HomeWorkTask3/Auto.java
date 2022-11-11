package HomeWorkTask3;

public class Auto {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Auto(String brand, String model, double engineVolume, String color, int year, String country) {


        this.brand = validOrDefault(brand, "---");
        this.model = validOrDefault(model, "default");
        this.engineVolume = engineVolume > 0.0d ? engineVolume : 1.5d;
        this.engineVolume = engineVolume;
        this.color = validOrDefault(color, "---");
        this.year = year > 0.0d ? year : 2000;
        this.country = validOrDefault(country, "---");
    }

    private String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    @Override
    public String toString() {
        return "Марка - " + brand + ". Модель - " + model + ". Объем двигателя - " + engineVolume + ". Цвет кузова - " +
                color + ". Год производства - " + year + ". Страна производства - " + country;
    }
}
