package Assignment1;

public class RepeatElement {
	void repeatingElement(int array[], int size)
	{
		int a, b;
		System.out.println("Repeated elements in an array is:");
		for(a=0;a<size;a++)
		{
			for(b=a+1;b<size;b++)
			{
				if(array[a]==array[b])
				{
					System.out.println(array[a]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		RepeatElement repeat = new RepeatElement();
		int array[] = {1,2,1,4,5,6};
		int array_size = array.length;
		repeat.repeatingElement(array,array_size);

	}

}
