# Outfit Generator


The Outfit Generator is _the_ essential tool to make sure you always leave your house looking the best!

## Overview

In setting up the hierarchy I decided to start with a base class of `Wearable`. This helped distinguish between clothes and some of the accessories. The full hierarchy diagram can be seen [on Miro](https://miro.com/app/board/o9J_kl-z9eQ=/).

The base class is the abstract `Wearable` class.

Beneath that is the `Clothing` and `Accessories` classes.

Within the `Clothing` class are 4 abstract classes: `Shirts`, `Pants`, `Shoes` and `Outerwear` which each have further subclasses for the different types of clothing.

The `Accessories`class has 4 subclasses: `Hat`, `Tie`, `Jewellery` and `Watch`.


**Note:** The Outfit Generator does not currently support ladies styles.

## Characteristics

The abstract classes list the main methods and the two subclasses set up the default behaviour for these as well as setting up the constructors for the subsequent base classes.
The base classes are the specfific wearable items which can be created due to the inheritance in throughout the project.

## Rules

The Outfit Generator works by creating an ArrayList for each category as well as a random integer for each one. This random integer is used for indexing the ArrayList each time the Outfit Generator runs.

With the ArrayList and random integer in place we can start looking for matches in the randomly generated pairings.

The way it has been set up is to run a method that will initially look for some particularly good matches, such as entirely formal, good for hiking and good for holidays. If an outfit of this kind is generated ad message is output and we exit the loop as a good outfit has been found.

If the above check doesn't pass then we enter a separate method that checks against certain combinations. For example, colorful pants with plain top, blue and green pants/shirt, shorts and large jackets, fancy accessories and casual shirts and a tie and casual pants.

We then run a check to ensure that certain fancy/casual pairs don't return a good outfit.

After all these checks we are then left with an acceptable outfit.

## Testing

This can be tested in the `TestClass` which creates an `OutfitGenerator` object. This object runs a method to populate a series of ArrayList objects (one for each of the 5 categories).

We then run a `for` loop to generate a number of outfits so that we can pick the best of the bunch. Inside the `for` loop is a `while` loop that keeps running the `checkStyle()` method until an acceptable outfit has been found.

Give it a try and good luck in looking good!

## Resources

**Diagram:** https://miro.com/app/board/o9J_kl-z9eQ=/
