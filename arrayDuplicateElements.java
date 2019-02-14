class arrayDuplicateElements
{
	public static void main(String [] args)
	{
		int arr[]={2,3,4,5,3,6,7,6,8,9,10};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					count+=1;
				}
				
			}
			if(count==1)
				System.out.println(arr[i]);
			count=0;
		}
		
	}
}