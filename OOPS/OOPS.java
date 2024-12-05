/*
objects: entities
class: group of those entities

classes have attributes (properties) and functions (behaviours)

eg:
Object: pen
colour: String (blue)
tip: int (5)

setColour()
setTip()
*/

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();  //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}