package com.sd.sort.v1;

public class Weight implements Comparable {
  private int kilo;
  public Weight(int k){
    this.kilo = k;
  }
  
//  public int compareTo(Weight w){  //이렇게 쓰면 위에 implements Comparable 부분이 에러가 난다. 
                                     //왜냐하면 compareTo 인터페이스는 <T>만 받기 때문에 인자가 Weight가 들어가면 에러가 남
   public int compareTo(Object o){
     Weight w = (Weight)o;  //Comparable을 implements해서 compareTo를 불러서 쓰면 됨. 반드시 정해놓은 함수를 쓰는 것을 template 패턴이라고 함.
    return this.kilo -w.kilo;
  }
  
}