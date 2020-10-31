require_relative 'athlete'

class Runner < Athlete

  attr_accessor :distance

  def initialize(name, age, exp)
    super
  end

  def train
    puts "Going to the track"
    @energy -= 70
  end

  def race(participants)

    super(participants, "Running")
    
  end

  def relax
    puts "Chill in front of the TV"
    @energy += 20
  end

end
