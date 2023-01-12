package MyCode;

public class MySingletonClass {
	
	   private MySingletonClass(){}
	   private static MySingletonClass object = null;
	   
	   
	   public static MySingletonClass getInstance(){
	       // Will Create a new object if the object is not already created and return the object.
	       if(object == null){
	           object = new MySingletonClass();
	       }
	       return object;
	   }
	

}
