package org.example.identify.instances;

import org.example.identify.recognizers.RecognitionInstrument;


/**
 * <p>This interface provides naming of the instances. Each of the implementing classes should contain some
 * field for the name.</p>
 *
 *
 * @version 2020-11-06
 * @author Vojtech Pavlu
 */
public interface Named extends Recognisable {


    /**
     * <p>This method provides the {@link String}-formed name returning.</p>
     *
     * <p>Class of this instance is implementing the {@link Named} interface, it means it can be
     * recognised (in order of using {@link Recognisable} and {@link RecognitionInstrument}).</p>
     *
     * @return  {@link String}-formed name of the instance.
     */
    public String getName();


    /**
     * <p>When you need a comparision of two entities if they have the same name.</p>
     *
     * @param named     to be compared with this
     *
     * @return          {@code true} when they have the same name only
     */
    public boolean hasSameName(Named named);


    /**
     * <p>When you want to know if the instance has this name - returns basic {@code boolean} value.</p>
     *
     * @param name  to be compared with
     *
     * @return      {@code boolean} value representing the same name presence.
     */
    public boolean hasName(String name);
}
