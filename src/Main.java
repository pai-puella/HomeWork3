
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int myInt = 11;
        byte myByte = 5;
        short myShort = 100;
        long myLong = 1000000000L;
        float myFloat = 3.14f;
        double myDouble = 2.71645;

        System.out.println("Значение переменной myInt c типом int равно " + myInt);
        System.out.println("Значение переменной myByte c типом byte равно " + myByte);
        System.out.println("Значение переменной myShort c типом short равно " + myShort);
        System.out.println("Значение переменной myLong c типом long равно " + myLong);
        System.out.println("Значение переменной myFloat c типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble c типом double равно " + myDouble);

        //System.out.println("Задача 2");

        double myDouble1 = 27.12;
        long myLong1 = 987678965549L;
        float myFloat1 = 2.786f;
        int myInt1 = 569;
        int myInt2 = -159;
        int myInt3 = 27897;
        int myInt4 = 67;

        System.out.println();
        System.out.println("Задача 3");

        int studentsOfLudmilaPavlovna = 23;
        int studentsOfAnnaSergeevna = 27;
        int studentsOfEkaterinaAndreevna = 30;
        int totalSheets = 480;
        int totalStudents = studentsOfLudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna;

        int sheetsPerStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        System.out.println();
        System.out.println("Задача 4");

        int bottlesPerTwoMinutes = 16;
        int bottlesPerMinute = bottlesPerTwoMinutes / 2;
        int minutes1 = 20;
        int minutes2 = 24 * 60;
        int minutes3 = 3 * 24 * 60;
        int minutes4 = 10 * 24 * 60;

        int bottlesPer20Minutes = bottlesPerMinute * minutes1;
        int bottlesPerDay = bottlesPerMinute * minutes2;
        int bottlesPer3Days = bottlesPerMinute * minutes3;
        int bottlesPerMonth = bottlesPerMinute * minutes4;

        System.out.println("За " + minutes1 + " минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За " + minutes2 + " минут машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За " + minutes3 + " минут машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За " + minutes4 + " минут машина произвела " + bottlesPerMonth + " штук бутылок");

        System.out.println();
        System.out.println("Задача 5");

        int totalPaintCans = 120;
        int whitePaintCansPerClass = 2;
        int brownPaintCansPerClass = 4;

        int numberOfClasses = totalPaintCans / (whitePaintCansPerClass + brownPaintCansPerClass);
        int whitePaintCans = numberOfClasses * whitePaintCansPerClass;
        int brownPaintCans = numberOfClasses * brownPaintCansPerClass;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaintCans + " банок белой краски и " + brownPaintCans + " банок коричневой краски");

        System.out.println();
        System.out.println("Задача 6");

        int bananasWeight = 5 * 80;
        int milkWeight = 2 * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;

        int breakfastWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double breakfastKgWeight = breakfastWeight / 1000.0;

        System.out.println("Вес спортзавтрака: " + breakfastWeight + " г (" + breakfastKgWeight + ") кг");

        System.out.println();
        System.out.println("Задача 7");

        int targetWeightLoss = 7;
        int minDailyWeightLoss = 250;
        int maxDailyWeightLoss = 500;

        int daysMinWeightLoss = targetWeightLoss * 1000 / minDailyWeightLoss;
        int daysMaxWeightLoss = targetWeightLoss * 1000 / maxDailyWeightLoss;
        int averageDaysWeightLoss = (daysMinWeightLoss + daysMaxWeightLoss) / 2;

        System.out.println("Дней на похудение (250 г в день): " + daysMinWeightLoss);
        System.out.println("Дней на похудение (500 г в день): " + daysMaxWeightLoss);
        System.out.println("Среднее количество дней на похудение: " + averageDaysWeightLoss);


    }
}