class TreasureMap

  attr_accessor :map_hash, :co_arr

  def initialize
    @map_hash = {}
  end

  def add_item_to_map(arr, item)
  
    @map_hash[arr] = item
    @co_arr = []

  end

  def find_rows_and_cols

    left = @map_hash.first[0][0]
    right = @map_hash.first[0][0]

    top = @map_hash.first[0][1]
    bottom = @map_hash.first[0][1]

    #puts left, right, top, bottom

    @map_hash.each_key do |key|
      
      if key[0] < left
        left = key[0]
      end

      if key[0] > right
        right  = key[0]
      end

      if key[1] > top
        top = key[1]
      end

      if key[1] < bottom
        bottom = key[1]
      end

    end

    #puts left, right, top, bottom

    @co_arr = [(right - left).abs, (bottom - top).abs]

  end

  def to_s

    @co_arr[1].times do
      @co_arr[0].times do
        print "."
      end
      puts
    end


    puts @map_hash
  end

end

tm = TreasureMap.new

tm.add_item_to_map([0,1], "F")
tm.add_item_to_map([11,0], "F")
tm.add_item_to_map([6,-2], "F")
tm.add_item_to_map([-1,-5], "F")

tm.find_rows_and_cols

tm.to_s