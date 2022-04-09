import java.sql.SQLOutput;

public class Player {
    //instance variable
    private String name;
    private String gender;
    private double height;
    private int age;

    //constructor
    public Player(String name,String gender,double height,int age){
        this.name=name;
        this.gender = gender;
        this.height = height;
        this.age = age;
    }

    //method1
    public static String scream(){
        return "Aaaargh!";
    }

    public static void scream2(){
        System.out.println("Aaaargh!");
    }

    //method2
    public void greeting(String g){
        System.out.println(g);
    }

    //method3
    public double score(){
        return this.age*this.height;
    }

    //method4
    public int add(int num1, int num2){
        return num1+num2;
    }

    //toString() method
    public String toString(){
        return "Name:"+name+"\nAge:"+age+"\nGender:"+gender+"\nHeight:"+height;
    }


    public static void main(String[] args){
        //class == abstract data type
        Player abc = new Player("abc","Male",150.3, 19);
        Player.scream2();
        abc.greeting("Hello!");
        System.out.println(abc.score());
        System.out.println(abc.add(5,3));

        System.out.println(abc);


    }
}



