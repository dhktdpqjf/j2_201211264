package com.sd.address.v1;

import java.util.*;

public class SimpleRemoteControl{
  Command slot;
  
  public SimpleRemoteControl(){}
  
  public void setCommand(Command command){
    slot = command;
  }
  public void buttonWasPressed(){
    slot.execute();
  }
}
