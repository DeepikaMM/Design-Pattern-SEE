
public class Designable implements Tshirt 
{
	
	protected Tshirt psobject;
	
public Designable(Tshirt bp)
	{
	psobject = bp;
	}
	
@Override
public String gettype() {
		
		
return psobject.gettype();
	}

@Override
public double getcost() {
		
		
	return psobject.getcost();
	}

}
