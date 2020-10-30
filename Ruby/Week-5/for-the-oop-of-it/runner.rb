require_relative 'athlete'

class Runner < Athlete

  def initialize(name, age, exp)
    super
  end

  def train
    puts "Going to the track"
  end

end

puts

rick = Runner.new("Rick", 20, "amatuer")


puts rick.name, rick.age

rick.eat
rick.sleep
rick.train
