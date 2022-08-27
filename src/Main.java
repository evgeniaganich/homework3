public class Main {
    public static void main(String[] args) {
        int firstNumber = 50000;
        byte secondNumber = 7;
        short thirdNumber = 200;
        long fourthNumber = 1000000000000L;
        float fifthNumber = 3.14f;
        double sixthNumber = 5.5555555;
        System.out.println("Значение переменной firstNumber с типом int равно " + firstNumber);
        System.out.println("Значение переменной secondNumber с типом byte равно " + secondNumber);
        System.out.println("Значение переменной thirdNumber с типом short равно " + thirdNumber);
        System.out.println("Значение переменной fourthNumber с типом long равно " + fourthNumber);
        System.out.println("Значение переменной fifthNumber с типом float равно " + fifthNumber);
        System.out.println("Значение переменной sixthNumber с типом double равно " + sixthNumber);

        float numberOne = 27.12f;
        long numberTwo = 987678965549L;
        byte numberThree = 2;
        short numberFour = 786;
        boolean numberFive = false;
        short numberSix = 569;
        short numberSeven = -159;
        short numberEight = 27897;
        byte numberNine = 67;
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);
        System.out.println(numberFour);
        System.out.println(numberFive);
        System.out.println(numberSix);
        System.out.println(numberSeven);
        System.out.println(numberEight);
        System.out.println(numberNine);

        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        int totalNumberOfStudents = studentsLP + studentsAS + studentsEA;
        short sheetsOfPaperTotal = 480;
        int sheetsOfPaperPerStudent = sheetsOfPaperTotal / totalNumberOfStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaperPerStudent + " листов бумаги.");

        short machineProductivityFor20Minutes = 16 * 20 / 2;
        System.out.println("За 20 минут машина произвела бутылок " + machineProductivityFor20Minutes + " шт");
        short machineProductivityFor24hours = 16 * 24 / 2;
        System.out.println("За 24 часа машина произвела бутылок " + machineProductivityFor24hours + " шт");
        short machineProductivityFor3Days = 16 * 72 / 2;
        System.out.println("За 3 дня машина произвела бутылок " + machineProductivityFor3Days + " шт");
        short machineProductivityFor1Month = 16 * 720 / 2;
        System.out.println("За 1 месяц машина произвела бутылок " + machineProductivityFor1Month + " шт");

        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int numberOfCansPerClass = whitePaintPerClass + brownPaintPerClass;
        byte totalNumberOfCans = 120;
        int numberOfClasses = totalNumberOfCans / numberOfCansPerClass;
        int totalNumberOfWhitePaint = numberOfClasses * whitePaintPerClass;
        int totalNumberOfBrownPaint = numberOfClasses * brownPaintPerClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalNumberOfWhitePaint + " банок белой краски и " + totalNumberOfBrownPaint + " банок коричневой краски.");

        byte bananaWeight = 80;
        int totalBananaWeight = bananaWeight * 5;
        byte milkWeight = 105;
        int totalMilkWeight = milkWeight * 2;
        byte iceCreamWeight = 100;
        int totalIceCreamWeight = iceCreamWeight * 2;
        byte eggWeight = 70;
        int totalEggWeight = eggWeight * 4;
        float totalBreakfastWeight = totalEggWeight + totalBananaWeight + totalMilkWeight + totalIceCreamWeight;
        float totalBreakfastWeightInKilos = totalBreakfastWeight / 1000;
        System.out.println("Вес спорт-завтрака составляет " + totalBreakfastWeightInKilos + " кг.");

        int weightToLose = 7000;
        int daysLeft500 = weightToLose / 500;
        int daysLeft250 = weightToLose / 250;
        System.out.println("На похудение уйдет " + daysLeft500 + " дней, если спортсмен будет терять каждый день по 500 г, и " + daysLeft250 + " дней, если будет терять каждый день по 250 г." );

    int incomeMasha = 67760;
    int newIncomeMasha = incomeMasha + incomeMasha / 10;
    int incomeDenis = 83690;
    int newIncomeDenis = incomeDenis + incomeDenis / 10;
    int incomeCristina = 76230;
    int newIncomeCristina = incomeCristina + incomeCristina / 10;
    int yearlyIncomeMasha = incomeMasha * 12;
    int newYearlyIncomeMasha = newIncomeMasha * 12;
    int yearlyGrowthMasha = newYearlyIncomeMasha % yearlyIncomeMasha;
        int yearlyIncomeDenis = incomeDenis * 12;
        int newYearlyIncomeDenis = newIncomeDenis * 12;
        int yearlyGrowthDenis = newYearlyIncomeDenis % yearlyIncomeDenis;
        int yearlyIncomeCristina = incomeCristina * 12;
        int newYearlyIncomeCristina = newIncomeCristina * 12;
        int yearlyGrowthCristina = newYearlyIncomeCristina % yearlyIncomeCristina;
        System.out.println("Маша теперь получает " + newIncomeMasha + " рублей. Годовой доход вырос на " + yearlyGrowthMasha + " рублей.");
        System.out.println("Денис теперь получает " + newIncomeDenis + " рублей. Годовой доход вырос на " + yearlyGrowthDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newIncomeCristina + " рублей. Годовой доход вырос на " + yearlyGrowthCristina + " рублей.");
    }
}