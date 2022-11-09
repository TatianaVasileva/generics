public class Main {
    public static void main(String[] args) {
        stringsMagicBox();
        numbersMagicBox();
    }

    private static void stringsMagicBox() {
        System.out.println("Магическая коробка со строками: ");
        MagicBox<String> magicBox = new MagicBox<>(2);
        System.out.println("Попытка добавления " + magicBox.add("Золотая пыль"));
        System.out.println("Попытка добавления " + magicBox.add("Пыльца семицветика"));
        System.out.println("Попытка добавления " + magicBox.add("Куриные лапки"));

        String pick = magicBox.pick();
        System.out.println("Что же достали? " + pick);
    }

    private static void numbersMagicBox() {
        System.out.println("Магическая коробка с числами: ");
        MagicBox<Integer> magicBox = new MagicBox<>(3);
        System.out.println("Попытка добавления " + magicBox.add(1));
        Integer pick = magicBox.pick();
        System.out.println(pick);
    }
}