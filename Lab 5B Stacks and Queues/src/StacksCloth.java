
public class StacksCloth 
{
	 String names;
	 String color;
	 boolean canWashHightTemp;		 
	 
	 public StacksCloth()
	 {
		 
	 }
	 public StacksCloth(String names, String color, boolean canWashHightTemp)
	 {
		 this.names = names;
		 this.color = color;
		 this.canWashHightTemp = canWashHightTemp;
	 }
	 
	 
	StacksCloth[] clothes = new StacksCloth[3];
	public int index =  0;
	 
	
	 boolean push(StacksCloth cloth)
	 {
		 if(index >= clothes.length -1)
		 {			 
			 return false;
		 }
		 else
		 {
			 clothes[index ++] = cloth;		 
			
			 return true;
		 }
	
	 }
	 StacksCloth pop()
	 {
		 
		 System.out.println("Current index " + index);
		 
		 if(index >= 0)
		 {
			 return clothes[--index];
		 }
		 else
		 {
			 return null;
		 }
		
			
	 }
	 StacksCloth pick()
	 {
		 //System.out.println(" Index Pick " + index);
		 if(clothes.length == 0)
		 {
			 return  null;
		 }
		 return clothes[index -1];
		 
	 }
	 
}
