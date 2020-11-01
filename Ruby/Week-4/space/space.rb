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

class Spaceship

  def initialize(fuel, distance = 10000)
    @fuel = fuel
    @distance = distance
    @organisms = []
  end

  def board(org)
    @organisms << org
  end

  def unboard
    @organisms.pop
    @organisms
  end

  def role_check
    @organisms.each_with_index do |o, i|
      puts "  #{i + 1} #{o.to_s}"
    end
  end

  def blast_off()

    puts "Taking off!"
    puts "Initiate countdown timer:"
    t = Time.new(0)
    countdown_time_in_seconds = 3

    countdown_time_in_seconds.downto(1) do |seconds|
      puts (t + seconds).strftime('%S')
      sleep 1
    end
    puts "Blast off!!!"

    puts
    countdown_time_in_seconds = 10

    puts "Travelling towards Keplar-1649c"
    puts

    incremental_dist = @distance / countdown_time_in_seconds

    incremental_fuel = @fuel /  countdown_time_in_seconds

    countdown_time_in_seconds.downto(1) do |seconds|
      percentage_remaining = (incremental_fuel * seconds).to_f / @fuel.to_f * 100
      puts "#{@distance - (incremental_dist * seconds) + incremental_dist} light years travelled. \tFuel at #{incremental_fuel * seconds} (#{percentage_remaining}%)"
      puts "FUEL CRITICAL!" if percentage_remaining < 20
      sleep 1
    end
    puts "\nArrived!"    

  end

end


mammal = Mammal.new("Bucky O'Hare", "green", ["land"])

bird = Bird.new("Deadeye Duck", "black", ["sky", "land", "sea"])

reptile = Reptile.new("Al Negator", "purple", ["land", "sea"])

insect = Insect.new("Waspinator", "yellow/green", ["sky", "land"])

fish = Fish.new("Big Mouth Billy Bass", "blue", ["sea"])

plant = Plant.new("Astro Turf", "orange", ["land", "sea"])

spaceship = Spaceship.new(5760, 1000000)

spaceship.board(mammal)

spaceship.board(bird)

spaceship.board(reptile)

spaceship.board(insect)

spaceship.board(fish)

spaceship.board(plant)

puts "Travelling to Kepler-1649c"

puts "Last minute role call:"

spaceship.role_check

puts "\nReady to go\n"

spaceship.blast_off