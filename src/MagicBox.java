import java.util.Random;

public class MagicBox<T> {
    private static final Random randomizer = new Random();
    private T[] items;

    public MagicBox(int lengthItems) {
        this.items = (T[]) new Object[lengthItems];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Добавили: " + item);
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format("Коробка не полна, необходимо добавить еще элемент", items.length - i));
            }
        }
        int randomCell = randomizer.nextInt(items.length - 1);
        return items[randomCell];
    }
}