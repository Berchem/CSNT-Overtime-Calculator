class OvertimeCalc {
  var pre = 1.34
  var post = 1.67
  var hour = 0.0
  var salary = 0
  var SalaryPerHour = 0.0

  def this(salary : Int) = {
    this();
    this.salary = salary
    this.SalaryPerHour = salary / 30.0 / 8
    this.pre = pre
    this.post = post
  }

  def calc(OvertimeHour : Double) = {
    val overtime = ((OvertimeHour - 0.5) / 0.5).toInt * 0.5
    if (overtime > 2) {
      hour = 2 * this.pre + (overtime - 2) * this.post
    } else {
      hour = overtime * this.pre
    }
    (hour * this.SalaryPerHour).toInt
  }
//
//  def extra(OvertimeList : util.List[Double]): Int = {
//    OvertimeList.forEach(this.calc)
//  }

}


val overtimeCalc = new OvertimeCalc(50000);
println(overtimeCalc.calc(2.3))


