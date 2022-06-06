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

        int bananas = 80 * 5;
        int milk = 105 * 2;
        int icecream = 100 * 2;
        int eggs = 70 * 4;
        int mixBlander = bananas + milk + icecream + eggs;
        float mixBlanderKg = mixBlander / 1000f;

        System.out.println("Всего вес спорт-завтрака " + mixBlander + " граммов " + " или " + mixBlanderKg + " Кг");

        // Задача 4
        int needLeft = 7*1000;
        int leftInDay1 = needLeft / 250;
        int leftInDay2 = needLeft / 500;
        int midDay = (leftInDay1 + leftInDay2) / 2;
        System.out.println( leftInDay1 +" дней при потере по 250г. в день" + " или " +
                leftInDay2 + " дней при потере по 500г. в день"  );
        System.out.println("В среднем может потребоваться " + midDay + " дней.");
    }
}
// System.out.println("Пишем дз");
// System.out.println("Делаем коммит и пуш");
// System.out.println("Переходим в гитхаб");