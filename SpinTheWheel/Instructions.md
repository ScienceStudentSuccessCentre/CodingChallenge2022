# Welcome to SSSC's Spin The Wheel!


## Challenge Objective

For this challenge, you will create a "Spin the Wheel" game in your choice of programming language (e.g. in Python or Java). 

[Here is an example of a wheel.](https://www.google.com/search?q=spin+the+wheel&rlz=1C5CHFA_enCA917CA917&tbm=isch&source=lnms&sa=X&ved=2ahUKEwjE5pyU7u_zAhXnGTQIHQnUCicQ_AUoAnoECAEQBA&biw=1426&bih=952&dpr=2#imgrc=KV4Y97TJqyUvRM)

The **wheel_template.py** file is an example of a wheel implementation. Feel free to use this implementation or create your own!


## Game Details and Rules

* Allow the player to spin the wheel 5 times. 
* Decrease the number of spins every time a player spins the wheel.
* All slots on the wheel have an equal amount of chance to be landed on.
* Display the player's total sum at the end.

**Rules:**
* If the player lands on “Lose A Turn”, their number of available spins will decrease by an extra 1 turn on top of the spin they just used.
* If it is the player's last turn and they land on "Lose A Turn", the number of spins they have left would still be 0. 
* If the player lands on the $1000 slot, they will receive $1000.

**At this point, you will have completed what is required for the Coding Challenge 2021.**

**If you want to keep going with this problem, please feel free to complete the BONUS and/or SUPER EXTRA BONUS components.**

**Bonus:**
* If the player lands on “Lose A Turn” during their last turn and their total sum is greater than 0, take away 5% of their total amount. 
* If the player lands on the $1000 slot, allow them to choose from 3 different questions of your choice. Example question: What does the SSSC stand for?

**Super Extra Bonus:**
* Allow a user-defined number of players to play together. In other words, the program will take in a number (specified by the user) for the number of players that will be playing the game together. Players will alternate and take turns spinning the wheel.
* For example: Player 1 plays, Player 2 plays, Player 3 plays, Player 1 plays, Player 2 plays, etc. 
* Display every player’s score at the end.
* Note that this "Super Extra Bonus" includes all rules under "Bonus". Both must be implemented to receive full points.
