 	class addSmiley implements Tshirt
 	{
 	protected Tshirt psobject;
 	String text;
 	public addSmiley( Tshirt mp, String txt )
 	{
 		psobject = mp;
 		text = txt;
 		
 	}	
 		
 	public String gettype()
 	{
 	 	return psobject.gettype() + " with emoji: " + text + ", ";
 	}
 	
 	public double getcost()
	{
		 return psobject.getcost()+30.0;
	}
 	
 	}
 	
 	
