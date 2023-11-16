public class Main {
    public static void main(String[] args) {
       //Задача №1
        byte dollar= 100;
        short dog=30000;
        int people= 2000000;
        long test= -900000000000L;
        float bread=1.25f;
        double probability=32.090977;
        System.out.println("Значение переменной "+"dollar "+"с типом "+"byte "+"равно "+dollar);
        System.out.println("Значение переменной "+"dog "+"с типом "+"short "+"равно "+dog);
        System.out.println("Значение переменной "+"people "+"с типом "+"int "+"равно "+people);
        System.out.println("Значение переменной "+"test "+"с типом "+"long "+"равно "+test);
        System.out.println("Значение переменной "+"bread "+"с типом "+"float "+"равно "+bread);
        System.out.println("Значение переменной "+"probability "+"с типом "+"double "+"равно "+probability);

        //Задача №2
        float m=27.12f;
        long a= 987678965549L;
        //соединий числа
        float l=2.786f;
        //сменил запятую на точку
        short b= 569;
        short c=-159;
        short f=27897;
        byte e = 67;
        System.out.println(m);
        System.out.println(a);
        System.out.println(l);
        System.out.println(b);
        System.out.println(c);
        System.out.println(f);
        System.out.println(e);

        //Задача №3
        byte LP= 23;
        byte AS= 27;
        byte EA= 30;
        short total=630;
        int student= total/(LP+AS+EA);
        System.out.println("На каждого ученика рассчитано "+student+" листов бумаги");

        //Задача №4
        byte minutes=2;
        byte bottles=16;
        int minute=bottles/minutes;
        int bottle= minute*20;
        System.out.println("За "+"20 минут "+"машина произвела "+bottle+" штук бутылок");
        //бутылок за 20 минут
        bottle= minute*20*3*24;
        System.out.println("За "+"сутки "+"машина произвела "+bottle+" штук бутылок");
        //бытылок за сутки
        bottle= minute*20*3*24*3;
        System.out.println("За "+"3 дня "+"машина произвела "+bottle+" штук бутылок");
        //бытылок за трое суток
        bottle= minute*20*3*24*3*10;
        System.out.println("За "+"1 месяц "+"машина произвела "+bottle+" штук бутылок");
        //бутылок за месяц

        //Задача №5
        byte cans=120;
        byte white=2;
        byte brown=4;
        int room=brown+white;
        int rooms=cans/room;
        int W=white*rooms;
        int B=brown*rooms;
        System.out.println("В школе, где "+rooms+ " классов, нужно "+W+" банок белой краски и "+B+" банок коричневой краски");

        //Задача №6
        int Bananas= 80*5;
        int Milk= 105*2;
        int plombir= 100*2;
        int Eggs= 70*4;
        int gram= Bananas+Milk+plombir+Eggs;
        int kilogram=gram/1000;
        System.out.println(gram+" грамм");
        System.out.println(kilogram+" килограмм");

        //Задача №7
        int purpose= 7*1000;
        short gram1=250;
        int days1= purpose/gram1;
        System.out.println(days1);
        short gram2=500;
        int days2= purpose/gram2;
        System.out.println(days2);
        int gram3=(gram1+gram2)/2;
        int days3= purpose/gram3;
        System.out.println(days3);

        //Задача №8
        int salaryM=67760;
        int salaryD=83690;
        int salaryK=76230;
        //зарплата

        double gainM=salaryM * 0.1;
        double gainD=salaryD * 0.1;
        double gainK=salaryK * 0.1;
        //прибавка

        double newSalaryM=salaryM+gainM;
        double newSalaryD=salaryD+gainD;
        double newSalaryK=salaryK+gainK;
        // новая зарплата

        int annualIncomeM=salaryM*12;
        int annualIncomeD=salaryD*12;
        int annualIncomeK=salaryK*12;
        //годовая зарплата

        double newAnnualIncomeM=newSalaryM*12;
        double newAnnualIncomeD=newSalaryD*12;
        double newAnnualIncomeK=newSalaryK*12;
        //Новая годовая зарплапта

        double differenceM=newAnnualIncomeM-annualIncomeM;
        double differenceD=newAnnualIncomeD-annualIncomeD;
        double differenceK=newAnnualIncomeK-annualIncomeK;
        //разница между годовыми зарплатами

        System.out.println("Маша теперь получает "+newSalaryM+" рублей. Годовой доход вырос на "+differenceM+" рублей" );
        System.out.println("Денис теперь получает "+newSalaryD+" рублей. Годовой доход вырос на "+differenceD+" рублей" );
        System.out.println("Кристина теперь получает "+newSalaryK+" рублей. Годовой доход вырос на "+differenceK+" рублей" );

    }
}