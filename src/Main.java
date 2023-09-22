import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Если возраст человека " + age + " лет, то он не достиг" +
                    " совершеннолетия, нужно подождать " + (18 - age) + " лет");
        } else {
            System.out.println("Если возраст человека " + age + " лет, то он достиг совершеннолетия");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько градусов на улице?");
        int temp = sc.nextInt();
        String weather;
        if (temp < 5 && temp > -70) {
            weather = "холодно";
            System.out.println("На улице довольно " + weather + ", " + temp + " градусов, нужно надеть шапку");
        } else if (temp >= 40 && temp < 80) {
            weather = "жара";
            System.out.println("На улице " + weather + ", " + temp + " градусов, удачи тебе там без головного убора");
        } else if (temp <= -70 || temp >= 80) {
            weather = "уже все равно";
            System.out.println("Если на улице " + temp + " градусов, то " + weather + " шапка тут не поможет");
        } else {
            weather = "тепло";
            System.out.println("На улице довольно " + weather + ", " + temp + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваша скорость: ");
        int speed = sc.nextInt();
        if (speed > 60) {
            System.out.println("Придется заплптить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст человека: ");
        int age = sc.nextInt();
        String place;
        if (age < 2) {
            place = "никуда не надо";
            System.out.println("Если возраст человека равен " + age + " лет, то ему " + place);
        } else if (age >= 2 && age <= 6) {
            place = "в детский сад";
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить " + place);
        } else if (age >= 7 && age <= 17) {
            place = "в школу";
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить " + place);
        } else if (age >= 18 && age <= 24) {
            place = "в университет";
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить " + place);
        } else {
            place = "на работу";
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить " + place);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст ребенка: ");
        int age = sc.nextInt();
        String opportunity;
        if (age < 5) {
            opportunity = "нельзя кататься на аттракционе";
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему " + opportunity);
        } else if (age >= 5 && age < 14) {
            opportunity = "можно кататься на аттракционе в сопровождении взрослого";
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему " + opportunity);
        } else {
            opportunity = "можно кататься на аттракционе без сопровождения взрослого";
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему " + opportunity);
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество людей в вагоне: ");
        /*
        При выполнении данного задания, предполагается, что сначала занимаются все сидчие места
        и только потом стоячие.
         */
        int fullness = sc.nextInt();
        int seats = 60;
        int full = 102;
        if (fullness < 60) {
            System.out.println("В вагоне " + (seats - fullness) + " сидячих мест и " + (full - seats) + " стоячих");
        } else if (fullness >= 60 && fullness < 102) {
            System.out.println("В вагоне нет сидячих мест, но осталось " + (full - fullness) + " стоячих");
        } else {
            System.out.println("В вагоне мест нет. Никаких. Вообще. Все, пока");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int one = sc.nextInt();
        System.out.println("Введите второе число: ");
        int two = sc.nextInt();
        System.out.println("Введите третье число: ");
        int three = sc.nextInt();
        if (one == two && one == three) {
            System.out.println("Вы ввели три одинаковых числа " + one);
        } else if (one >= two && one >= three) {
            System.out.println("Вау! Число " + one + " самое большое");
        } else if (two >= one && two >= three) {
            System.out.println("Самое большое из введенных- число " + two);
        } else {
            System.out.println("Ого! Из этих чисел самое большое- " + three);
        }
        sc.close();
    }
}
