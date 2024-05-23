# Question 2 | 2024 #

## This question is about... ##
In this question, you have to write a Scoreboard class. Scoreboard includes two teams, an active team, and the scores of each team.

**This includes:**
- write a constructor with two parameters, where the two teams' names are passed in (two strings)
- write a recordPlay method that takes in an int, which represents the number of points that team scored
- if number of points is <= 0, the active team changes
- write a getScore method which returns a String
- the string contains first team's score, hyphen, second team's score, hyphen, and an active team's name
## Struggles with this question... ##
The main struggle is the recordPlay method. It might take some time to process which private variables you might need. I came up with 3 private Strings and 2 private Integers. I set the integers, representing the team's scores, to 0 immediately, so I don't have to set them to 0 in the constructor. Next part is to use the if/else statements to make Java understand which team gets the score.\
Use the statement `String.equals()` and include it in your ifs. Compare active team to the String to decide which team becomes the new active.
## Prior expereiences that helped... ##
This question does not require you to use any loops, which is the best part. if/else logic is fairly easy to comprehend. You learn ifs at the start of your Java experience, and even those who just started with Java could easily get a 9 on this question.
