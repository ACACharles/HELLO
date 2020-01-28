class KeyRing extends Key {
  
	Key[] Bunch = new Key[5];
  
  void executeAction() {
    super.executeAction();
    System.out.println("You added it to you key ring.");
  }
  public static void main(String... superReservedWord) {
    new KeyRing().executeAction();
  }
}
////////////////////////////////////////////////////////
class Key {
	
	String color = "silver";
	String size = "small";
	String type = "house";
	String material = "metal";
	
  void executeAction() {
    System.out.println("You got a new house key.");
  }
}
  class KeyDemo{
	  public static void main(String... superReservedWord){
  }
}