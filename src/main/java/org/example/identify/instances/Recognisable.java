package org.example.identify.instances;


import org.example.identify.recognizers.RecognitionInstrument;

/**
 * <p>This interface provides tools of instance recognition for this interface implementing instances.</p>
 *
 * @version 2020-11-06
 * @author Vojtech Pavlu
 */
public interface Recognisable {


    /**
     * <p>This method tells you if the instrument of recognition is unique. For example for {@link Named}
     * instance will return false, for (unique) numeric identifiers should return true.</p>
     *
     * @return  {@code true} if the identification instrument is always unique, otherwise {@code false}.
     */
    public boolean isUniqueIdentifier();


    /**
     * <p>This method will give you back the {@link RecognitionInstrument} providing the
     * recognition of an instance.</p>
     *
     * @return  {@link RecognitionInstrument} providing recognition
     */
    public RecognitionInstrument getInstrument();


    /**
     * <p>This method provides a {@code boolean} returning functionality for comparing two objects implementing
     * the interface of {@link Recognisable}.</p>
     *
     * @param objectForRecognition  To be compared to
     *
     * @return                      {@code true} when they correspond, otherwise false.
     */
    public boolean corresponds(Recognisable objectForRecognition);
}
