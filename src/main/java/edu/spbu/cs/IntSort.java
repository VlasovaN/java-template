package edu.spbu.cs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 * Created by artemaliev on 07/09/15.
 */
public class IntSort {


  int[] array;
  public static final int ARRAY_SIZE = 10000000;


  public IntSort(int[] array) {

    this.array = array;

  }

  public void Swap(int i, int j){

    int temp;
    temp = array[i];
    array[i] = array[j];
    array[j] = temp;

  }

  public void sort(){


    int i;

    for (i = ARRAY_SIZE / 2 - 1; i >= 0; i--) {
      shiftDown( i, ARRAY_SIZE);

    }

    for (i = ARRAY_SIZE - 1; i >= 1; i--) {

      Swap(0, i);
      shiftDown( 0, i);
    }
  }

  public void shiftDown( int i, int j) {

    boolean done = false;
    int maxChild;

    while ((i * 2 + 1 < j) && (!done)) {
      if (i * 2 + 1 == j - 1) {

        maxChild = i * 2 + 1;
      }
      else if (array[i * 2 + 1] > array[i * 2 + 2] )
        maxChild = i * 2 + 1;
      else
        maxChild = i * 2 + 2;

      if (array[i] < array[maxChild]){

        Swap(i, maxChild);
        i = maxChild;
      }
      else {
        done = true;
      }
    }
  }












}
