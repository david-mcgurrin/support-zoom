class Athlete

  @@num_athletes = 0

  attr_reader :name, :age, :exp, :club, :energy

  def initialize(name, age, exp)
    @name = name
    @age = age
    @exp = exp
    @club = "Galway"
    @medals_won = []
    @energy = 100
    @@num_athletes += 1
  end

  def name=(name)
    if name == ""
      raise "Name can't be blank!"
    end
    @name = name.capitalize
  end

  def age=(age)
    if age < 0 || age > 100
      raise "Age of #{age} is not valid"
    end
    @age = age
  end

  def exp=(exp)
    if exp == ""
      raise "Experience can't be blank!"
    end
    @exp = exp.capitalize
  end

  def train
    puts "Going to the gym"
    @energy -= 50
  end

  def eat
    puts "Eating a nutritious meal"
    @energy += 5
  end

  def sleep
    puts "Getting a good nights rest"
    @energy += 50
  end

  def medals(medal)

    @medals_won << medal
  
  end

  def display_medals
    @medals_won.each { |medal| puts medal }
  end

  def self.athlete_count
    @@num_athletes
  end

end


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