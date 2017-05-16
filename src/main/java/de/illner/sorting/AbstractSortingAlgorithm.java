/*
 * AbstractSortingAlgorithm.java
 *
 * created at 16.05.2017 by Robert Illner
 */
package de.illner.sorting;


import java.util.List;


abstract class AbstractSortingAlgorithm
{

    protected <T> void swap(T[] array, int indexOne, int indexTwo)
    {
        T tmp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = tmp;
    }


    protected <T> void swap(List<T> list, int indexOne, int indexTwo)
    {
        T tmp = list.get(indexOne);
        list.set(indexOne, list.get(indexTwo));
        list.set(indexTwo, tmp);
    }
}



