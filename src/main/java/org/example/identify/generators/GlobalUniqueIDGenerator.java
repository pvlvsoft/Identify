package org.example.identify.generators;

/**
 * <p>Singleton based class implementing {@link IDGenerator} in order to set the base of the instance.</p>
 *
 * <p>This instance provides {@code long}-based ID generation, while these should be globally unique.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-06
 */
public class GlobalUniqueIDGenerator implements IDGenerator {

    /* STATIC INIT BLOCK ******************************************/

    private static final GlobalUniqueIDGenerator INSTANCE
            = new GlobalUniqueIDGenerator();


    /* INSTANCE VARIABLES *****************************************/


    private long currentId = 1;


    /* STATIC VARIABLES *******************************************/




    /* CONSTRUCTORS ***********************************************/


    private GlobalUniqueIDGenerator() {

    }


    /* INSTANCE METHODS *******************************************/

    /**
     * <p>Generates the unique {@code long} value for identification of an instance.</p>
     *
     * @return the {@code long}-formed id
     */
    @Override
    public long generate() {

        synchronized (GlobalUniqueIDGenerator.class) {

            return INSTANCE.currentId++;
        }
    }


    /* STATIC METHODS *********************************************/




    /* GETTERS AND SETTERS ****************************************/


}
