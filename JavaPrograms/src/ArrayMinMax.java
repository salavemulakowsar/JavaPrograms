
public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		
		
		ArrayMinMax array = new ArrayMinMax();
		System.out.println("Max val is:"+array.max(a));
		System.out.println("Min val is:"+array.min(a));
	}
		public static int min(int[] a)
		{
			int min = a[0];
		
			for(int i = 1;i<a.length;i++)
			{
				if(a[i]>min)
				min = a[i];
			}
			return min;
				
		}
		public static int max(int[] a)
		{
			int max=0;
		
			for(int i = 0;i<a.length;i++)
			{
				if(a[i]<max)
				max = a[i];
			}
			return max;
				
		}
}

	


