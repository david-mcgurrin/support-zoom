class TreasureMap

  attr_accessor :map_hash, :coordinates, :new_hash

  def initialize
    @map_hash = {}
    @map_size = []
    @x_coordinates = []
    @y_coordinates = []
  end

  def add_item_to_map(arr, item)
    @map_hash[arr] = item
  end


  def remove_item_from_map(key)
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

    @new_hash = @map_hash.each_key do |x|
      x[0] += @left
      x[1] += @bottom
    end
  
  end

  def to_s
   
    @map_size[1].downto(0) do |y|
      @map_size[0].times do |x|
        
        coordinates_found = false

        @new_hash.each do |k, v|
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

tm = TreasureMap.new

tm.add_item_to_map([0,1], "F")
tm.add_item_to_map([11,0], "F")
tm.add_item_to_map([6,-2], "X")
tm.add_item_to_map([-1,-5], "W")

tm.add_item_to_map([3, -3], "O")

tm.remove_item_from_map([3, -3])

tm.get_coordinates

tm.find_row_and_column_lengths

tm.translate_map

tm.to_s