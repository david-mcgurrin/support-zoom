# [ ['grapes', 1], ['apples', 0], ['peaches', 1] ] # output => 12
# [ ['grapes', 1], ['apples', 1], ['peaches', 1] ] # output => 15
# [ ['grapes', 2], ['apples', 2], ['peaches', 1] ] # output => 16.8
# [ ['grapes', 3], ['apples', 5], ['peaches', 2] ] # output => 36
# [ ['peaches', 7], ['grapes', 7], ['apples', 7] ] # output => 85.8

INPUT = [['grapes', 1], ['apples', 0], ['peaches', 1]].freeze

class Grapes
  attr_accessor :price

  def initialize(_quantity)
    @price = 500
    @x = 2
    @y = 1
    @quantity = _quantity
  end

  def buy_x_get_y
    @remainder = @quantity.odd? ? 1 : 0

    @quantity /= 2 if @quantiy >= 2

    @remainder + @quantity
  end
end

class Apples
  attr_accessor :price

  def initialize(_quantity)
    @price = 300
    @percentage = 20 / 100
    @quantiy = _quantity
  end

  def percentage_dicount
    @price -= (@price * @percentage)
  end
end

class Peaches
  attr_accessor :price

  def initialize(_quantity)
    @price = 700
    @quantity = _quantity
  end
end

# class DiscountCalculator
#   def initialize
#     @x = 2
#     @y = 1
#     @percentage = 20
#   end

#   def buy_x_get_y

#   end

#   def percentage_dicount

#   end
# end

class PriceCalculator
  attr_accessor :total

  def initialize
    @total = 0
    @apples = Apples.new
    @grapes = Grapes.new
    @peaches = Peaches.new
  end

  def print_products
    puts @apples.price
    puts @grapes.price
    puts @peaches.price
  end

  def get_total(products)
    products.each do |product|
    end
  end
end

price_calculator = PriceCalculator.new

price_calculator.print_products

puts price_calculator.get_total
