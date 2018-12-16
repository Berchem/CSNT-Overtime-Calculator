# Description
These scripts were used in command prompt. Type in overtime hours as the following parameters, press enter then typing in your salary. It would calculate your overtime pay.

The rules for overtime pay were according to CSNT.

## Syntax
```
python overtime_calc.py [hours] [...] ...
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

## Requirement
Python2.7 or Python3.+
