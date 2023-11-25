public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        int age = 22;
        if (age >= 21) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        age = 17;
        if (age < 21) {
            System.out.println("Если возраст человека равен " + age + ", то не достиг совершеннолетия, нужно немного подождать");
        }


        System.out.println("Задача №2");
        int temperature = -8;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов," + " нужно надеть шапку");
        }
        temperature = 8;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов," + " можно идти без шапки");
        }


        System.out.println("Задача №3");
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то" + " придется заплатить штраф");
        }
        speed = 50;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то" + " можно ездить спокойно");
        }


        System.out.println("Задача №4");
        int years = 5;
        if (years > 2 && years < 6) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить" + " в детский сад");
        }
        years = 15;
        if (years > 7 && years < 17) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить" + " в школу");
        }
        years = 20;
        if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить" + " в университет");
        }
        years = 25;
        if (years > 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить" + " на работу");
        }


        System.out.println("Задача №5");
        age = 4;
        //непредставил какой тип, так как указывал такое же имя в первом задании
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему " + "нельзя кататься на аттракционе");
        }
        age = 7;
        if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему " + "можно кататься на аттракционе в сопровождении взрослого");
        }
        age = 20;
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему " + "можно кататься без сопровождения взрослого");
        }

        System.out.println("Задание №6");
        int human = 80;
        if (human < 102 && human > 60) {
            System.out.println("В вагоне есть только стоячее место");
        }
        human = 40;
        if (human < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("Вагон уже полностью забит");
        }


        System.out.println("Задача №7");
        int one=1;
        int two=2;
        int three=3;
        if (one > two && one > three) {
            System.out.println("Наибольшее число: " + one);
        }
        if (two > one && two > three) {
            System.out.println("Наибольшее число: " + two);
        }
        else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}