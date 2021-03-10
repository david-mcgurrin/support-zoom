# [ ['grapes', 1], ['apples', 0], ['peaches', 1] ] # output => 12
# [ ['grapes', 1], ['apples', 1], ['peaches', 1] ] # output => 15
# [ ['grapes', 2], ['apples', 2], ['peaches', 1] ] # output => 16.8
# [ ['grapes', 3], ['apples', 5], ['peaches', 2] ] # output => 36
# [ ['peaches', 7], ['grapes', 7], ['apples', 7] ] # output => 85.8

INPUT = [['grapes', 1], ['apples', 0], ['peaches', 1]].freeze

def price_calculator(products)
  product_prices = { 'grapes' => 500, 'apples' => 300, 'peaches' => 700 }

  total = 0

  products.each do |product|
    cost = product_prices[product.first]
    quantity = product.last

    remainder = 0

    if (product.first.include? 'grapes') && (product.last >= 2)
      remainder = 1 if product.last.odd?
    end

    quantity = product.last / 2 if (product.first.include? 'grapes') && (product.last >= 2)

    puts quantity

    cost -= (cost / 5) if (product.first.include? 'apples') && (product.last >= 2)

    puts cost

    total += cost * (quantity + remainder)
    # print product_prices[product.first]
    # puts
  end

  total.to_f / 100
end

puts price_calculator(INPUT)
