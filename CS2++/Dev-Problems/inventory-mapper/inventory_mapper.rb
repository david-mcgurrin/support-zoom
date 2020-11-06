class InventoryMapper

  attr_accessor :input, :inventory_hash

  def initialize(input)
    @input = input.split("")
    @inventory_hash = {"Shelf"=> 0, "Stool"=> 0, "Table"=> 0}
  end

  def map_input_to_items

    letter_count = {}

    @input.each do |x|
      letter_count[x] ? letter_count[x] += 1 : letter_count[x] = 1
    end

    letter_count.each do |k, v|
    
      @inventory_hash["Shelf"] = v if k == "a"

      @inventory_hash["Stool"] = letter_count["c"] / 3 > v ? v : letter_count["c"] / 3 if k == "b"

      @inventory_hash["Table"] = letter_count["e"] / 4 > v ? v : letter_count["e"] / 4 if k == "d"

    end

    @inventory_hash

  end

end

product_ids = "eebeedebaceeceedeceacee"
inventory_mapper = InventoryMapper.new(product_ids)

puts inventory_mapper.map_input_to_items