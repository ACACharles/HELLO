class KeyRing extends Key {
  
	Key[] Bunch = new Key[3];
  
  void key() {
    super.key;
    System.out.println("You added it to you key ring.");
  }
   void key(int n, String s) {
    number = n;
	size = s;
    System.out.println("The size a is" + a "\nThe number of keys it has is" + n);
  }
  public static void main(String... superReservedWord) {
    new KeyRing().key();
  }
}
class Key {
	
	String color = "silver";
	String size = "small";
	String type = "house";
	String material = "metal";
	
  void key() {
    System.out.println("You got a new house key.");
  }
	  void key(String t) {
		type = t;
    System.out.println("The type of key you have is" + t);
  }
}
  class KeyDemo{
	  public static void main(String... super key){
  }
}