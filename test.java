import src.Telephone;
import src.Location;
import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) {
        Location room = new Location("room");
        Telephone telephone = new Telephone("test", room);
        String number = "";
        
        //Обращение к private field
        try {
            Field field = telephone.getClass().getDeclaredField("countryCode");// Получения поля с именем countryCode
            field.setAccessible(true); // Изначально поле не было публичным из-за чего приходится выдавать доступ на работу с ним
            field.set(telephone, "+8");
            number = (String) field.get(telephone);//сохранение значения этого поля. Изначально оно имеет тип Object, поэтому мы переносим его в String
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.getStackTrace();//Получение стек-трейса на текущий момент
        }   
        System.out.println(number);
        printCountryCode(telephone);

        //Создание объекта класса с помощью рефлексии
        Telephone telephone2 = null;
        try {
            Class clazz = Class.forName(Telephone.class.getName());
            Class[] parametrs = {String.class,Location.class};
            telephone2 = (Telephone) clazz.getDeclaredConstructor(parametrs).newInstance("test",room);
        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println(telephone2);
        System.out.println(Telephone.class.getName());
    }

    //обращение к private method
    public static void printCountryCode(Object telephone){
        try {
            Method method = telephone.getClass().getDeclaredMethod("printCountryCode");
            method.setAccessible(true);
            method.invoke(telephone);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    // //обращение к private method
    // public static void printCountryCode(Object telephone){
    //     try {
    //         Method method = telephone.getClass().getDeclaredMethod("printCountryCode");
    //         method.setAccessible(true);
    //         method.invoke(telephone);
    //     } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
    //         e.printStackTrace();
    //     }
    // }
}
