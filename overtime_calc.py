from __future__ import print_function
import sys
import getpass


class OvertimeCalc:
    def __init__(self, salary):
        self.pre = 1.34
        self.post = 1.67
        self.salary = salary
        self.salary_per_hour = salary / 30. / 8

    def calc(self, overtime_hr):
        overtime = (overtime_hr - 0.5) // 0.5 * 0.5
        if overtime > 2:
            hour = 2 * self.pre + (overtime - 2) * self.post
        else:
            hour = overtime * self.pre
        return int(hour * self.salary_per_hour)

    def extra(self, overtime_list):
        overtime_list = map(float, overtime_list)
        return sum(map(self.calc, overtime_list))


if __name__ == '__main__':
    overtime = sys.argv[1:]
    salary = getpass.getpass('your salary: ')
    salary = int(salary) if len(salary) > 0 else 0
    obj = OvertimeCalc(salary)
    print('extra:', obj.extra(overtime))