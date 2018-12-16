public class overtime_calc {
	private double pre;
	private double post;
	private int salary;
	private double salary_per_hour;

	public overtime_calc () {
		
	}
	public overtime_calc(int salary) {
		this.pre = 1.34;
		this.post = 1.67;
		this.salary = salary;
		this.salary_per_hour = salary / 30. / 8;
		
	}
	public int calc(double overtime_hr) {
		double hour = 0;
		double overtime = (int)((overtime_hr - 0.5) / 0.5) * 0.5;
	    if (overtime > 2)
	    	hour = 2 * this.pre + (overtime - 2) * this.post;
	    else
	    	hour = overtime * this.pre;
	    return (int)(hour * this.salary_per_hour);
	}
	public int extra(String[] overtime_list) {
		int overtime_sum = 0;
		for (int i = 0; i < overtime_list.length; i++) {
			overtime_sum += calc(Double.parseDouble(overtime_list[i]));
		}
		return overtime_sum;
	}
      
      
	public static void main(String[] args) {
		java.io.Console console = System.console();
		String salary = new String(console.readPassword("Salary: "));
		overtime_calc obj = new overtime_calc(Integer.parseInt(salary));
		System.out.println("Extra: " + obj.extra(args));

	}

}
