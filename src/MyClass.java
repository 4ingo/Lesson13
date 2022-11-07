public class MyClass {

//    MyClass деген класс тузунуз
//
//    Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//
//    Параметри эки башка болгон эки конструктор тузунуз
//
//    MyClassтын 2 объектисин тузуп, конструктор аркылуу мааани бериниз
//
//    Эки объектке эки башка конструктор иштесин.
//
//    Объекттердин маанилерин консольго чыгарыныз.



    private  String name;
    private String surname;
    private  int age ;
    private String [] courses;
    private  String favoriteFoods;
   public  MyClass(){

   }
    public  MyClass(String name,String surname){
        this.name=name;
        this.surname=surname;
    }
    public MyClass(int age, String [] courses, String favoriteFoods){
        this.age=age;
        this.courses=courses;
        this.favoriteFoods=favoriteFoods;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String []courses) {
        this.courses = courses;
    }

    public String getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(String favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }
}
