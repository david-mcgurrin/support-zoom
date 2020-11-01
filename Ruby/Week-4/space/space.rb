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

  def fight
    puts "#{@name} fights a rival"
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
    puts "#{@name} finds a suitable mate"
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

end

class Insect < Organism

  def move
    puts "#{@name} flies through the planet"
    @energy -= 20
  end

end

class Reptile < Organism

end

class Bird < Organism

  def move
    puts "#{@name} flies through the planet"
    @energy -= 20
  end
end

class Fish < Organism

  def move
    puts "#{@name} swims through the planet"
    @energy -= 20
  end

end

class Plant < Organism

  def move
    puts "#{@name} grows across the planet"
    @energy -= 20
  end

end