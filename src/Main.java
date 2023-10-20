import device.Device;
import device.Iphone;
import figura.*;
import person.*;

public class Main {
    public static void main(String[] args) {

//        Cerc cerc = new Cerc();
//        Triunghi triunghi = new Triunghi();
//        Patrat patrat = new Patrat();
//        Dreptunghi dreptunghi = new Dreptunghi();
//        Paralepipid paralepipid = new Paralepipid();
//
//        FiguraService figuraService = new FiguraService();
//        figuraService.disenez(cerc);
//        figuraService.disenez(triunghi);
//        figuraService.disenez(patrat);
//        figuraService.disenez(dreptunghi);
//        figuraService.disenez(dreptunghi);
//        figuraService.disenez(paralepipid);
////
//
//
//        Person vasile = new Vasile();
//        vasile.lasaAmprenta();
//
//        Person person = new Andrei();
//        person.lasaAmprenta();

//
//        PersonService personService = new PersonService();
//        personService.amprenta(new Vasile());


//        PersonService.amprenta(new Andrei());

//        PersonService personService = new PersonService();
//        personService.amprenta(new Vasile());

//        PersonService.amprenta(new Vasile());

//        PersonService personService = new PersonService();
//        personService.setVarA("CCC");

//        PersonService personService1 = new PersonService();
//        personService1.setVarA("DDDD");

//        PersonService personService2 = new PersonService();
//        personService2.setVarA("EEE");

//        personService.setVarA("FFF");


//        System.out.println(PersonService.varA); // EEE



//        Person person = new Andrei();
//        person.lasaAmprenta(); // Amprenta Andrei

        // Aceiase metoda este folosita de mai multe clase (metoda comuna)
        // Clasa parinte preia forma copilului sau (copie comportamentul copilului)\

//        PersonService personService = new PersonService();
//        personService.apelare(new Ion());



//        double a = 500;
//
//        int b = (int)a; // (int)a = 500
//
//        System.out.println(b);
//        System.out.println(a);
//
//        float c = 200;
//
//        int t = (int)c;
//
//        boolean y = true;
//
////        int m = (int)y;
//
//
//        String j  =  "9";
//
//        Integer p = new Integer(j);
//
//        int l = p;


        Person person = new Andrei();

        Andrei andrei = (Andrei) person;


        Device device = new Iphone();

        Iphone iphone = (Iphone) device;



        Double aDouble = new Double(2);

        Integer y = aDouble.intValue();

    }









}