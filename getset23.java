public class getset23 {

    public static void main(String[] args) {
        Pen p1 = new Pen();// created a pen obj called p1
        p1.setClor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
    
}
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setClor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}

// get: return the value
// set : modify the value
//this: it refers the current obj property
