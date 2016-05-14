	class printText implements Tshirt
 	{
 	protected Tshirt psobject;
 	String text;
 	public printText( Tshirt mp, String txt )
 	{
 		psobject = mp;
 		text = txt;
 		
 	}	
 		
 	public String gettype()
 	{
 	 	return psobject.gettype() + " with text: " + text + ", ";
 	}
 	
 	public double getcost()
	{
		 return psobject.getcost()+30.0;
	}
 	
 	}
 	
 	
