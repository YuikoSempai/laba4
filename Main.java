import src.InvalidPhoneNumberException;
import src.Karlson;
import src.Location;
import src.Telephone;
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
            public void use(String status) {
                status = status.toLowerCase();
                if(status == "open"){
                    doorStatus="open";
                    System.out.println("door is closed now");
                }
                if(status == "close"){
                    doorStatus = "close";
                    System.out.println("door is closed now");
                }
                if(status == "knock"){
                    System.out.println("стук в дверь");
                }
            }

            @Override
            public String getStatus() {
                return doorStatus;
            }
        };

        kar.use(door,"knock");
        System.out.println(door.getStatus());
        door.use("knock");
        try {
            for (Thing i : kitchen.getAllThing()) {
                System.out.print(i.getName() + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }

        Telephone test = new Telephone("Сотовый", room);
        try{
            test.call("+79111274352");
        }catch(InvalidPhoneNumberException e){
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
// Method-local Inner class: Telephone.java