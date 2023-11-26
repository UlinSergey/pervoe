public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
       int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание №2");
         clientOS = 1;
         int clientDeviceYear = 2023;
         if (clientOS==1 && clientDeviceYear<2015){
             System.out.println("Установите облегченную версию приложения для iOS по ссылке");
         } else if (clientOS==1 && clientDeviceYear>=2015) {
             System.out.println("Установите версию приложения для iOS по ссылке");
         }else if (clientOS==0 && clientDeviceYear<2015) {
             System.out.println("Установите облегченную версию приложения для Android по ссылке");
         }else if (clientOS==0 && clientDeviceYear>=2015) {
             //Можно как понимаю указать последнее условие без (if (clientOS==0 && clientDeviceYear>=2015))
             System.out.println("Установите версию приложения для Android по ссылке");
         }

        System.out.println("Задание №3");
         int year=800;
        //Задал 800 для проверки
         if (year % 4==0 && year % 100!=0 && year>1584 || year % 400==0 && year>1584){
             // Указал 2 раза year>1584, иначе значение 800 являеться весокостным
             System.out.println(year+" год является високосным");
         } else {
             System.out.println(year+" год не является високосным");
         }

        System.out.println("Задание №4");
         int deliveryDistance = 95;
         if (deliveryDistance <=20){
             System.out.println("Потребуется дней: "+"одни сутки");
             //звучит очень странно но если отпираться от условий
         } else if (deliveryDistance>20 && deliveryDistance<60 ) {
             System.out.println("Потребуется дней: "+"двое суток");
         }else if (deliveryDistance>60 && deliveryDistance<100 ) {
             System.out.println("Потребуется дней: " + "трое суток");
         }else {
             System.out.println("доставки нет");
         }

        System.out.println("Задание №5");
         int month= 11;
         if (month>0 && month<13){
             switch (month){
                 case 12:
                 case 1:
                 case 2:
                     System.out.println("Зима");
                 break;
                 case 3:
                 case 4:
                 case 5:
                     System.out.println("Весна");
                     break;
                 case 6:
                 case 7:
                 case 8:
                     System.out.println("Лето");
                     break;
                 case 9:
                 case 10:
                 case 11:
                     System.out.println("Осень");
                     break;
             }
         }else {
             System.out.println("Всего 12 месяцев! Проверь данные");

         }
    }
}