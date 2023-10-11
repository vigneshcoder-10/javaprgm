package verymuchinterested;

public class ExceptionClass {

	public static void main(String[] args)throws Invalidageforlicense {
		
          ageHandle(17);
	}
//   private static void age(int agelimit)throws Invalidageforlicense {
//	   if(agelimit>=18) {
//		   System.out.println("you can Apply");
//	   }
//	   else {
//		   throw new Invalidageforlicense();
//	   }
  // }
   private static void ageHandle(int agelimit) {
	   if(agelimit>=18) {
		   System.out.println("You can apply");
	   }
	   if(agelimit<18) {
	   try {
	       throw new Invalidageforlicense();
	   }
	   catch(Invalidageforlicense i) {
		   	i.dontapply();
		   	i.printStackTrace();
	   }
   }
}
}