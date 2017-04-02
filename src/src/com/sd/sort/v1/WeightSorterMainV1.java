package com.sd.sort.v1;
import java.util.Arrays;

public class WeightSorterMainV1 {
    public static void main(String[] args){
        Weight[] weights=new Weight[3];
        weights[0]=new Weight(50);
        weights[1]=new Weight(40);
        weights[2]=new Weight(70);
        //Arrays.sort(weights);
	//ÇØº½
	for(Weight w : weights){
		//weights[i] = new Weight(i*50+25);
		
		System.out.println(w.compareTo(weights[2]));
	}


        
        //for(Weight w:weights)
       //     System.out.println(w.toString());
    }
}