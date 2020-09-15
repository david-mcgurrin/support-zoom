# Outfit Generator


The Outfit Generator is _the_ essential tool to make sure you always leave your house looking the best!

## Overview

In setting up the hierarchy I decided to start with a base class of `Wearable`. This helped distinguish between clothes and some of the accessories. The project is broken up into different folders/subfolders and thus there are a number of packages. The full hierarchy diagram can be seen [on Miro](https://miro.com/app/board/o9J_kl-z9eQ=/).

The top level is the Wearable package which has the `Wearable` class.

Beneath that is the Clothing package and the Accessories package, along with two classes, `Hat` and `Tie`. These are grouped under Clothing but are also linked to the Accessories by way of the Accessories interface. This interface also includes the `Watch` and `Jewellery` classes so that all the accessories can be grouped together.

Within the Clothing package then are the core clothing categories: shirts, pants, shoes & outerwear.

Each of these is its own package containing abstract classes; `Shirts`, `Pants`, `Shoes` & `Outerwear`.

And finally there are subclasses for each of these which inherit the methods.

## Characteristics

Each abstract class and the interface list a number of methods, all of which must be used by the subclasses.

First of all are the standard 'get' methods and then a series of Boolean methods which are used for the matches.

A lot of these vary from the main class to main class though some are shared such as `isCasual()`, `isFancy()` and `isColorFul()`. The first two mentioned here are the most important as we want to ensure that there is no mismatch of casual and fancy clothing. The third is useful for checking for color clashes between different items.

The rest of the methods check to see if certain items work well with other items so that we can ensure they do/do not get output as a final outfit.

There are then some more unique ones such as `isJewellery()` and `warmWeatherOnly` to help further distinguish what item of clothing is being returned

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