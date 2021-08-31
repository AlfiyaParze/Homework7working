package geekbrains.homeworks.Homework7working;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety = p.foodEaten; //сытость приравнивается к "еда съедена"
        if (satiety) {
            System.out.println(name + " ate " + appetite + " food");
        } else {
            System.out.println(name + " didn't eat");
        }
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

}