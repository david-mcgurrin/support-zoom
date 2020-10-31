class Athlete

  @@num_athletes = 0
  @@club = "Galway Athletic Club"

  MEDAL_PRIORITY = {"Gold" => 1, "Silver" => 2, "Bronze" => 3}

  attr_reader :name, :age, :exp, :energy

  def initialize(name = "Anonymous", age = "20", exp = "amateur")
    self.name = name
    self.age = age
    self.exp = exp
    @medals_won = []
    @energy = 100
    @@num_athletes += 1
  end

  def name=(name)
    if name == "" || !(name.is_a? String)
      raise "Name can't be blank and must be a string!"
    end
    @name = name.capitalize
  end

  def age=(age)
    if age.to_i < 0 || age.to_i > 120
      raise "Age of #{age} is not valid"
    end
    @age = age
  end

  def exp=(exp)
    if exp == "" || !(exp.is_a? String)
      raise "Experience can't be blank and must be a string!"
    end
    @exp = exp.capitalize
  end

  def train
    puts "Going to the gym"
    @energy -= 60
  end

  def eat
    puts "Eating a nutritious meal"
    @energy += 5
  end

  def sleep
    puts "Getting a good nights rest"
    @energy += 50
  end

  def competition(participants, sport)

    puts "Entering a #{sport} competition"
  
    position = rand(participants) + 1

    case position
    when 1
      medal = "Gold"
    when 2
      medal = "Silver"
    when 3
      medal = "Bronze"
    end

    self.add_medals(medal => sport) if position <= 3

    @energy -= 60
    
  end

  def add_medals(medal)
    @medals_won << medal
  end

  def display_medals

    @medals_won.sort_by! { |medal| MEDAL_PRIORITY[medal.first[0]] }

    puts "The medals for #{@name} are as follows:" if @medals_won.length > 0

    @medals_won.each { |medal| medal.each { |k,v| puts "#{k.capitalize}: #{v.capitalize}"} }

  end

  def self.athlete_count
    @@num_athletes
  end

  def self.club
    @@club
  end

end
