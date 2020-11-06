package org.example.identify.generators;

/**
 * <p></p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-06
 */
public class LocalUniqueIDGenerator implements IDGenerator {

    /* STATIC INIT BLOCK ******************************************/




    /* INSTANCE INIT BLOCK ****************************************/




    /* INSTANCE VARIABLES *****************************************/

    private long id;


    /* STATIC VARIABLES *******************************************/




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
