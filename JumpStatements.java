package com.besant.control;

public class JumpStatements {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			
			if(i==3) {
				break;
			}
			//System.out.println(i);
		}
		
		String[] names= {
				"Aapheal","Balaji","Ganesh","Siva"
		};
		
		for(int i=0; i<names.length;i++) {
			String name=names[i];
			if(name.startsWith("Balaji")) {
				//System.out.println(name);
				break;
			}
		}
		
		for(int i=names.length-1; i>=0;i--) {
			String name=names[i];
			//System.out.println(i);
			if(name.startsWith("Ganesh")) {
				//System.out.println(name);
				break;
			}
		}
		
		for(int i=1;i<=6;i++) {
			if(i==1 || i==3) {
				continue;
			}
			System.out.println(i);

		}
		

	}

}
