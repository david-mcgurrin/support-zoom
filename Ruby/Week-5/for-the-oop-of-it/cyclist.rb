require_relative 'athlete'

class Cyclist < Athlete

  include IncreaseTraining
  
  attr_accessor :cycling_style

  def initialize(name, age, exp)
    super
  end

  def train
    puts "Going to the velodrome"
    @energy -= 70
  end

  def competition(participants)

    super(participants, "Cycling")
    
  end

  def drug_test

    cheater = @name.include? "Lance"

    puts "Conducting a drug test"

    @medals_won = [] if cheater

    puts cheater ? "Stripped of all medals!" : "Clean, keep it up!"

  end

end
