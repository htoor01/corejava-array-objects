public class Main {

    public static void main(String[] args) {

        // Food[] restaurant = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Chicken");
        Food food3 = new Food("Fries");

        Food[] restaurant = {food1, food2, food3};

        // restaurant[0] = food1;
        // restaurant[1] = food2;
        // restaurant[2]= food3;

        System.out.println(restaurant[0].name);

    }
}