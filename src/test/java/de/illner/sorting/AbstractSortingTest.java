/*
 * AbstractSortingTest.java
 *
 * created at 15.05.2017 by Robert Illner
 */
package de.illner.sorting;


import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.junit.Before;


public abstract class AbstractSortingTest
{

    protected final Comparator<Integer> integerComparator = (i1, i2) -> i1.compareTo(i2);
    protected final Comparator<Integer> integerComparatorPermittingNull = createComparatorPermittingNull();

    protected List<Integer> tenThousandRdmIntList = create10000RdmIntsList();
    protected Integer[] tenThousandRdmIntArray = create10000RdmIntsArray();


    @Before
    public void beforeEachTestCase()
    {
        tenThousandRdmIntList = create10000RdmIntsList();
        tenThousandRdmIntArray = create10000RdmIntsArray();
    }
    
    abstract public void sortListAscWith10000RdmInts();


    abstract public void sortListDescWith10000RdmInts();


    abstract public void sortListAscAlreadySorted();


    abstract public void sortListDescAlreadySorted();


    abstract public void sortListAscReverse();


    abstract public void sortListDescReverse();


    abstract public void sortListAscFewUnique();


    abstract public void sortListDescFewUnique();


    abstract public void sortListAscFewUniqueReverse();


    abstract public void sortListDescFewUniqueReverse();


    abstract public void sortListAscAlreadySortedFewUnique();


    abstract public void sortListDescAlreadySortedFewUnique();


    abstract public void sortListAscWithOneElement();


    abstract public void sortListDescWithOneElement();


    abstract public void sortListAscComparatorPermitsNullElements();


    abstract public void sortListDescComparatorPermitsNullElements();


    abstract public void sortListAscComparatorDoesntPermitNullElementsFails();


    abstract public void sortListDescComparatorDoesntPermitNullElementsFails();


    abstract public void sortListAscWithNullComparatorFails();


    abstract public void sortListDescWithNullComparatorFails();


    abstract public void sortArrayAscWith10000RdmInts();


    abstract public void sortArrayDescWith10000RdmInts();


    abstract public void sortArrayAscAlreadySorted();


    abstract public void sortArrayDescAlreadySorted();


    abstract public void sortArrayAscReverse();


    abstract public void sortArrayDescReverse();


    abstract public void sortArrayAscFewUnique();


    abstract public void sortArrayDescFewUnique();


    abstract public void sortArrayAscFewUniqueReverse();


    abstract public void sortArrayDescFewUniqueReverse();


    abstract public void sortArrayAscAlreadySortedFewUnique();


    abstract public void sortArrayDescAlreadySortedFewUnique();


    abstract public void sortArrayAscWithOneElement();


    abstract public void sortArrayDescWithOneElement();


    abstract public void sortArrayAscComparatorPermitsNullElements();


    abstract public void sortArrayDescComparatorPermitsNullElements();


    abstract public void sortArrayAscComparatorDoesntPermitNullElementsFails();


    abstract public void sortArrayDescComparatorDoesntPermitNullElementsFails();


    abstract public void sortArrayAscWithNullComparatorFails();


    abstract public void sortArrayDescWithNullComparatorFails();


    private static List<Integer> create10000RdmIntsList()
    {
        return new Random().ints(10000, new Integer(-5000), new Integer(5000)).boxed().collect(Collectors.toList());
    }


    private static Integer[] create10000RdmIntsArray()
    {
        return new Random().ints(10000, new Integer(-5000), new Integer(5000)).boxed().toArray(size -> new Integer[size]);
    }


    private static Comparator<Integer> createComparatorPermittingNull()
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
