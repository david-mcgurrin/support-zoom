class Organism

  attr_accessor :name, :color, :energy

  def initialize(name, color, habitat)
    @name = name
    @color = color
    @habitat = habitat
    @energy = 100
  end

  def move
    puts "#{@name} travels through the planet"
    @energy -= 20
  end

  def reproduce
    puts "#{@name} finds a suitable mate"
  end

  def breathe
    puts "#{@name} breathes the fine planet air"
  end

  def eat(food="food")
    puts "#{@name} eats some #{food}"
    @energy += 20
  end

  def rest
    puts "ZZzzzz"
    puts "#{@name} gets some rest"
    @energy += 50
  end

  def print_details
    puts "The organism's name is #{name}. Their ideal habitat is #{habitat}"
  end

  def to_s
    "#{self.name} - #{self.class}"
  end

end


class Mammal < Organism

  def fight
    puts "#{@name} fights a rival"
    @energy -= 20
  end

end

class Insect < Organism

  def move
    puts "#{@name} flies through the planet"
    @energy -= 20
  end

  def fight
    puts "#{@name} fights a rival"
    @energy -= 20
  end

end

class Reptile < Organism

  def fight
    puts "#{@name} fights a rival"
    @energy -= 20
  end

end

class Bird < Organism

  def move
    puts "#{@name} flies through the planet"
    @energy -= 20
  end

  def fight
    puts "#{@name} fights a rival"
    @energy -= 20
  end


end

class Fish < Organism

  def breathe
    puts "#{@name} takes air through it's gills"
  end

  def move
    puts "#{@name} swims through the planet"
    @energy -= 20
  end

  def fight
    puts "#{@name} fights a rival"
    @energy -= 20
  end

end

class Plant < Organism

  def move
    puts "#{@name} grows across the planet"
    @energy -= 20
  end

  def reproduce
    puts "#{@name} spreads seeds"
  end

end


mammal = Mammal.new("Bucky O'Hare", "green", ["land"])

bird = Bird.new("Deadeye Duck", "black", ["sky", "land", "sea"])

reptile = Reptile.new("Al Negator", "purple", ["land", "sea"])

insect = Insect.new("Waspinator", "yellow/green", ["sky", "land"])

fish = Fish.new("Big Mouth Billy Bass", "blue", ["sea"])

plant = Plant.new("Astro Turf", "orange", ["land", "sea"])

mammal.move
mammal.fight
mammal.breathe
mammal.reproduce
mammal.eat
mammal.rest

puts "Their current energy is #{mammal.energy}"
puts

bird.move
bird.fight
bird.breathe
bird.reproduce
bird.eat
bird.rest

puts "Their current energy is #{bird.energy}"
puts

reptile.move
reptile.fight
reptile.breathe
reptile.reproduce
reptile.eat(mammal.class)
reptile.rest

puts "Their current energy is #{reptile.energy}"
puts

insect.move
insect.fight
insect.breathe
insect.reproduce
insect.eat
insect.rest

puts "Their current energy is #{insect.energy}"
puts

fish.move
fish.fight
fish.breathe
fish.reproduce
fish.eat
fish.rest

puts "Their current energy is #{fish.energy}"
puts

plant.move
plant.breathe
plant.reproduce
plant.eat
plant.rest

puts "Their current energy is #{plant.energy}"
puts