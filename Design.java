import java.util.*;
class Design
{
public static void main( String[] args )
{Scanner in = new Scanner(System.in);
System.out.println( "   ");          	
Tshirt s = null ;
int w,type,c ;
 String str;
System.out.println( "what  shirt  you want? \n Enter 1 for collared and 2 for VShirt " );
try {
type = in.nextInt();
if( type == 1 || type == 2 )
 {
			switch ( type )
{
	case 1 : s = new collaredtShirt(); break;
	case 2 : s = new VShirt(); break;
				
			}
			
	System.out.println( " you want  a designed shirt? then \n Enter 1 or 2 for no " );
	c = in.nextInt();
			if( c == 1 )
	{
			
		do
		{
				
		System.out.println( "1 Picture , 2 Color , 3 text ,4 emoji,quit");
		w = in.nextInt();
		switch ( w )
				{
		case 1 : System.out.println( " Picture name");
		 str = in.next();
							 s = new addingPicture(s , str); break;	 
		 case 2 : System.out.println( "Enter Color");
							 str = in.next();
				 			 s = new addingColor(s , str); break;
				   case 3 : System.out.println( "Enter Text");
				 			 str = in.next();
							 s = new printText(s , str); break;
							   case 4 : System.out.println( "Enter emoji");
				 			 str = in.next();
							 s = new printText(s , str); break;
				default : break;
							 
					          
				}
				
				
				}
				while( w > 0 && w < 5 );
			}
			
			
			System.out.println( s.gettype());
			System.out.println( s.getcost());
			
		}
			else 
			System.out.println( " choice is wrong " );
			}
			
	catch( Exception e )
	{
			System.out.println("entry is wrong");
	}
		}
	}
	
	

