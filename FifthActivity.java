package com.app;


class Room
	{
		Room()
			{
				System.out.println("Room......");
			}

		class Chamber
			{
				Chamber()
					{
						System.out.println("Chamber.....");
					}

				void sayHello()
					{
						System.out.println("Hello.....Inner class");
					}
			}

	
		void sayHi()
			{
				System.out.println("Hi...Outer class");
			}
	}



public class FifthActivity
	{
			public static void main(String args[])
				{
					Room.Chamber obj_inner=new Room().new Chamber();

					obj_inner.sayHello();

					obj_inner.sayHi();
				}
	}