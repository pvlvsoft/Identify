package org.example.identify.instances;


/**
 * <p>This interface provides the unique identification of the created instances.</p>
 *
 * <p>For the identifier creation should be always used the numeric (integer) types.</p>
 *
 * @version 2020-11-06
 * @author Vojtech Pavlu
 */
public interface Identified extends Recognisable {


    /**
     * <p>Gives back the {@link Long}-formed ID of the instance. This one has to be unique.</p>
     *
     * @return      ID of the instance sealed in the {@link Long} object type.
     */
    public Long getId();
}
