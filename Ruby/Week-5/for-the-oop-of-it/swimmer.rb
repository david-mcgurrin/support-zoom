require_relative 'athlete'

class Swimmer < Athlete

  attr_accessor :fave_style

  def initialize(name, age, exp)
    super
  end

  def train
    puts "Going to the pool"
    @energy -= 70
  end

  def competition(participants)

    super(participants, "Swimming")

  end

  def dive
    puts "Jumping from the top of Blackrock pier"
    @energy -= 5
  end

end
