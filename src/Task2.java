public class Task2 {

    String word;
    int x;
    char character;

    private Task2(){
        System.out.println("Private constructor is called.");
    }
    public Task2(String word){
        System.out.println(word+" constructor is called.");
    }
    Task2(int x){
        System.out.println("Default constructor is called "+x+" time.");
    }
    private Task2(char character){
        System.out.println("Private constructor is called"+character);
    }

    public static void main(String[] args) {
        Task2 const1 = new Task2();

    }
}


/*
Write a java class that have 4 constructors with 4 different access levels of
constructors(private,public,default,protected) and create
4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside
different package and observe result.

 */
