package person;

public class PersonService {

    public static final String varA = "ZZZ";

    // final = varA poate fi setata doar odata de fiecare obiect
    // static = varA poate fi setat de un numar infinit de ori de catre Clasa sau obiecte, valoare va fi comuna pentru toate obiectele
    // static final = poate fi setata doar o singura data la de clasa la definire

//    public PersonService(String a) {
//        this.varA = a;
//    }

//    public final void amprenta(Person person) { // Vasile, Andrei
//        person.lasaAmprenta();
//    }

    public void apelare(Person person) { // Vasile, Andrei, Ion.......1000
       person.salut(); // Salut de la Vasile
       person.lasaAmprenta(); // Amprenta Vasile
       person.scrieCod(); // Scrie cod
       person.cantaLaPian(); // ERROR
       person.test(); // test
    }

//    public void apelare(Ion ion) {
//
//    }
//
//    public void apelare(Vasile vasile) {
//
//    }
//
//    public void apelare(Andrei andrei) {
//
//    }


//    public void setVarA(String a) {
//        varA = a;
//    }

    public String getVarA() {
        return varA;
    }
}
