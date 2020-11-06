package org.example.identify;

public interface Named extends Recognisable {


    /**
     * <p>This method provides the {@link String}-formed name returning.</p>
     *
     * <p>Class of this instance is implementing the {@link Named} interface, it means it can be
     * recognised (in order of using {@link Recognisable} and {@link RecognitionInstrument}).</p>
     *
     * @return  {@link String}-formed name of the instance.
     */
    public String getSName();
}
