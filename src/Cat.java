public class Cat {
    //1. instance variables
    private String eyecolor;
    private int size;

    //2. constructor
    public Cat(){
        eyecolor = "grey";
        size = 40;
    }

    public Cat(int input_size, String input_eyecolor){
        eyecolor = input_eyecolor;
        size = input_size;
    }

    //3. method
    //getter method
    public int getSize(){
        return size;
    }
    //setter method
    public void setSize(int newSize){
        size = newSize;
    }

    public void cry(){
        System.out.println("Meow!");
    }

    public static void main(String[] args){
        Cat meme = new Cat(30,"blue");
        Cat nabi = new Cat();
        meme.setSize(50);
        int meme_size = meme.getSize();
        System.out.println(meme_size);

    }
}
