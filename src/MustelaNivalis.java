public class MustelaNivalis {
    public static String name;
    private static String color;
    private String getColor(){
        return color;
    }
    public void sayHello (){
        System.out.println("Hello, my name is "+ name +". " + "My color is " + color+".");
    }
        public static void main(String[] args) {
            MustelaNivalis Snizhok = new MustelaNivalis();
            Snizhok.name = "Snizhok";
            Snizhok.color = "white";
            Snizhok.sayHello ();




            MustelaNivalis Barsyk = new MustelaNivalis();
            Barsyk.name = "Barsyk";
            Barsyk.color = "red";
            Barsyk.sayHello();

        }
    }



