package transport;

import java.time.LocalDate;

public class Auto {

    public static class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = validOrDefault(remoteEngineStart, "___");
            this.keylessAccess = validOrDefault(keylessAccess, "___");
        }

        @Override
        public String toString() {
            return " Запуск двигателя: " + remoteEngineStart + "; Доступ ключа: " + keylessAccess;
        }
    }

    public static class Incurance {
        private LocalDate validityPeriodIncurance;
        private int costOfIncurance;
        private String numberIncurance;

        public LocalDate getValidityPeriodIncurance() {
            return validityPeriodIncurance;
        }

        public int getCostOfIncurance() {
            return costOfIncurance;
        }

        public String getNumberIncurance() {
            return numberIncurance;
        }

        public Incurance(LocalDate validityPeriodIncurance, int costOfIncurance, String numberIncurance) {
            if (validityPeriodIncurance ==null) {
                this.validityPeriodIncurance = LocalDate.now().plusDays(365);
            } else {
                this.validityPeriodIncurance = validityPeriodIncurance;
            }
            if (costOfIncurance <0) {
                this.costOfIncurance = 0;
            } else {
                this.costOfIncurance = costOfIncurance;
            }
            this.numberIncurance = numberIncurance;
        }

        public String proverkaNumberIncurance() {
            if (numberIncurance.length() != 9) {
                return "false";
            }
            return getNumberIncurance();
        }


        @Override
        public String toString() {
            return " Срок действия страховки: " + validityPeriodIncurance + " Стоимость страховки : " + getCostOfIncurance() + " руб. Номер страховки: " + getNumberIncurance();
        }
    }

    private final String brand;
    private final String model;
    public double engineVolume;
    public String color;
    private final int year;
    private final String country;
    public String transmission;
    private final String bodyType;
    public String registrationNumbers;
    private final int numberOfSeats;
    public String tiresWinterOfSummer;
    private Key key;
    private Incurance incurance;

    public Auto(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
                String bodyType, String registrationNumbers, int numberOfSeats, String tiresWinterOfSummer, Key key, Incurance incurance) {
        this.brand = validOrDefault(brand, "---");
        this.model = validOrDefault(model, "default");
        this.engineVolume = engineVolume < 0.0d ? engineVolume : 1.5d;
        this.color = validOrDefault(color, "---");
        this.year = year > 0.0d ? year : 2000;
        this.country = validOrDefault(country, "---");
        this.transmission = validOrDefault(transmission, "___");
        this.bodyType = validOrDefault(bodyType, "___");
        this.registrationNumbers = registrationNumbers;
        this.numberOfSeats = numberOfSeats > 0 ? numberOfSeats : 5;
        this.tiresWinterOfSummer = validOrDefault(tiresWinterOfSummer, "___");
        this.key = key;
        this.incurance = incurance;
    }

    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public boolean registrationNumbersValid() {
        if (registrationNumbers.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.registrationNumbers.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    @Override
    public String toString() {
        return "Марка - " + getBrand() + ". Модель - " + getModel() + ". Объем двигателя - " + getEngineVolume() + ". Цвет кузова - " +
                getColor() + ". Год производства - " + getYear() + ". Страна производства - " + getCountry() + ". Коробка передач - " +
                getTransmission() + ". Тип кузова - " + getBodyType() + ". Регистрационный номер - " + getRegistrationNumbers() +
                ". Количество сидячих мест - " + getNumberOfSeats() + ". Тип резины - " + getTiresWinterOfSummer() + ". Ключ: " + key +
                ". Страховка: " + incurance;
    }

    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth >= 11 || currentMonth <= 3) {
            this.tiresWinterOfSummer = "Зимняя";
        } else {
            this.tiresWinterOfSummer = "Зимняя";
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumbers() {
        return registrationNumbers;
    }

    public void setRegistrationNumbers(String registrationNumbers) {
        this.registrationNumbers = registrationNumbers;
    }

    public String getTiresWinterOfSummer() {
        return tiresWinterOfSummer;
    }

    public void setTiresWinterOfSummer(String tiresWinterOfSummer) {
        this.tiresWinterOfSummer = tiresWinterOfSummer;
    }
}
