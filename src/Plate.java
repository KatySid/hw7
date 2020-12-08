public class Plate {
    int amount;

    public Plate(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void addFood(int food){
        if (food>0){
            amount+= food;
        }
    }

    public boolean decreaseFood(int appetite) {
        if (appetite < 0)   {
            return false;
        }
        if (amount < appetite){
            System.out.println("On plate not enough food");
            return false;
        }
        amount-= appetite;
        return true;
        }

    public void info() {
        System.out.println("On plate "+ amount + " food");
    }
}
