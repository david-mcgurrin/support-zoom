class TreasureMap

  attr_accessor :map_hash, :coordinates, :translated_map_hash

  def initialize
    @map_hash = {}
    @map_size = []
    @x_coordinates = []
    @y_coordinates = []
  end

  def add_item_to_treasure_map(arr, item)
    @map_hash[arr] = item
  end

  def remove_item_from_treasure_map(key)
    @map_hash.delete(key)
  end

  def get_coordinates  
    @map_hash.each_key do |key|
      @x_coordinates << key.first
      @y_coordinates << key.last
    end
  end

  def find_row_and_column_lengths
    @left = @x_coordinates.min.abs
    @bottom = @y_coordinates.min.abs
    @map_size = [(@x_coordinates.max - @x_coordinates.min).abs + 1, (@y_coordinates.min - @y_coordinates.max).abs]
  end

  def translate_map
    @translated_map_hash = @map_hash.each_key do |k|
      k[0] += @left
      k[1] += @bottom
    end
  end

  def to_s
   
    @map_size[1].downto(0) do |y|
      
      @map_size[0].times do |x|
        
        coordinates_found = false

        @translated_map_hash.each do |k, v|
          if k == [x, y]
            print v == "" ? "." : v
            coordinates_found = true
          end
        end

        print "." unless coordinates_found
        
      end

      puts
      
    end

  end

end

# Create a TreasureMap object
treasure_map = TreasureMap.new

# Add items to the map
treasure_map.add_item_to_treasure_map([0,1], "F")
treasure_map.add_item_to_treasure_map([11,0], "F")
treasure_map.add_item_to_treasure_map([6,-2], "X")
treasure_map.add_item_to_treasure_map([-1,-5], "W")
treasure_map.add_item_to_treasure_map([3, -3], "O")

# Remove an item from the map
treasure_map.remove_item_from_treasure_map([3, -3])

# Get the map coordinates
treasure_map.get_coordinates

# Get the height and length of the map
treasure_map.find_row_and_column_lengths

# Offset the map to remove negative values
treasure_map.translate_map

# Print map to the console
treasure_map.to_s