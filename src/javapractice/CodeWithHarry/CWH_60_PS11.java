package CodeWithHarry;
/*
//Question 1
abstract class Pen{
    abstract void write();
    abstract void refill();
}

//Question 2
class FountainPen extends Pen{

    void write(){
        System.out.println("Writing...");
    }

    void refill(){
        System.out.println("Refilling...");
    }
    
    void changeNib(){
        System.out.println("Changing the nib!");
    }
}

//Question 3
class Monkey{
    
    void jump(){
        System.out.println("Jumping...");
    }
    
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    
    public void speak(){
        System.out.println("Hello sir!");
    }
    
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
        
    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    } 
}

//Question 4
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();    
}
class Smartphone extends Telephone{
    
    @Override
    void lift(){
        System.out.println("Lifting...");
    }
    
    @Override
    void ring(){
        System.out.println("Ringing...");
    }
    
    @Override
    void disconnect(){
        System.out.println("Disconnecting...");
    }
    
    void camera(){
        System.out.println("Opening Camera...");
    }
}

//Question 6
interface TVRemote{
    void on();
    void off();
}

interface SmartTVRemote{
    void speechAssistant();
}
//Qestion 7
class TV implements TVRemote{
    
    @Override
    public void on(){
        System.out.println("Turning On...");
    }
    
    @Override
    public void off(){
        System.out.println("Turning Off...");
    }
}        
*/
public class CWH_60_PS11 {
    public static void main(String[] args) {
        /*
        //Question 1 and 2
        FountainPen fp = new FountainPen();
        fp.changeNib();
        
        //Question 3
        Human aditya = new Human();
        aditya.sleep();
        
        //Question 5
        Monkey m1 = new Human();
        m1.bite(); // --> allowed
        m1.jump(); // --> allowed
        //m1.speak(); // --> not allowed as the reference is of Monkey which does not have speak method
        BasicAnimal ba = new Human();
        ba.eat(); // --> allowed
        ba.sleep(); // --> allowed
        //ba.speak(); // --> not allowed as the reference is of BasicAnimal which does not have speak method
        
        //Question 4
        Telephone phone = new Smartphone();
        phone.lift(); // --> allowed
        phone.ring(); // --> allowed
        phone.disconnect(); //--> allowed
        //phone.camera(); // --> not allowed as this method is not in common with Telephone class
        
        //Question 6 and 7
        TVRemote tvr = new TV();
        tvr.on();
        tvr.off();  
        */
    }
}
