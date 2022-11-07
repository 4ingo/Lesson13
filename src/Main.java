import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        MyClass деген класс тузунуз
//
//        Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//
//        Параметри эки башка болгон эки конструктор тузунуз
//"
//        MyClassтын 2 объектисин тузуп, конструктор аркылуу мааани бериниз
//
//        Эки объектке эки башка конструктор иштесин.
//
//        Объекттердин маанилерин консольго чыгарыныз.

        String [] massive= new String[]{"java","English","Soft Skills"};

        MyClass myClass=new MyClass("Chyngyz","Turusbek uulu ");
        System.out.println(myClass.getName()+" "+myClass.getSurname()+" ");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        MyClass myClass1=new MyClass(9, massive,"beshbarmak");
        System.out.print("Age: " + myClass1.getAge()+ "\nFood:  " + myClass1.getFavoriteFoods() + "\nКурсы: ");

        for (String s : massive) {
            System.out.print(s + " ");
        }


    }
}