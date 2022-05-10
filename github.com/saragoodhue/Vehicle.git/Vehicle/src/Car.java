
public class Car extends Vehicle
	{
		private String type = "car";

		public void displaySpeed()
			{
				System.out.println("as fast as the car in front of me");
			}
		
		public void hitPedestrian()
		{
			System.out.println("watch out!");
		}

		public void honkHorn()
			{
				System.out.println("honk honk");
			}
	}
