# Question 1 | 2024
## This question is about...

The main goal is to write two methods: `simulateOneDay` & `simulateManyDays`.

**simulateOneDay:**
- in this method, there are two conditions
- during normal conditions (95% of the time), a given number of birds will eat a randomly generated number of food (from 10 to 50 grams, inclusive)
- this number is fixed, and each bird will eat the same amount of food
- you will subtract the food eaten from the variable `currentFood`
- during abnormal conditions (5% of the time), a bear will show up to the feeder
- the `currentFood` variable will always be set to 0

**simulateManyDays:**
- in this method, you will simulate multiple days (the amount of days will be given as a parameter)
- the method should return number of days when birds or a bear found food at the feeder
- you **must** use the previously created `simulateOneDay` method

## Struggles with this question...
The main problem with this question could be in the part a. You need to properly use `Math.random()` to accomplish the goal.\
Loops may also be a problem when you go out of bounds. Without testing the code, it's hard to tell if it has some silly mistakes. 
## Prior expereiences that helped...
Do not forget about Java Quick Reference! It is given to you on the exam with the stuff you **will** need on the exam. JQR has `Math.random()`, which is needed in part a.
The only thing you need to remember is the formula. First, find the **range** and multiply it by Math.random(). Add 1 to the value, so you include all possibilities.\
In the end we got: `((Math.random() * 40) + 1) //40 is the range in this case`
