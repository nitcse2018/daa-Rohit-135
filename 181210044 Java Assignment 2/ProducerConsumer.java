class Values
{
	boolean x = false;
	int val;
	public synchronized void Produce(int val)
	{
		while(x)
		{
			try
			{
				wait();
			}
			catch(Exception e){}
		}
		System.out.println("Produces : "+val);
		this.val = val;
		x = true;
		notify();
	}
	public synchronized void Consume()
	{
		while(!x)
		{
			try
			{
				wait();
			}
			catch(Exception e){}
		}
		System.out.println("Consumes : "+val);
		System.out.println(" ");
		x = false;
		notify();
	}
}
class Producer implements Runnable
{
	Values value;
	public Producer(Values value)
	{
		this.value = value;
		Thread pr = new Thread(this,"Producer");
		pr.start();
	}
	public void run()
	{
		int i = 0;
		while(true)
		{
			value.Produce(i++);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e){}
		}
	}
}
class Consumer implements Runnable
{
	Values value;
	public Consumer(Values value)
	{
		this.value = value;
		Thread cr = new Thread(this,"Consumer");
		cr.start();
	}
	public void run()
	{
		while(true)
		{
			value.Consume();
			try 
			{
				Thread.sleep(100);
			}
			catch(Exception e){}
		}
	}
}
public class ProducerConsumer 
{
	public static void main(String []args)
	{
		Values value = new Values();
		Producer p1 = new Producer(value);
		Consumer c1 = new Consumer(value);
	}
}
