public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getFullness() {
        return fullness;
    }

    public void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Cat " + name + ", appetite = " + appetite + ", fullness = " + fullness;
    }
}

