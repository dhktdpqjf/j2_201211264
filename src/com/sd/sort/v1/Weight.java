package com.sd.sort.v1;

public class Weight implements Comparable {
  private int kilo;
  public Weight(int k){
    this.kilo = k;
  }
  
//  public int compareTo(Weight w){  //�̷��� ���� ���� implements Comparable �κ��� ������ ����. 
                                     //�ֳ��ϸ� compareTo �������̽��� <T>�� �ޱ� ������ ���ڰ� Weight�� ���� ������ ��
   public int compareTo(Object o){
     Weight w = (Weight)o;  //Comparable�� implements�ؼ� compareTo�� �ҷ��� ���� ��. �ݵ�� ���س��� �Լ��� ���� ���� template �����̶�� ��.
    return this.kilo -w.kilo;
  }
  
}