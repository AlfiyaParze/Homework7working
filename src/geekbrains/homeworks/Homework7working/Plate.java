package geekbrains.homeworks.Homework7working;

import java.util.Scanner;

public class Plate {

    Scanner scanner = new Scanner(System.in);
    public boolean foodEaten = true; //еда съедена
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) { //уменьшаю еду в тарелке
        if (food == 0) {
            isEmptyPlate(n);
        } else if (food < n) {
            isEmptyPlate(n);
        } else {
            food -= n;
        }
    }

    public void isEmptyPlate(int n) { //если в тарелке недостаточно еды
        System.out.println("There's not enough of food. Cat needs " + n + " food. Will you add some more food? Answer 'yes' to add more food.");
        String answer = scanner.next();
        if (answer.equals("yes")) { //если согласен добавить еды
            addFood(n);
            foodEaten = true;
        } else {
            foodEaten = false;
            System.out.println("You didn't say yes and there's no add food for cats");
        }
    }

    public void addFood(int n) { //когда согласился добавить еды в миску
        System.out.println("How much food do you want to add?");
        int i = scanner.nextInt();
        food += i;
        info();
        while (food < n) { // while - проверяю, чтобы хватило еды на кота
            System.out.println("Add amount of food. It's not enough for cat");
            i = scanner.nextInt();
            food += i; // обновляю количество еды после пополнения миски
            info();
        }
        food -= n; // уменьшаю еду в миске на кол-во аппетита текущего кота
    }

    public void info() {
        System.out.println("Food in plate: " + food + "\n");
    }
}