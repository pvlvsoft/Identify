package org.example.identify.instances;

import org.example.identify.recognizers.Classification;


/**
 * <p>Provides the instance classification. It means the sets of instances can be given together without need of
 * changing their structure by hardcoding (by default Java Class context).</p>
 *
 * @version 2020-11-06
 * @author Vojtech Pavlu
 */
public interface Classificated extends Recognisable {


    /**
     * <p>This method is responsible for returning the classification of this instance.</p>
     *
     * @return  {@link Classification} instance providing some scope restriction for this.
     */
    public Classification getClassification();


    /**
     * <p>This method gives you answer for the question of this instance belongings.
     * In other words, you can get answer if this instance belongs to the
     * specified {@link Classification}.</p>
     *
     *
     * @param classification    instance's classification to be compared with
     *
     * @return      {@code true} when the classification is the same only.
     */
    public boolean isClass(Classification classification);


    /**
     * <p>Compares classifications of both instances.</p>
     *
     * @param classificated     to be compared with
     * @return                  if both instances belongs to the same classification
     */
    public boolean hasSameClass(Classificated classificated);
}
