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

  def competition(participants)

    super(participants, "Running")
    
  end

  def relax
    puts "Chilling in front of the TV"
    @energy += 20
  end

end
