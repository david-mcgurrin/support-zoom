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

end

puts "Single Domino"
domino = Domino.new(2, 3)
domino.to_s

