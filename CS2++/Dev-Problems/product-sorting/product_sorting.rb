class Product
  
  attr_accessor :name, :popularity, :price

  def initialize(name, popularity, price)
    @name = name
    @popularity = popularity
    @price = price
  end

end
class Products

  attr_accessor :list, :products

  def initialize(list)
    @list = list
  end

  def products_array
    @products = @list.map do |product|
      name, popularity, price = product.split(',')
      Product.new(name, popularity.to_i, price.to_i)
    end
  end

end

class ProductSort

  attr_accessor :list, :sorted_products

  INNER_SORT_REVERSE = -1

  def initialize(list)
    @list = list
  end

  def sort_products
    @sorted_products = @list.sort_by { |product| [product.popularity, product.price * INNER_SORT_REVERSE] }.reverse!
  end

  def print_sorted_products
    sort_products
    @sorted_products.each { |product| puts product.name }
  end

end


list = ["Selfie Stick,98,29",
  "iPhone Case,90,15",
  "Fire TV Stick,48,49",
  "Wyze Cam,48,25",
  "Water Filter,56,49",
  "Blue Light Blocking Glasses,90,16",
  "Ice Maker,47,119",
  "Video Doorbell,47,199",
  "AA Batteries,64,12",
  "Disinfecting Wipes,37,12",
  "Baseball Cards,73,16",
  "Winter Gloves,32,112",
  "Microphone,44,22",
  "Pet Kennel,5,24",
  "Jenga Classic Game,100,7",
  "Ink Cartridges,88,45",
  "Instant Pot,98,59",
  "Hoze Nozzle,74,26",
  "Gift Card,45,25",
  "Keyboard,82,19"]


products = Products.new(list).products_array

product_sort = ProductSort.new(products)

product_sort.print_sorted_products