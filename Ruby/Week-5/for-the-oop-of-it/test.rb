require_relative 'athlete'
require_relative 'cyclist'
require_relative 'runner'
require_relative 'swimmer'

claire = Cyclist.new("Claire", 20, "amatuer")

puts claire.name, claire.age

claire.eat
claire.sleep
claire.train


rick = Runner.new("Rick", 20, "amatuer")


puts rick.name, rick.age

rick.eat
rick.sleep
rick.train
rick.race
rick.race
rick.race
rick.race

rick.display_medals

steve = Swimmer.new("Steve", 20, "amatuer")

puts steve.name, steve.age

steve.eat
steve.sleep
steve.train

jim = Athlete.new("Jim", 20, "amatuer")
jim.train
jim.eat
jim.sleep
puts jim.name
puts jim.age
puts jim.energy

jim.medals(silver: "gymnastics")
jim.medals(gold: "swimming")
puts "The medals for #{jim.name} are as follows:"
jim.display_medals

puts

tim = Athlete.new("Tim", 30, "professional")
annie = Athlete.new("Annie", 25, "professional")

tim.medals(gold: "cycling")
puts "The medals for #{tim.name} are as follows:"
tim.display_medals

puts "The total number of athletes in the club is #{Athlete.athlete_count}"