package it.scoppelletti.dokkasample

import it.scoppelletti.dokkasample.model.Person
import it.scoppelletti.dokkasample.model.Pet

/**
 * Class to say that someone loves his pet.
 */
public class PetLover {

    /**
     * Says it.
     *
     * @param person Person.
     * @param pet    Pet.
     */
    public fun love(person: Person, pet: Pet) {
        println("$person loves $pet.")
    }
}