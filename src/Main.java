
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

        System.out.println("Задача 3");

        int studentsOfLudmilaPavlovna = 23;
        int studentsOfAnnaSergeevna = 27;
        int studentsOfEkaterinaAndreevna = 30;
        int totalSheets = 480;
        int totalStudents = studentsOfLudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna;

        int sheetsPerStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

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

        System.out.println("За " + minutes1 + " минут машина произвела " + bottlesPer20Minutes + " бутылок");
        System.out.println("За " + minutes2 + " минут машина произвела " + bottlesPerDay + " бутылок");
        System.out.println("За " + minutes3 + " минут машина произвела " + bottlesPer3Days + " бутылок");
        System.out.println("За " + minutes4 + " минут машина произвела " + bottlesPerMonth + " бутылок");

    }
}