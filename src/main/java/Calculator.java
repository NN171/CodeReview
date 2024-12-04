public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException();
        } else {
            return a / b;
        }
    }

	  public int times(int a, int b) {
		  return a * b;
	  }

	  public int solver() {
		  return div(times(dif(add(5, 3), 4), 6), 8);
	  }
}
