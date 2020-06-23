class MethodsDemo {
	java.util.Scanner scan = new java.util.Scanner(System.in);
	int firstNum = scan.nextInt();
	int secondNum = scan.nextInt();

	public static void main(String[] args) {
		new MethodsDemo().takeInput();
	}

	void add(int firstNum, int secondNum) {
		int result = firstNum + secondNum;
		displayOutput(result);
	}

	void takeInput() {
		add(firstNum, secondNum);
	}

	void displayOutput(int result) {
		System.out.println("Addition : " + result);
	}

}