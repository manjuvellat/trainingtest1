import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		int x,y,q,w,s,i,j;
		
		String m,n;
		SwapClass obj1=new SwapClass();
		
		System.out.println("Enter your choice: 1) swap two numbers 2) swap 2 strings 3) Find LCM of two integers 4) Sort n integers");
		
		
		Scanner ch = new Scanner(System.in);
		int c1=ch.nextInt();
		switch(c1)
		{
		case 1: 
				System.out.println("Enter two integers:");
				Scanner a = new Scanner(System.in);
				Scanner b = new Scanner(System.in);
				x=a.nextInt();
				y=b.nextInt();
				obj1.swapfunc(x, y);
				break;
		case 2: System.out.println("Enter two strings");
				Scanner s1 = new Scanner(System.in);
				Scanner s2 = new Scanner(System.in);
				m = s1.nextLine();
				n=s2.nextLine();
				obj1.swapfunc(m,n);
				break;
		case 3 :LCM obj2=new LCM();
				System.out.println("Enter two numbers");
				Scanner n1 = new Scanner(System.in);
				Scanner n2 = new Scanner(System.in);
				q = n1.nextInt();
				w = n2.nextInt();
				//obj2.lcmfunc(q, w);
				break;
		case 4 :SortClass obj3=new SortClass();
				System.out.println("Enter number of intergers");
				Scanner no = new Scanner(System.in);
				s = no.nextInt();
				int arry[]= new int[s+1];
				System.out.println("Enter array");
				Scanner arr = new Scanner(System.in);
				for(i=1;i<=s;i++)
				{
				   arry[i]=arr.nextInt();
				   
				}
				int sortedarr[]=obj3.sortarr(arry, s);
				
				 System.out.println("The sorted array is ");
				 for (i = 0; i< s; i++) 
			        {
			            System.out.print(sortedarr[i] + " ");
			        }
				
				break;
		default: System.out.print("Invalid choice. try again");
				
		}
				
	}

}
