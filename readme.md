# Description
These scripts were used in command prompt. Type in overtime hours as the following parameters, press enter then typing in your salary. It would calculate your overtime pay.

The rules for overtime pay were according to CSNT.

## Syntax
In Python
```
python overtime_calc.py [hours] [...] ...
```
In Java
```
javac overtime_calc.java
java overtime_calc [hours] [...] ...
```

## Parameter
<table>
    <tr>
        <th>argument</th>
        <th>description</th>
        <th>type</th>
    </tr>
    <tr>
        <td>hours</td>
        <td>the hours of the overtime</td> 
        <td>float</td>
    </tr>
</table>

## Example
In Python
```
> python overtime_calc.py [Enter]
your salary: [Enter]
extra: 0

> python overtime_calc.py [Enter]
your salary: [key in 50000 then press Enter]
extra: 0

> python overtime_calc.py 2.3 2.93 2.16 1 [Enter]
your salary: [Enter]
extra: 0

> python overtime_calc.py 2.3 2.93 2.16 1 [Enter]
your salary: [key in 50000 then press Enter]
extra: 1533
```
In Java
```
> javac overtime_calc.java

> java overtime_calc 3.21 1.23 2.87
Salary: [key in 60000 then press Enter]
extra: 1715 
```

## Requirement
Python2.7 or Python3.+

JDK 1.8
