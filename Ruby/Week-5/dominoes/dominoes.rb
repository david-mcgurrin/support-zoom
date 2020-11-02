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
    @domino_string = "-----"

    [@top, @bottom].each do |side|

      case side
      when 0
        @domino_string += "\n|   |\n|   |\n|   |"
      when 1
        @domino_string += "\n|   |\n| # |\n|   |"
      when 2
        @domino_string += "\n|#  |\n|   |\n|  #|"
      when 3
        @domino_string += "\n|#  |\n| # |\n|  #|"
      when 4
        @domino_string += "\n|# #|\n|   |\n|# #|"
      when 5
        @domino_string += "\n|# #|\n| # |\n|# #|"
      when 6
        @domino_string += "\n|# #|\n|# #|\n|# #|"
      end

      @domino_string += "\n-----"

    end

    puts "#{@domino_string}"
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

  def find_dominoes_with(dominoes,num_dots)
    dominoes.find_all { |d| d.first == num_dots || d.last == num_dots }
  end

  def self.loop_through_array(arr)
    arr.each do |d|
      d = Domino.new(d.first, d.last)
      d.to_s
      puts
    end
  end

end



puts "Single Domino"
domino = Domino.new(2, 3)
domino.to_s

puts

puts "Double Six of Dominoes"
dominoes_array = Domino.create_dominoes_array

Domino.loop_through_array(dominoes_array)

puts
puts

puts "Swap method"
swapped = domino.swap_tops_and_bottoms(dominoes_array)

Domino.loop_through_array(swapped)

puts
puts

puts "Find method"
found = domino.find_dominoes_with(dominoes_array, 4)

Domino.loop_through_array(found)
