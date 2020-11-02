package com.zipcodewilmington;

/**
 * Updated by Gunjan 11/02/2020
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop

        StringBuilder tempString= new StringBuilder();
        int i=0;
        while(i < personArray.length) {

            tempString.append("\nMy first name is " + personArray[i].getFirstName() + "\nMy last name is " + personArray[i].getLastName());
        i++;
        }
        return tempString.toString();
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        StringBuilder tempString= new StringBuilder();

        for(int i=0 ;i < personArray.length ; i++) {

            tempString.append("\nMy first name is " + personArray[i].getFirstName() + "\nMy last name is " + personArray[i].getLastName());

        }
        return tempString.toString();

    }



    public String forEachLoop() {
        String result = "";
        StringBuilder tempString= new StringBuilder();
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
          // end loop

        for(Person P1 : personArray)
          tempString.append("\nMy first name is " + P1.getFirstName() + "\nMy last name is " + P1.getLastName());

        return tempString.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
