package org;

public class User {
		
		private int id;
		private String name;
		private String email;
		
		
		public User(int id, String name, String email) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
		}
		public User(int id, String name) {
			super();
			this.id = id;
			this.name = name;
			
		}

		public void display()
		{
			System.out.println(id+" "+name+" "+email);
		}
}
