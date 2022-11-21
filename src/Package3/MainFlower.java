package Package3;

public class MainFlower {
    public static void main(String[] args) {
        Flower rosa = new Flower("Роза", "Голландия", 35.59d, 5);
        Flower hrizantema = new Flower("Хризантема", null, 15.00d, 5);
        Flower gipsophila = new Flower("Гипсофила", "Турция", 19.5d, 10);

        Flower[] buket = {rosa, rosa, rosa, hrizantema, hrizantema, hrizantema, hrizantema, hrizantema,
                gipsophila};


        System.out.println(rosa.toString());
        System.out.println(hrizantema.toString());
        System.out.println(gipsophila.toString());
        // System.out.println(costBuket(buket));
        // System.out.println(lifeBuket(buket));
        System.out.println("Букет стоимостью: " + costBuket(buket) + " в котором цветы будут стоять: " + lifeBuket(buket) + " дней");

    }

    public static double costBuket(Flower[] buket) {
        int cost1 = 0;
        for (Flower a : buket) {
            cost1 += a.getCost();
        }
        return cost1 * 1.1;
    }

    public static int lifeBuket(Flower[] buket) {
        int day = 0;
        for (Flower a : buket) {
            day += a.lifeSpan;
        }
        return day / buket.length;
    }

}
