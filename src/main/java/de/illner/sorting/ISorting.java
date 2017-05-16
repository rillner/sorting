/*
 * ISorting.java
 *
 * created at 16.05.2017 by Robert Illner
 */
package de.illner.sorting;


import java.util.Comparator;
import java.util.List;


interface ISorting
{

    abstract <T> void sortAscending(Comparator< ? super T> comparator, List<T> input) throws NullPointerException;


    abstract <T> void sortAscending(Comparator< ? super T> comparator, T[] input) throws NullPointerException;


    abstract <T extends Comparable<T>> void sortAscending(List<T> input) throws NullPointerException;


    abstract <T extends Comparable<T>> void sortAscending(T[] input) throws NullPointerException;


    abstract <T> void sortDescending(Comparator< ? super T> comparator, List<T> input) throws NullPointerException;


    abstract <T> void sortDescending(Comparator< ? super T> comparator, T[] input) throws NullPointerException;


    abstract <T extends Comparable<T>> void sortDescending(List<T> input) throws NullPointerException;


    abstract <T extends Comparable<T>> void sortDescending(T[] input) throws NullPointerException;
}



