package addressbook;

public class AddressManager{
  public static void main(String[] args){
    AddressData ad1 = new AddressData();
    AddressData ad2 = new AddressData();
    AddressBook adbook = new AddressBook(ad1);
    AddressBook adbook2 = new AddressBook(ad2);    
    
    ad1.setAddressbook("Amy","010-7744-7373","��赿",30);
    ad2.setAddressbook("John","010-2334-7845","��ȭ��",23);
    //ad1.setAddressbook("Kate","010-1439-5378","�б�����",28);
    //ad1.setAddressbook("Max","010-4729-5664","���ʵ�",21);
    
    adbook.setBlindData(new BlindAddress());
    adbook.getBlindData();
    
    adbook2.setBlindData(new BlindNum());
    adbook2.getBlindData();
  }
}