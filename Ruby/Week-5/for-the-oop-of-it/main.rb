require_relative 'athlete'
require_relative 'cyclist'
require_relative 'runner'
require_relative 'swimmer'

# Testing the Athlete class
athlete = Athlete.new("jim", 25, "amateur")

puts athlete.name
puts athlete.age
puts athlete.exp
puts
puts "#{athlete.name}'s energy level is #{athlete.energy}"

athlete.eat
athlete.train
puts

puts "#{athlete.name}'s energy level is #{athlete.energy}"

athlete.eat
athlete.sleep
puts

puts "#{athlete.name}'s energy level is #{athlete.energy}"

athlete.competition(10, "golf")
athlete.sleep

athlete.competition(3, "egg and spoon race")
athlete.sleep

athlete.competition(5, "walking")
athlete.sleep
puts

puts "#{athlete.name}'s energy level is #{athlete.energy}"
puts

athlete.display_medals

puts "\n"

# Testing the Runner class

runner = Runner.new("Rick", 25, "professional")

puts runner.name
runner.train
runner.sleep
puts
puts "#{runner.name}'s energy level is #{runner.energy}"

runner.sleep

runner.competition(5)

runner.sleep

runner.competition(5)

runner.sleep

runner.competition(5)

runner.sleep

runner.competition(5)

puts
runner.relax

runner.sleep

puts "#{runner.name}'s energy level is #{runner.energy}"

puts

runner.display_medals

puts "\n"

# Testing the Swimmer class

swimmer = Swimmer.new("Sarah", 25, "amateur")

puts swimmer.name
swimmer.train
swimmer.sleep
puts

puts "#{swimmer.name}'s energy level is #{swimmer.energy}"

swimmer.sleep

swimmer.competition(5)

swimmer.sleep

swimmer.competition(5)

swimmer.sleep

swimmer.competition(5)

swimmer.sleep

swimmer.competition(5)

swimmer.sleep

swimmer.competition(5)

swimmer.sleep

swimmer.competition(5)

swimmer.sleep

swimmer.competition(5)

swimmer.sleep

swimmer.competition(5)

puts
swimmer.dive

swimmer.sleep

puts "#{swimmer.name}'s energy level is #{swimmer.energy}"

puts

swimmer.display_medals

puts "\n"

# Testing the Cyclist class

amateur_cyclist = Cyclist.new("Paul", 50, "amateur")

puts amateur_cyclist.name
amateur_cyclist.train
amateur_cyclist.sleep
puts

puts "#{amateur_cyclist.name}'s energy level is #{amateur_cyclist.energy}"

amateur_cyclist.sleep

amateur_cyclist.competition(5)

amateur_cyclist.sleep

amateur_cyclist.competition(5)

amateur_cyclist.sleep

amateur_cyclist.competition(5)

amateur_cyclist.sleep

amateur_cyclist.competition(5)

puts

amateur_cyclist.sleep

puts "#{amateur_cyclist.name}'s energy level is #{amateur_cyclist.energy}"

puts

amateur_cyclist.display_medals

puts

amateur_cyclist.drug_test

puts

amateur_cyclist.display_medals

puts "\n"

cyclist = Cyclist.new("Lance", 45, "professional")

puts cyclist.name
cyclist.train
cyclist.sleep

puts "#{cyclist.name}'s energy level is #{cyclist.energy}"

puts

cyclist.sleep

cyclist.competition(5)

cyclist.sleep

cyclist.competition(5)

cyclist.sleep

cyclist.competition(5)

cyclist.sleep

cyclist.competition(5)

puts

cyclist.sleep

puts "#{cyclist.name}'s energy level is #{cyclist.energy}"

puts

cyclist.display_medals

puts

cyclist.drug_test

puts

cyclist.display_medals

# Testing the Athlete class methods

puts
puts "The total number of athletes in #{Athlete.club} is #{Athlete.athlete_count}"

puts "\n"

# Additional attributes
puts "Additional Attributes"
puts "-----"
runner.distance = "middle distance"
puts "#{runner.name} prefers running #{runner.distance}"
amateur_cyclist.cycling_style = "road"
puts "#{amateur_cyclist.name} is a #{amateur_cyclist.cycling_style} cyclist"
swimmer.fave_style = "butterfly"
puts "#{swimmer.name} specialises in #{swimmer.fave_style}"

puts "\n\n"

# MIXIN 1
puts "Mixins"
puts "-----"
runner.circuits(5)

# Error -> Mixin not added to the Swimmer class
#swimmer.circuits(5)

puts

# MIXIN 2

swimmer.relax

amateur_cyclist.relax

runner.relax # Overrides the mixin method

puts

# MIXIN 3

puts "#{runner.name} is #{runner.exp}"

runner.turn_pro(runner.medals_won) # Returns since already pro

puts

puts "#{swimmer.name} is #{swimmer.exp}"

swimmer.turn_pro(swimmer.medals_won)

puts "#{swimmer.name} is #{swimmer.exp}"
