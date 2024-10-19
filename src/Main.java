public class Main {
    public static void main(String[] args) {
//Задача №1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
//Задача №2
        int t = 11;
        if (t <= 5) {
            System.out.println("На улице " + t + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + t + " градусов, можно идти без шапки");
        }
//Задача №3
        int s = 45;
        if (s >= 60) {
            System.out.println("Если скорость " + s + ", то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + s + ", то можно ездить спокойно");
        }
//Задача №4
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 2 && age < 7) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он только учится ходить");
        }
//Задача №5
        int yearsOld = 5;
        if (yearsOld < 5) {
            System.out.println("Если возраст ребёнка равен " + yearsOld + ", то ему нельзя кататься на аттракционе");
        } else if (yearsOld >= 5 && yearsOld < 14) {
            System.out.println("Если возраст ребёнка равен " + yearsOld + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (yearsOld >= 14) {
            System.out.println("Если возраст ребёнка равен " + yearsOld + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
//Задача №6
        int numberPassengers = 22;//количество пассажиров
        int carriageCapacity = 102;//вместимость вагона
        int seatsPlaces = 60;//сидячие места
        int standingPlaces = carriageCapacity - seatsPlaces;//стоячие места
        int placesRemaining = carriageCapacity - numberPassengers;//осталось мест
        if (placesRemaining == 0) {
            System.out.println("Вагон полностью забит");
        } else if (placesRemaining > 0 && placesRemaining <= 62) {
            System.out.println("В вагоне осталось " + placesRemaining + " стоячих мест");
        } else if (placesRemaining > 62 && placesRemaining < 102) {
            System.out.println("В вагоне осталось " + (placesRemaining - seatsPlaces) + " сидячих мест и " + standingPlaces + " стоячих");
        } else {
            System.out.println("Вагон полностью свободен");
        }
// Задача №6
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one + " - большее число");
        } else if (two > one && two > three) {
            System.out.println(two + " - большее число");
        } else {
            System.out.println(three + " - большее число");
        }
    }
}