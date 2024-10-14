import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things = new ArrayList<>();

    // реализуйте метод put()
    void put(Object object) {
        things.add(object);
    }
    // реализуйте метод check()
    boolean check(Object target) {
        for (Object object : things) {
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}