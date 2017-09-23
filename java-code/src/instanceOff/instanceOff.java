package instanceOff;

public class instanceOff {

    public static void main(String[] args) {
        
 
       Person[] person = new Person[4];
        
       person[0] = new Employee("Adam", "Grabarczyk", 65000);
       
       person[1] = new Student("Mateusz", "Jakiś");
      
       person[1].downloadDescrition();
       
       for (Person personn: person) {
       
           if (personn instanceof Employee)      // deklaruje instancje klasy person(sprawdza czy jest egzemplarzem klasy person)
           {
               ((Employee)personn).downloadDescrition();
           }
       }
       
    }

    
}


abstract class Person {

String name;

String surname;

   Person(String name, String surname) {
    
    this.name = name;
    
    this.surname = surname;
        
    }
    
abstract void downloadDescrition();

}


class Employee extends Person{

double salary;

    public Employee(String name, String surname, double salary) {
 
        super(name, surname);
        
        this.salary = salary;
    }

    @Override
    void downloadDescrition() {
        System.out.println("Jestem Pracownikiem");
        System.out.println("moje imię to: " + name);
        System.out.println("moje nazwisko to: " + surname);
        System.out.println("moje wynagrodzenie to: " + salary);
    }
    

 void work () {
 
     System.out.println("ja pracuj");
 
 }


}


class Student extends Person{
 
   Student(String name, String surname) {
    
    super(name, surname);                      // wywołujemy wyżej położony konstruktor
    }

    @Override
    void downloadDescrition() {
        System.out.println("Jestem Studentem");
        System.out.println("moje imię to: " + name);
        System.out.println("moje nazwisko to: " + surname);
    }
    
    
}

