package DataFrameToJava;

public class Table {

	private String[] value;
	private int[] count;
	private double[] percentage;
	
	public String[] getValue() {
		return value;
	}

	public void setValue(String[] value) {
		this.value = value;
	}

	public int[] getCount() {
		return count;
	}

	public void setCount(int[] count) {
		this.count = count;
	}

	public double[] getPercentage() {
		return percentage;
	}

	public void setPercentage(double[] percentage) {
		this.percentage = percentage;
	}

	public Table(String[] value, int[] count, double[] percentage) {
		super();
		this.value = value;
		this.count = count;
		this.percentage = percentage;
	}
	
	public String toString() {
		String output = "";
		for (int i = 0; i < value.length; i++) {
			output += (value[i] + ", " + count[i] + ", " + percentage[i] + "\n");
		}
		return output;
	}
	
}
