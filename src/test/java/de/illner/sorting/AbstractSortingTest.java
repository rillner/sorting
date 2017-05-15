/*
 * AbstractSortingTest.java
 *
 * created at 15.05.2017 by Robert Illner
 */
package de.illner.sorting;


import java.util.Comparator;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

public abstract class AbstractSortingTest
{

    @Rule
    public final ExpectedException exception = ExpectedException.none();


    protected final Comparator<Integer> integerComparator = (i1, i2) -> i1.compareTo(i2);
    protected final Comparator<Integer> integerComparatorPermittingNull = createComparatorPermittingNull();


    abstract public void alreadySortedSuccess();


    abstract public void reverseSuccess();


    abstract public void fewUniqueReverseSuccess();


    abstract public void alreadySortedFewUniqueSuccess();


    abstract public void inputArgEmptySuccess();


    abstract public void oneInputElementSuccess();


    abstract public void legalNullElementsSuccess();


    abstract public void illegalNullElementThrowsException();


    abstract public void comparatorArgNullThrowsException();


    private Comparator<Integer> createComparatorPermittingNull()
    {
        return (i1, i2) -> {
            int result;

            if (i1 != null && i2 != null)
            {
                result = i1.compareTo(i2);
            }
            else if (i1 == null && i2 == null)
            {
                result = 0;
            }
            else if (i1 == null) // && i2 != null
            {
                result = -1;
            }
            else // i2 != null && i2 == null
            {
                result = 1;
            }

            return result;
        };
    }
}