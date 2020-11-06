package org.example.identify.generators;

/**
 * <p>This class provides Locally unique ID generator instances responsible for the unique ID generation.</p>
 *
 * <p>These can be used as an local instance counter of successfully created instances.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-06
 */
public class LocalUniqueIDGenerator implements IDGenerator {


    /* INSTANCE VARIABLES *****************************************/

    private long id;


    /* CONSTRUCTORS ***********************************************/

    public LocalUniqueIDGenerator() {

        this.id = 0;
    }

    public LocalUniqueIDGenerator(long beg) {

        this.id = beg;
    }


    /* INSTANCE METHODS *******************************************/

    /**
     * <p>Generates the unique {@code long} value for identification of an instance.</p>
     *
     * @return the {@code long}-formed id
     */
    @Override
    public long generate() {

        return this.id++;
    }


    /* STATIC METHODS *********************************************/




    /* GETTERS AND SETTERS ****************************************/


}
