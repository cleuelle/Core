# Core
Also known as "Down to the Core", this is a small clicker game made in Java.
Though intended to be a team project, unforseen circumstances led me (Caleb Leuellen) to create this on my own.
I worked very hard on this, so I hope you enjoy it!

### Project Aim
This project was somewhat of a homage to the clicker games out there like Cookie Clicker and such, but I wanted to add my own little twist to it. 
In the real world, if you dig and dig and dig down, it's going to get hot and the pressure is going to get intense. So I added gauges you needed to keep an eye on to
sort of "simulate" this. I also added items to the mix in order to incorporate the ArrayList and DefaultModelList.

### How to Play
The goal of the game is to get as much EXP as possible (this is your score at the end). To do this, you need to defeat enemies while doing upgrades and keeping an eye on the various gagues. Enemies and having too high temperature or pressure will damage you, and the game is over when your HP hits 0.

### The Files and their functions
- Core.java - This is the GUI, as well as where most of the program logic resides (like upgrades, the list of items, the gameplay etc.)
- Player.java - This contains the basic stats used, as well as the EXP calculations
- Item.java - This simply contains the various types of items you can get and their names
- Enemy.java - This contains the stats of the types of enemies you will be fighting
