public class Main {
    public static void main(String[] args) {
        var dog=8;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание 1 выполнено
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание 2 выполнил
        dog = (int) (dog - 3.5);
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание 3 выполнено
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        //Задание 4 выполнено
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        //Задание 5 выполнено
        var box1= 78.2;
        var box2= 82.7;
        var box_comen= box1+box2;
        var box_dif0= box1-box2;
        System.out.println(box_comen+"кг.");
        System.out.println(box_dif0+"кг");
        //Задание 6 выполнено
        var box_dif1= box2-box1;
        System.out.println(box_dif1);
        var box_dif2= box2 % box1;
        System.out.println(box_dif2);
        //Задание 7 выполнено
        var totalHours=640;
        var normHour= 9;
        var people= totalHours/normHour;
        System.out.println("Всего работников в компании —  "+people+" человек");
        // задача 8 пункт 1 выполнен
        people=people+94;
        var newHour=totalHours / people;
        System.out.println("Если в компании работает "+people+" человек, то всего "+newHour+" часов работы может быть поделено между сотрудниками");
        // Задача 8 пункт 2 выполнен
    }
}