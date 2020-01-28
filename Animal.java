
class Animal 
{
	
  String type = "dog";
  
  
  
 
 void jump()
  {
    System.out.println("Dogs can jump.");
  }
}

class Retriever extends Animal 
{
  String Retriever  = "Lab";
  void jump() 
  {
	  System.out.println(" jump");
 
  }
  
}
class dogdemo
{
	 public static void main(String[] args) 
  
  {
    Retriever myRetriever = new Retriever();
    
	myRetriever.jump();
   
   System.out.println(myRetriever.type + " " + myRetriever.Retriever);
  }
}





