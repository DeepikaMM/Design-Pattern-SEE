	class addingColor implements Tshirt
	{
	
	String color; 	
 	protected Tshirt psobject;
 	
 	public addingColor( Tshirt mp, String row )
 	{
 		psobject = mp;
 		color = row;
 		
 	}	
 		
 	public String gettype()
 	{
 	 	return psobject.gettype() + " , " + "with color : " + color + ", ";
 	}
 	
 	public double getcost()
	{
		 return psobject.getcost()+300.0;
	}
 	
 	}
 	
 	
	
