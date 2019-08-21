
public class Add {
	int a,b;
	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args)
	{
		Add ad=new Add();
		ad.add(10, 20);
		System.out.print(ad);
}

}
