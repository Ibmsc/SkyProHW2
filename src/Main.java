public class Main {
    public static void main(String[] args) {


        //Задача №1

        byte b = 125;
        short s = 234;
        int i = 1;
        Long l = 922L;
        float f = 77.77F;
        double d = 16.16;
        //boolean booIsAdult = b > 126; // true или false;
        char simbol = 33;


        // Задача 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double SummaWeightAllBoxer = boxer1 + boxer2;
        double DifferenceWeithAllBoxer = boxer2 - boxer1;
        System.out.println("Разница в весе " + DifferenceWeithAllBoxer + " Кг.");
        System.out.println("Общий вес боксеров " + SummaWeightAllBoxer + " Кг.");


        // Задача 3

        int banana = 5;
        int bananaWeigth = 80;

        int milk = 200/100;
        int milkWeigth = 105 ;

        int icecream = 2;
        int icecreamWeight = 100;

        int egg = 4;
        int eggWeight = 70;

        int mixBlander = (banana * bananaWeigth) + (milk * milkWeigth) + (icecream * icecreamWeight) + (egg * eggWeight);

        int gramsinKgs = 1000;

        double mixBlanderKg = mixBlander / (gramsinKgs*1.0);
        System.out.println("Всего вес спорт-завтрака " + mixBlander + " граммов " + " или " + mixBlanderKg + " Кг");


        // Задача 4
        int needLeft = 7*1000;
        int leftInDay1 = needLeft / 250;
        int leftInDay2 = needLeft / 500;
        int midDay = (leftInDay1 + leftInDay2) / 2;
        System.out.println( leftInDay1 +" дней при потере по 250г. в день" + " или " +
                leftInDay2 + " дней при потере по 500г. в день"  );
        System.out.println("В среднем может потребоваться " + midDay + " дней.");


        // Задача 5

        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        int salaryMasha10 = (salaryMasha * 10) / 100 + salaryMasha;
        int salaryDenis10 = (salaryDenis*10) / 100 + salaryDenis;
        int salaryKristina10 = (salaryKristina*10) /100 + salaryKristina;

        int salaryMashaYear = (salaryMasha10 * 12) - (salaryMasha * 12) ;
        int salaryDenisYear = (salaryDenis10*12) - (salaryDenis * 12);
        int salaryKristinaYear = (salaryKristina10*12) - (salaryKristina * 12);

        System.out.println("Маша теперь получает " + salaryMasha10 + " рублей. " +
                "Годовой доход вырос на " + salaryMashaYear + " рублей. ");
        System.out.println("Денис теперь полчает " + salaryDenis10 + " рублей." +
                "Годовой доход вырос на " + salaryDenisYear + " рублей." );
        System.out.println("Кристина теперь получает " + salaryKristina10 + " рублей. " +
                "Годовой доход вырос на " + salaryKristinaYear + " рублей. ");
    }
}
// System.out.println("Пишем дз");
// System.out.println("Делаем коммит и пуш");
// System.out.println("Переходим в гитхаб");