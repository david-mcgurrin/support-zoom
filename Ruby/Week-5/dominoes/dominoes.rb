class Domino

  @@dominoes_array = []

  attr_reader :top, :bottom

  def initialize(top, bottom)
    self.top = top
    self.bottom = bottom
  end

  def top=(top)
    if top < 0 || top > 6
      raise "Must be a numerical value between 0 - 6"
    end
    @top = top
  end

  def bottom=(bottom)
    if bottom < 0 || bottom > 6
      raise "Must be a numerical value between 0 - 6"
    end
    @bottom = bottom
  end

  def to_s
    puts "#{top} \n-\n#{bottom}"
  end

  def self.create_dominoes_array
  
    (0..6).each do |i|
      (0..i).each do |j|
        @@dominoes_array << [j, i]
      end
    end

    @@dominoes_array
  
  end

  def swap_tops_and_bottoms(dominoes)

    dominoes.map { |d| d.reverse }
  
  end

  def find_dominoes_with(dominoes, num_dots)

    dominoes.find_all do |d|
      d.first == num_dots || d.last == num_dots
    end

  end
  

end

puts "Single Domino"
domino = Domino.new(2, 3)
domino.to_s

puts "Double Six of Dominoes"
dominoes_array = Domino.create_dominoes_array

dominoes_array.each do |d|
  d = Domino.new(d.first, d.last)
  d.to_s
  puts
end

puts
puts

swapped = domino.swap_tops_and_bottoms(dominoes_array)

swapped.each do |d|
  d = Domino.new(d.first, d.last)
  d.to_s
  puts
end


print domino.find_dominoes_with(dominoes_array, 4)
puts