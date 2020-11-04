module IncreaseTraining

  def circuits(laps)

    puts "#{self.name} carries out #{laps} laps"

  end

end

module Rest

  def relax
    puts "#{self.name} is having a well earned day off"
    self.energy += 50
  end

end

module Improvement

  def turn_pro(medals)

    return if self.exp.downcase.include? "professional"

    puts "Training to become a professional.."

    puts "Need more than 2 gold medals to turn pro"

    gold_count = medals.find_all { |medal| medal.first[0].downcase.include? "gold" }.count

    puts "#{self.name} has #{gold_count} gold medals"

    self.exp = "Professional" if gold_count >= 2

  end

end