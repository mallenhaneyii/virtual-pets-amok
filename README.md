I started the project just like I started the virtual pet shelter project. I tested for getting the attributes of a single pet. I then planned out the parent classes for that pet. For example, I started testing for an OrganicDog. I originally made a virtual pet parent class that all pets would inherit from and created interfaces for OrganicPet and RoboticPet. I then realized I could create a second parent class for OrganicPet and another for RoboticPet. VirtualPet > OrganicPet > OrganicDog

I created the VirtualPet class and put all the attributes that every pet would share. I created methods to find those things using TDD ofr each pet. I then moved on to OrganicPet and RoboticPet. I gave them their respective attributes and the methods for finding them. Next step was to create a VirtualPetShelter class.

VirtualPetShelter is where I tested for all the actions the user could take. I added all kinds of pets into the Test so that I could assure they were working properly. For example, when I cleaned dog changes it only affected the OrganicDogs. The last class to build was the LitterBox.

I originally thought of the LitterBox as the OrganicCats cleanliness going up and down. I then had the idea to make it a class by itself with one attribute of waste. I then created a method that allowed the user to clean the LitterBox and bring it's waste down to 0.

The last thing I needed to add you the project was the tick method. It would affect the attributes of all classes including the LitterBox class. I did this by adding ticks to the parent classes and in the VirtualPetShelter class I created a tick method that called all of them.

