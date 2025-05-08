package singletonDesignPattern;

public enum SingletonEnum {
	
	INSTANCE;
	
	public void showMessage() {
		System.out.println("Hello from Enum-based Singleton");
		
		
		}
	
	public static void main(String[] args) {
		SingletonEnum singleton = SingletonEnum.INSTANCE;
		singleton.showMessage();
	}
	}


