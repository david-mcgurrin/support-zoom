class InventoryMapper

  attr_accessor :input, :inventory_hash

  def initialize(input)
    @input = input.split("")
    @inventory_hash = {"Shelf"=> 0, "Stool"=> 0, "Table"=> 0}
  end

  def map_input_to_items

    stool_tracker = []
    stool_items = "bccc"

    table_tracker = []
    table_items = "deeee"


    @input.each do |x|

      @inventory_hash["Shelf"] += 1 if x == "a"

      if x == "b" || x == "c"

        stool_tracker << x

      end

      if x == "d" || x == "e"

        table_tracker << x

      end


      if stool_tracker.length >= 4

        sorted = stool_tracker.sort.join

        if sorted.include? stool_items

          @inventory_hash["Stool"] += 1

          sorted.slice!(0,4)

          stool_tracker = sorted.split("")

        end


      end


      if table_tracker.length >= 5

        sorted = table_tracker.sort.join

        if sorted.include? table_items

          @inventory_hash["Table"] += 1

          sorted.slice!(0,5)

          table_tracker = sorted.split("")

        end


      end

    end

    @inventory_hash

  end


end

product_ids = "abccc"
inventory_mapper = InventoryMapper.new(product_ids)

puts inventory_mapper.map_input_to_items