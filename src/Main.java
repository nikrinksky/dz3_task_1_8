public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        byte b = 1;
        short s = 2;
        int i = 4;
        long l = 8;
        float f = 4.4f;
        double d = 8.8;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
    }


    public static void task2() {
        System.out.println("Задача 2");
        float f = 27.12F;
        long l = 987678965549L;
        double d = 2.786;
        int i = 569;
        short s = -159;
        int n = 27897;
        byte b = 67;

        System.out.println(f + "\n" + l + "\n" + d + "\n" + i + "\n" + s + "\n" + n + "\n" + b);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte teacherLp = 23;
        byte teacherAs = 27;
        byte teacherEa = 30;
        int paper = 480;
        int totalStudent = teacherLp + teacherAs + teacherEa;

        int paperStudent = paper / totalStudent;

        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int bottlesTwoMin = 16;
        int bottlesOneMin = bottlesTwoMin / 2;
        int bottlesTwentyMin = bottlesOneMin * 20;
        int bottlesHour = bottlesOneMin * 60;
        int bottlesPerDay = bottlesHour * 24;
        int bottlesThreeDay = bottlesPerDay * 3;
        int bottlesMonth = bottlesPerDay * 30;

        System.out.println("За 20 минут машина произвела " + bottlesTwentyMin + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesMonth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCans = 2;
        int brownCans = 4;
        int totalRooms = totalCans / (whiteCans + brownCans);
        int totalCansWhite = whiteCans * totalRooms;
        int totalCansBrown = brownCans * totalRooms;

        System.out.println("В школе, где " + totalRooms + " классов, нужно " + totalCansWhite +
                " банок белой краски и " + totalCansBrown + " банок коричневой краски" );
    }

    public static void task6() {
        System.out.println("Задача 6");
        int banana = 5;
        int milk = 200;
        int ice = 2;
        int eggs = 4;

        int bananaInGrams = 80;
        int milkInGrams = 105;
        int iceInGrams = 100;
        int eggsInGrams = 70;

        int totalBananaInGram = banana * bananaInGrams;
        int totalMilkInGrams = milk / 100 * milkInGrams;
        int totalIceInGrams = ice * iceInGrams;
        int totalEggsInGrams = eggs * eggsInGrams;

        int breakfastSportsGrams = totalBananaInGram + totalMilkInGrams + totalIceInGrams + totalEggsInGrams;
        int gramsInKg = 1000;
        float breakfastSportsKg = breakfastSportsGrams / (float)gramsInKg;

        System.out.println("Вес спорт-завтрака в граммах - " + breakfastSportsGrams);
        System.out.println("Вес спорт-завтрака в килограммах - " + breakfastSportsKg);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int loseWeightKg = 7;
        int kgInGr = loseWeightKg * 1000;
        int loseWeightDayGr1 = 250;
        int loseWeightDayGr2 = 500;

        int loseWeightDays1 = kgInGr / loseWeightDayGr1;
        int loseWeightDays2 = kgInGr / loseWeightDayGr2;
        int averageDays = (loseWeightDays1 + loseWeightDays2) /2;

        System.out.println("Количество днейна похудение, при ежедневной потере веса на 250 грамм - " + loseWeightDays1);
        System.out.println("Количество днейна похудение, при ежедневной потере веса на 500 грамм - " + loseWeightDays2);

        System.out.println("Среднее количество дней на похудение, при ежедневной потере веса от 250 до 500 грамм - " + averageDays);
    }

    public static void task8() {
        System.out.println("Задача 8");
        float mashaInMonth = 67760;
        float denisInMonth = 83690;
        float kristinaInMonth = 76230;

        float mashaInYear = mashaInMonth * 12;
        float denisInYear = denisInMonth * 12;
        float kristinaInYear = kristinaInMonth * 12;
        float percent = 100;

        float mashaInMonthNew = mashaInMonth + (mashaInMonth/percent * 10);
        float mashaInYearNew = mashaInMonthNew * 12;
        float mashaDifference = mashaInYearNew - mashaInYear;
        System.out.println("Маша теперь получает " + mashaInMonthNew + " рублей. Годовой доход вырос на "
                + mashaDifference + " рублей");

        float denisInMonthNew = denisInMonth + (denisInMonth/percent * 10);
        float denisInYearNew = denisInMonthNew * 12;
        float denisDifference = denisInYearNew - denisInYear;
        System.out.println("Денис теперь получает " + denisInMonthNew + " рублей. Годовой доход вырос на "
                + denisDifference + " рублей");

        float kristinaInMonthNew = kristinaInMonth + (kristinaInMonth/percent * 10);
        float kristinaInYearNew = kristinaInMonthNew * 12;
        float kristinaDifference = kristinaInYearNew - kristinaInYear;
        System.out.println("Кристина теперь получает " + kristinaInMonthNew + " рублей. Годовой доход вырос на "
                + kristinaDifference + " рублей");
    }
}