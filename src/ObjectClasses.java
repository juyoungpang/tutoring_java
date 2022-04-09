public class ObjectClasses {
    public static void main(String[] args){
        //String
        /*
        •	Concatenation (+)
        •	int length()
        •	String substring(int index_from(포함ㅇ), int index_to(포함x))
        •	String substring(int from)
        •	int indexOf(String str)
        •	int compareTo(String other)
        •	boolean equals(String other)
         */
        System.out.println("============String============");
        String str1 = "Awesome";
        String str2 = new String("Wonderful");

        String str3 = str1 + " and " + str2;
        System.out.println(str3);

        int stringLength = str1.length();
        System.out.println("String length:"+stringLength);
        System.out.println("substring1:"+str1.substring(1,3));
        System.out.println("substring2:"+str1.substring(4));
        System.out.println("index of es:"+str1.indexOf("es"));
        System.out.println("index of AAA:"+str1.indexOf("AAA"));  //없으면 -1
        System.out.println("str1 compare to str2:"+str1.compareTo(str2)); //negative
        System.out.println("str2 compare to str1:"+str2.compareTo(str1)); //positive
        System.out.println("str1 equals str2:"+str1.equals(str2)); //True or False


        //Math class
        /*
        •	double random()
        •	double pow(double, double)
        •	double abs(double)
        •	int abs(int)
        •	double sqrt(double)
         */
        System.out.println("============Math============");
        int random = (int)(Math.random()*10)+1;
        double absNum = Math.abs(-5.1);
        double powNum = Math.pow(3.0,2.0);
        double sqrtNum = Math.sqrt(64);

        System.out.println(random+"\n"+absNum+"\n"+powNum+"\n"+sqrtNum);

    }
}
