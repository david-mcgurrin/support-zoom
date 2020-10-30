require_relative 'athlete'

class Cyclist < Athlete

  def initialize(name, age, exp)
    super
  end

  def train
    puts "Going to the track"
  end

end

puts
claire = Cyclist.new("Claire", 20, "amatuer")

puts claire.name, claire.age

claire.eat
claire.sleep
claire.train
