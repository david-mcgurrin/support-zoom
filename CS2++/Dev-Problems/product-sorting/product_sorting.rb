class ProductSort

  attr_accessor :product_list, :sorted_products

  INNER_SORT_REVERSE = -1

  def initialize(product_list = [])
    @product_list = product_list.map { |x| x.split(",") }
    @sorted_products = []
  end

  def sort_products
    @sorted_products = @product_list.sort_by { |x| [x[1].to_i, x[2].to_i * INNER_SORT_REVERSE] }.reverse!
  end

  def print_sorted_products
    sort_products
    @sorted_products.each { |x| puts x.first }
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

product_sort = ProductSort.new(list)

product_sort.print_sorted_products