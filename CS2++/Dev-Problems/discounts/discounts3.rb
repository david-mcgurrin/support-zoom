# [ ['grapes', 1], ['apples', 0], ['peaches', 1] ] # output => 12
# [ ['grapes', 1], ['apples', 1], ['peaches', 1] ] # output => 15
# [ ['grapes', 2], ['apples', 2], ['peaches', 1] ] # output => 16.8
# [ ['grapes', 3], ['apples', 5], ['peaches', 2] ] # output => 36
# [ ['peaches', 7], ['grapes', 7], ['apples', 7] ] # output => 85.8

INPUT = [['grapes', 2], ['apples', 2], ['peaches', 1]].freeze

class CartItem
  PRODUCT_PRICES = { 'grapes' => 500, 'apples' => 300, 'peaches' => 700 }.freeze

  def initialize(item, quantity)
    @item = item
    @quantity = quantity
    @percentage = 20
    @spend_threshold = 2
  end

  def price
    (PRODUCT_PRICES[@item] * @quantity) - discount
  end

  private

  def discount
    case @item
    when 'grapes'
      (@quantity / @spend_threshold).floor * PRODUCT_PRICES['grapes']
    when 'apples'
      @quantity >= 2 ? PRODUCT_PRICES['apples'] * (@percentage / 100) : 0
    else
      0
    end
  end
end

class Cart
  def initialize(products)
    @products = products
    @total = 0
  end

  def total
    @products.each do |product|
      item = CartItem.new(product.first, product.last)
      puts item.price
      @total += item.price
    end

    @total
  end
end

# def price_calculator(products)
#   product_prices = { 'grapes' => 500, 'apples' => 300, 'peaches' => 700 }

#   total = 0

#   products.each do |product|
#     cost = product_prices[product.first]
#     quantity = product.last

#     remainder = 0

#     if (product.first.include? 'grapes') && (product.last >= 2)
#       remainder = 1 if product.last.odd?
#     end

#     quantity = product.last / 2 if (product.first.include? 'grapes') && (product.last >= 2)

#     puts quantity

#     cost -= (cost / 5) if (product.first.include? 'apples') && (product.last >= 2)

#     puts cost

#     total += cost * (quantity + remainder)
#     # print product_prices[product.first]
#     # puts
#   end

#   total.to_f / 100
# end

cart = Cart.new(INPUT)

puts cart.total
