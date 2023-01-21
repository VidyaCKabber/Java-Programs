class ReadFile{
  public static void main(String[] args) { 
		Path path = Paths.get("/Users/vikabber/Java-Programs/myTestFile.txt"); 
		boolean exists = Files.exists(path); 
		System.out.println("Exists = " + exists); 
		try (BufferedReader reader = Files.newBufferedReader(path);) { 
			String line = reader.readLine(); 
			
			while (line != null) { 
				System.out.println("Line = " + line); 
				line = reader.readLine(); } 
			} catch (IOException ioe) { 
				ioe.printStackTrace(); 
			} 
	}
}
