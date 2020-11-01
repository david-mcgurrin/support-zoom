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
  end

  def rest
    puts "ZZzzzz"
    puts "#{@name} finds a suitable mate"
  end

  def print_name
    puts "The organism's name is #{name}"
  end

  def to_s
    "#{self.name} - #{self.class}"
  end

end