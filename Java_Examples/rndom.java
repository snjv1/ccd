class rndom
{
	public static void main(String[] args)
	{
		int a[] = new int[20];

for(int i=0;i<a.length;i++)
{a[i]=a[i+1];
}
for(int i : a)
{
		System.out.println(i);
}
}
}

