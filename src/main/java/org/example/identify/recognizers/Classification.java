package org.example.identify.recognizers;


/**
 * <p>This instance represents the classification of an instance. Using this instrument,
 * these instance can be given together using it's classification.</p>
 *
 * @version 2020-11-06
 * @author Vojtech Pavlu
 */
public interface Classification extends RecognitionInstrument {



    public String getClassification();
}
