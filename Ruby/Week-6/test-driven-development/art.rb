class AsciiArt

  # Diamond Shape
  def draw(number)

    shape = ""

    1.upto(number) do |i|
      shape += " " * (number - i)
      shape += "* " * i
      shape += "\n"
    end

    (number - 1).downto(1) do |i|
      shape += " " * (number - i)
      shape += "* " * i
      shape += "\n"
    end

    shape
  end

end
