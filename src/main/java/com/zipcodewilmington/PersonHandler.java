package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        Integer counter = 0;

        // create a `counter`
        // while `counter` is less than length of array
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        while(counter < this.personArray.length) {
            Person currentPerson = this.personArray[counter];  // this.personArray[counter] returns type Person - why?
            result += currentPerson.toString();
            counter++;
        }

        return result;
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

        for(Integer i = 0; i < personArray.length; i++) {
            Person currentPerson = this.personArray[i];
            result += currentPerson.toString();
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";

        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        for(Person p:personArray) {
            Person currentPerson = p;
            result += currentPerson.toString();
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
