package com.rockthejvm;

public class  Main {
//    method signature  - Access Identifier, (static), return type + Method Name + list of args
// every Java file must have the method signature below
    public static void main(String[] args) {
//        int aNumber = 2;
//        int ANumber = 2;
//        int sum = aNumber + ANumber;

        // camelCasing is te standard for Java
        // int - normal numbers is 4 bytes
        // long - long numbers is 8 bytes
        // float - decimal is 4 bytes
        // double means a long decimal with 8 bytes
        // char is a character between''
        // boolean is true/false
        // String is text between ""
        // expressions

        // maths
        // int multiplyInt = 2 * 3;
        // int divideInt = 2 / 3;
        // int remainderInt = 7 % 3;



        // incrementing and DECREMENTING
        // pre-incrementing and post-incrementing
        // int someInt = 4;
        // int someInt2 = someInt++; // someInt2 = 4, someInt = 5
        // int someInt3 = ++someInt; // both variables are 5

//  math operators on decimals
//         double aDoubleSum = 2.3 + 4.5;


        // char operators
//        char aQuote = '\''; //escape sequence
//        char doubleQuote = '\"'; //escape sequence
//        char newLine = '\n'; // newline
//        char aTab = '\t'; // tab
//        char backslash = '\\';

//        boolean true/false
//        boolean numberIsTooBig = aNumber > 100; // false
//        boolean isLetterMyfavourite = aLetter == 't';
//        boolean smallOddNumber = (aNumber < 10) && (aNumber % 2 ==0 );
//        boolean negate = !smallOddNumber;

//        string operators
//        String concat = "i love " + "Java";
//        System.out.println(concat);

//        instruction
//        aNumber = 45; // = means becomes
//        aNumber += 6; // =
//        old variables do not update automatically

//         control statements
//        int age = 23;
//        if (age <40){
//            System.out.println("Great time to learn Java");}
        //            chain if statement
//        else if (age == 34) {
//            System.out.println("Perfect time to start Java");
//        } else {
//                System.out.println("Never too late to start Java");
//            }

//        while loops - tests conditions, then setting instructions
//        System.out.println("watch me count to 10");
//        int counter =1;
//        System.out.println(counter);
//
//        while (counter<=10) {
//            System.out.println(counter);
//            counter++;
//        }
////            do-while loops -  set instructions, then tests conditions
//            counter = 1;
//            do {
//                System.out.println(counter);
//                counter++;
//
//            }while (counter <=10);
//
//
////        for-loops
//        for (counter =1; // starting instruction
//             counter<=10; // continuation of last condition until this statement is true
//             counter++ // instruction to execute, when continuation condition is not met
//        ){
//            System.out.println(counter);
//        }




// class
//      instantiate = creates an instance of a c;ass
//        Person abdulaziz = new Person("Abdulaziz-MI", 10); //Abdulaziz is an instance of person
//        abdulaziz.username = "Abdulaziz-MI"; //defining this instance's field
//        abdulaziz.age = 23;
//        Person khalid = new Person("Khalid-MI", 20); //Abdulaziz is an instance of person
//        khalid.username = "khalid-MI"; //defining this instance's field
//        khalid.age = 30;
//        reference types
//        System.out.println(abdulaziz.username + " says to " + khalid.username
//                + " \"how old are you\" "
//                + khalid.username + " says \" I am " + khalid.age + " years old\"");

//abdulaziz.announceNewAge();
//        khalid.announceNewAge();

//String abdulazizsGathering = abdulaziz.callFriends(20, "my house");
//        System.out.println(abdulazizsGathering);
////
//        String aTestString = "I love Java";
//        System.out.println(aTestString.length());
//        System.out.println(aTestString.startsWith("I love"));
//        System.out.println(aTestString.substring(2,7));
//        Person mohammed = new Person("Mohammed-MI", 30);

//        arrays - lists

//        Person[] peopleAnnouncingNewAge = new Person[3];
//        peopleAnnouncingNewAge[0] = abdulaziz;
//        peopleAnnouncingNewAge[1] = khalid;
//        peopleAnnouncingNewAge[2] = mohammed;
//
//       int personIndex = 0;
//       while (personIndex < 3 ){
//            Person currentPerson = peopleAnnouncingNewAge[personIndex];
//            currentPerson.announceNewAge();
//            personIndex++;
//        }
//       can do the same thing with a for loop
//        int i;
//        for (i = 0; i < 3; i++){
//            Person currentPerson = peopleAnnouncingNewAge[i];
//            currentPerson.announceNewAge();
//        }

//       but forEach item in array a forEach loop is  best
//        for (Person person: peopleAnnouncingNewAge) {
//            person.announceNewAge();
//        }
//
//        boolean peopleCanFly = Person.canFly;

// access modifiers




    }
//
//}
//class Person{
//    //        fields =  piece of info attached to single type
//    String username;
//    int age;
////    private - access modifier
////    other access modifiers: public, protected (inheritance), (no modiffier)
//    private String secret = "Secret, shhh"  ;
//
//    //        static - field/method will run the same for every instance of a class
//    static boolean canFly = false;
//
////Constructors - used to initialise fields
//public Person(String uName, int age){
//    username = uName;
//    this.age = age; // to use the same name must use the keyword.
//}

//Methods - pieces of code attached to a single type (class)
//this is a method for the class


//    Void - no return types
//void  announceNewAge(){
//    this.age++;
//    System.out.println("I " + this.username+ ", am " + this.age + " years old now");
//
//}
//    String callFriends(int nPeople, String favPlace){
//    return this.username + " says \"I am calling " + nPeople + " people and inviting them to " + favPlace + "\"";
//    }

//    static String getFavProgrammingLang(){
//    return "Java";
//    }



}
