package firstPackage;

public class MainClassForGit {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		
		int count = 0;
	
		while (count <= 20) {
			System.out.println("[Count]" + count);
			count ++;
		}
		
		
		
		ListofIDs first = new ListofIDs("Test", 68);
		
		System.out.println(first);
		
	}

}
