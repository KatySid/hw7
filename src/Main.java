public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Murzik", 5);
        cats[1] = new Cat("Barsik", 15);
        cats[2] = new Cat("Pushok", 50);
        cats[3] = new Cat("Snegok", 25);
        cats[4] = new Cat("Mars", 30);
        Plate plate = new Plate(50);
        plate.info();

        // сначала просто по очереди кормим котов
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();
        }
        System.out.println("");
        printInfoCats(cats);
        System.out.println("");
        //теперь  попробуем докормить голодных котов, добавляя в тарелку
        while (!catsIsFullness(cats)) {
            for (int i = 0; i < cats.length; i++) {
                if(!cats[i].getFullness()){
                    plate.addFood(10);
                    plate.info();
                    cats[i].eat(plate);
                }
            }
        }
        System.out.println("");
        printInfoCats(cats);


    }
    public static void printInfoCats (Cat[] cats){
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].toString());
        }
    }

    public static boolean catsIsFullness(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].getFullness()) {
                return false;
            }
        }
        return true;
    }
}
