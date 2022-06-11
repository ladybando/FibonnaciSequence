public class Veggie {

        public static void main(String[] args) {
            Corn corn = new Corn();
            Carrot carrot = new Carrot();
            Vegetable squash = new Vegetable("Squash");

            System.out.println("Names: " + corn.name + ", " + carrot.name + ", " + squash.name);
        }
    }

    class Corn extends Vegetable {
        public Corn() {
            super("Corn");
        }
    }

    class Carrot extends Vegetable {
        public Carrot() {
            super("Carrot");
        }
    }

    abstract class Vegetable {
        String name;

        public Vegetable(String name) {
            this.name = name;
        }
    }

