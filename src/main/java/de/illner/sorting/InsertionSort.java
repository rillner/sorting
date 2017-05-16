/*
 * InsertionSort.java
 *
 * created at 16.05.2017 by Robert Illner
 */
package de.illner.sorting;


import java.util.Comparator;
import java.util.List;


final class InsertionSort extends AbstractSortingAlgorithm implements ISorting
{

    @Override
    public <T> void sortAscending(Comparator< ? super T> comparator, List<T> input) throws NullPointerException
    {
        ParamValidator.checkParameters(comparator, input);

        for (int i = 1; i < input.size(); i++)
        {
            for (int k = i; k > 0 && comparator.compare(input.get(k), input.get(k - 1)) < 0; k--)
            {
                swap(input, k, k - 1);
            }
        }
    }


    @Override
    public <T> void sortDescending(Comparator< ? super T> comparator, List<T> input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }


    @Override
    public <T> void sortAscending(Comparator< ? super T> comparator, T[] input) throws NullPointerException
    {
        ParamValidator.checkParameters(comparator, input);

        for (int i = 1; i < input.length; i++)
        {
            for (int k = i; k > 0 && comparator.compare(input[k], input[k - 1]) < 0; k--)
            {
                swap(input, k, k - 1);
            }
        }
    }


    @Override
    public <T> void sortDescending(Comparator< ? super T> comparator, T[] input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }


    @Override
    public <T extends Comparable<T>> void sortAscending(List<T> input) throws NullPointerException
    {
        ParamValidator.checkParameter(input);

        for (int i = 1; i < input.size(); i++)
        {
            for (int k = i; k > 0 && input.get(k).compareTo(input.get(k - 1)) < 0; k--)
            {
                swap(input, k, k - 1);
            }
        }
    }


    @Override
    public <T extends Comparable<T>> void sortDescending(List<T> input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }


    @Override
    public <T extends Comparable<T>> void sortAscending(T[] input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }


    @Override
    public <T extends Comparable<T>> void sortDescending(T[] input) throws NullPointerException
    {
        // TODO Auto-generated method stub

    }
}