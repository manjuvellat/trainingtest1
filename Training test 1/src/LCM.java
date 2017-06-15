
public class LCM {
	
	int lcmfunc(int a,int b) 
	{
			int lar;
		if( a>b)
		{ lar=a;}
		else
			{lar=b;}
		
		while(true)
        {
            if(lar % a == 0 && lar % b == 0)
                return lar;
            ++lar;
        }
		}
}
