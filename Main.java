import src.Karlson;
import src.Location;
// import src.Person;
import src.AbsClass.*;

public class Main {
    public static void main(String[] args) {
        Location room = new Location("Комната");
        Location kitchen = new Location("Кухня");
        System.out.println(Location.LocationInfo.getMaxCountPerson());
        // Person human = new Person("Иван", room);
        Karlson kar = new Karlson("Карлсон", room);
        System.out.println(kar.vint.getVintStatus());
        kar.move(kitchen);
        System.out.println(kar.getLocation().getName());

        Item door = new Item("Door", room) {
            String doorStatus = "Closed";

            @Override
            public void use() {
                if (doorStatus == "Closed") {
                    doorStatus = "Open";
                    System.out.println("Door is open now");
                } else {
                    doorStatus = "Closed";
                    System.out.println("Door is closed now");
                }
            }

            @Override
            public String getStatus() {
                return doorStatus;
            }
        };

        kar.use(door);
        System.out.println(door.getStatus());
        door.use();
        try {
            for (Thing i : kitchen.getAllThing()) {
                System.out.print(i.getName() + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
// Добавлено проверяемое исключение ArrayListException in Location.java in
// getAllPerson()
// Добавлено не проверяемое исключение LocationOverFlow in Location.java in
// addPerson()
// Переделать метод getAllPerson in Location.java
// Попробовать придумать как перемещать в доступную локацию персонажей при
// выбросе исключения LocationCountException
// inner class: Vint in Karlson.java
// Anonymous class: Predmet door = new Predmet(){} in Main.java
// Static nested class: Location.java public static class LocationInfo
// Method-local Inner class: