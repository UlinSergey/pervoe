public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        System.out.println("Задание №2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Задание №3");
        for (int i = 0; i <= 17; i = i + 2) {
            //Нуль не может быть как четной так и нечетной поэтому будь бы чуть другие условия использовал бы:
            //for (int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задание №4");
        for (int i = 10; i >=-10; i = i -1) {
            System.out.println(i);
        }
        System.out.println("Задание №5");
        for (int i = 1904; i <=2096; i = i +4) {
            System.out.println(i+"  год является високосным");
        }
        System.out.println("Задание №6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задание №7");
        for (int i = 1; i <= 1000; i = i * 2) {
            //Ввел значение i <= 1000, интереса ради но так как программа работает так как надо оставил
            System.out.println(i);
        }
        System.out.println("Задание №8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
        System.out.println("Месяц "+ i +", сумма накоплений равна "+total+" рублей");
        }
        System.out.println("Задание №9");
         salary = 29000;
         total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц "+ i +", сумма накоплений равна "+total+" рублей");
        }
        System.out.println("Задание №10");
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
    }
}