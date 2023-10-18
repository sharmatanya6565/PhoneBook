package com.PhoneBook;

import java.util.List;
import java.util.ArrayList;
import java.util.*;



     class Phonebk {
	public static void main(String[] args) {
		List<Contact> phoneBook=new ArrayList<>();
		
		
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("Phonebook menu");
			System.out.println("1.Press 1 to ADD Contact");
			System.out.println("2.Press 2 to Search the Contact");
			System.out.println("3.Press 3 to Update the Contacts");
			System.out.println("4.Press 4 to Delete  the Contact");
			
			System.out.println("Enter Your Choice:");
			int choice =sc.nextInt();
			sc.nextLine();
			try {
			switch(choice)
			{
			case 1:
				System.out.println("Enter Contact Name:");
				String name=sc.nextLine();
				System.out.println("Enter phone Number:");
				String phoneNumber=sc.nextLine();
				if(!phoneNumber.matches("\\d+")) {
					throw new ClassException("Phone number should only have numbers");
				}
				if (phoneNumber.length()!=10) {
					throw new ClassException("Phone number should have 10 digits");
				}
				
				
				Contact contact=new Contact(name,phoneNumber);
				phoneBook.add(contact);
				
				System.out.println("Contact Added!");
				break;
			case 2:
				System.out.println("Enter the name to search:");
				String searchname=sc.nextLine();
				for (Contact c  :phoneBook) {
					if (c.getName().contains(searchname)) {
						System.out.println("Name:"+c.getName()+"Phone Number"+ c.getPhoneNumber());
					}
				}
				break;
			case 3:
				
					System.out.println("Update Contact");
					System.out.println("Name you want to update number of");
					String Name1=sc.nextLine();
					
						
				
					if(phoneBook.isEmpty()) {
						System.out.println("Phone book is empty");
						return;}
						
						for (Contact c :phoneBook) 
						{ 
							if(c.getName().equals(Name1)) {
								System.out.println("Enter new phone number");
								String PhoneNumber1=sc.next();
								if(!PhoneNumber1.matches("\\d+")) {
									throw new ClassException("Phone number should contain digits only");
									
								}
								if(PhoneNumber1.length()!=10) {
									throw new ClassException("Phone number must contain 10 digits");
									
								}
								c.setPhoneNumber(PhoneNumber1);
								System.out.println("Contact Updated");
								return;
							}}
				System.out.println("Contact not found");
				break;
			case 4:
				System.out.println("Delete Contact");
				System.out.println("Enter the contact you want to delete");
				String DeleteName=sc.nextLine();
				if(phoneBook.isEmpty()) {
					System.out.println("PhoneBook is empty");
				}
				for (Contact c :phoneBook) {
					if(c.getName().equals(DeleteName)) {
						phoneBook.remove(c);
						System.out.println("Contact deleted ");
						return;
						
					}
				}
				System.out.println("Contact not found in Phonebook");
				sc.close();
				}}catch(ClassException e) {
					System.out.println(e.getMessage());
				
				}}}}
				
				
				
				
				
				
			
			
			
			
		
		
	


