public class CopyElementsInArray {

	public static void main(String[] args) 
	{
	int a[] = {2,4,3,6,8};
	int b[] = new int[a.length];
	b=a;
                System.out.println("\n contents of a[]");
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]+ " ");
                   System.out.println("\n contents of b[]");
	for(int i=0;i<b.length;i++)
		System.out.println(b[i]+ " ");
		}
		
	}