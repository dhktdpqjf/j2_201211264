package com.sd.sort.v1;
import java.util.Comparator;

public class IntegerComparator implements Comparator{  
  public IntegerComparator(){}
  public int compare(Object o1, Object o2){
    return (Integer)o1-(Integer)o2;
  }
}