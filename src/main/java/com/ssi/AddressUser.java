package com.ssi;

public class AddressUser {

	public static void main(String[] args) {
		
		//Address address=new Address();
		Address address=new Address(1010,"MGRoad","Delhi"); 
		/*
		address.setHno(111);
		address.setStreet("AB Road");
		address.setCity("Indore");
		*/
		System.out.println(address.getHno());
		System.out.println(address.getStreet());
		System.out.println(address.getCity());

		System.out.println(address);
		
	}

}
