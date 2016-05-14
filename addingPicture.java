 	class addingPicture implements Tshirt
 	{
 	protected Tshirt psobject;
 	String picture;
 	public addingPicture( Tshirt mp, String pic )
 	{
 psobject = mp;
 		picture = pic;
 		
 	}	
 		
 public String gettype()
 	{
 	 	return psobject.gettype() + "with picture:" + picture + " , ";
 }
 	
 public double getcost()
	{
	 return psobject.getcost()+250.0;
	}
 	
 	}
 	
 	
