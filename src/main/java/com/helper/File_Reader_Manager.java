package com.helper;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		
		
	}
	
	
	
	public static  File_Reader_Manager getInstance() {
		
		File_Reader_Manager f = new File_Reader_Manager();
		
		return f;
		
		

	}
	
	
	
	
	
	public Configuration_reader getinstanceCR() throws Throwable {
		
		Configuration_reader c = new Configuration_reader();
		
		return c;

	}

}
