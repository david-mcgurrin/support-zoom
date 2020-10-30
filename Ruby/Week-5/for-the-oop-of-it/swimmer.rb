require_relative 'athlete'

class Swimmer < Athlete

  def initialize(name, age, exp)
    super
  end

  def train
    puts "Going to the pool"
  end

end

puts

steve = Swimmer.new("Steve", 20, "amatuer")

puts steve.name, steve.age

steve.eat
steve.sleep
steve.train
