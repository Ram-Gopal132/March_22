//private scope

//Test of scope on the members of a class


package com.app;

//Can a constructor be private?


class Room
	{
		private int length=10;
		
		private void sayHello()
			{
				System.out.println("Hello...");
			}

		public static void main(String args[])
			{
				Room obj=new Room();

				System.out.println("Length="+obj.length);
				obj.sayHello();
				

			}

	
	}





public class SecondActivity
	{
		
	}