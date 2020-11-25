# [ ['grapes', 1], ['apples', 0], ['peaches', 1] ] # output => 12
# [ ['grapes', 1], ['apples', 1], ['peaches', 1] ] # output => 15
# [ ['grapes', 2], ['apples', 2], ['peaches', 1] ] # output => 16.8
# [ ['grapes', 3], ['apples', 5], ['peaches', 2] ] # output => 36
# [ ['peaches', 7], ['grapes', 7], ['apples', 7] ] # output => 85.8

INPUT = [ ['grapes', 2], ['apples', 2], ['peaches', 1] ].freeze

class Grapes
  attr_accessor :price, :quantity

  def initialize(quantity)
    @price = 500
    @x = 2
    @y = 1
    @quantity = quantity
  end

  # def buy_x_get_y
  #   @quantity /= 2
  # end

  def item_price
    @price * (@quantity/2 +@quantity % 2)
  end
end

class Apples
  attr_accessor :price, :quantity

  def initialize(quantity)
    @price = 300
    @percentage = 20 / 100
    @quantity = quantity
  end

  # def percentage_dicount
  #   @price -= (@price * @percentage)
  # end

  def item_price
    @price -= (@price * 0.2)
    @price * @quantity
  end
end

class Peaches
  attr_accessor :price, :quantity

  def initialize(quantity)
    @quantity = quantity
    @price = 700
  end

  def item_price
    @price * @quantity
  end
end

class PriceCalculator
  attr_accessor :total, :fruit

  def initialize
    @total = 0
    @fruit = []
  end

  def products_setup(products)

    products.each do |product|

      case product.first

      when 'grapes'
        @fruit << Grapes.new(product.last)
      when 'apples'
        @fruit << Apples.new(product.last)
      when 'peaches'
        @fruit << Peaches.new(product.last)
      end

      
    end
    puts @fruit
    @fruit

  end

  def calculate_total

    @fruit.each do |fruit|
      @total += fruit.item_price

    end
  
    @total/100
  end

end

price_calculator = PriceCalculator.new
price_calculator.products_setup(INPUT)

puts price_calculator.calculate_total