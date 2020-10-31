require_relative 'athlete'

class Cyclist < Athlete

  attr_accessor :cycling_style

  def initialize(name, age, exp)
    super
  end

  def train
    puts "Going to the velodrome"
    @energy -= 70
  end

  def race(participants)

    super(participants, "Cycling")
    
  end

  def drug_test

    @medals_won = [] if @name.include? "Lance"

  end

end
