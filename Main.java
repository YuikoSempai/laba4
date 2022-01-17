import src.InvalidPhoneNumberException;
import src.Karlson;
import src.Location;
import src.Telephone;
import src.absClass.*;
import src.interfaces.DoorInterface;
import src.Person;

public class Main {
    public static void main(String[] args) {
        Location room = new Location("Комната");
        Location kitchen = new Location("Кухня");
        System.out.println(Location.LocationInfo.getMaxThingCount());
        Person human = new Person("Иван", room);
        Karlson kar = new Karlson("Карлсон", room);
        System.out.println(kar.vint.getVintStatus());
        kar.move(kitchen);
        System.out.println(kar.getLocation().getName());

        DoorInterface door = new DoorInterface() {
            String doorStatus = "Closed";

            public void open() {
                doorStatus = "Open";
            }

            public void close() {
                doorStatus = "Closed";
            }

            public String getDoorStatus() {
                return doorStatus;
            }
        };

        door.open();
        System.out.println(door.getDoorStatus());
        door.close();
        try {
            for (Thing i : kitchen.getAllThing()) {
                System.out.print(i.getName() + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }

        Telephone test = new Telephone("Сотовый", room);
        try {
            test.call("+7911127435552");
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e);
        }

    }

}
// Добавлено проверяемое исключение ArrayListException in Location.java in
// getAllPerson()
// Добавлено не проверяемое исключение LocationOverFlow in Location.java in
// addPerson()
// Переделать метод getAllPerson in Location.java +
// Попробовать придумать как перемещать в доступную локацию персонажей при +
// выбросе исключения LocationCountException +
// inner class: Vint in Karlson.java
// Anonymous class: Predmet door = new Predmet(){} in Main.java
// Static nested class: Location.java public static class LocationInfo
// Method-local Inner class: Telephone.java