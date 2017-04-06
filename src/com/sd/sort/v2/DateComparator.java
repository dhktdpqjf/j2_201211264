package com.sd.sort.v2;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateComparator implements Comparator{
  public DateComparator(){}
  
  public int compare(Object o1, Object o2){
    Date d1 = (Date)o1;
    Date d2 = (Date)o2;
    return d1.compareTo(d2);
  }
}