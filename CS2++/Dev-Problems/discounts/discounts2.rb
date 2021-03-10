# [ ['grapes', 1], ['apples', 0], ['peaches', 1] ] # output => 12
# [ ['grapes', 1], ['apples', 1], ['peaches', 1] ] # output => 15
# [ ['grapes', 2], ['apples', 2], ['peaches', 1] ] # output => 16.8
# [ ['grapes', 3], ['apples', 5], ['peaches', 2] ] # output => 36
# [ ['peaches', 7], ['grapes', 7], ['apples', 7] ] # output => 85.8

INPUT = [ ['grapes', 7], ['apples', 7], ['peaches', 7] ].freeze

class Fruit
  attr_accessor :price, :quantity

  def initialize(price, quantity)
    @price = price
    @quantity = quantity
  end

  def calculate_price
    @price * @quantity
  end

end

class Grapes < Fruit

  def initialize(quantity)
    super(500, quantity)
    @spend_threshold = 2
  end

  def calculate_price
    @quantity = (@quantity/@spend_threshold + @quantity % @spend_threshold)
    super
  end
end

class Apples < Fruit

  def initialize(quantity)
    super(300, quantity)
    @percentage = 0.2
  end

  def calculate_price
    @price -= (@price * @percentage)
    super
  end
end

class Peaches < Fruit

  def initialize(quantity)
    super(700, quantity)
  end

end

class Cart
  attr_accessor :total, :line_items

  def initialize
    @total = 0
    @line_items = []
  end

  def add_products(products)
    products.each do |product|
      case product.first
      when 'grapes'
        @line_items << Grapes.new(product.last)
      when 'apples'
        @line_items << Apples.new(product.last)
      when 'peaches'
        @line_items << Peaches.new(product.last)
      end
    end
    @line_items
  end

  def calculate_total
    @line_items.each do |line_item|
      @total += line_item.calculate_price
    end
    @total/100
  end

end

cart = Cart.new
cart.add_products(INPUT)
puts cart.calculate_total