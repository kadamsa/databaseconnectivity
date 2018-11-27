package Com.exception.demo;

class parent1 {

	void msg() {

		System.out.println("hi sachin..how r u?");
	}

}

class tst extends parent1 {

	void msg() throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

		System.out.println("welcome wolrd!!!!!!!");
	}

}
