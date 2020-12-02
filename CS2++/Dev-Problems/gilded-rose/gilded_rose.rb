class GildedRose

  def initialize(items)
    @items = items
  end

  def update_quality()
    @items.each do |item|
      next if item.name.include? "Sulfuras"

      value_change = 1
      value_multiplier = 1

      case item.name
      when "Conjured"
        value_multiplier = 2
      when "Aged Brie"
        value_multiplier = -1
      when "Backstage passes to a TAFKAL80ETC concert"
        value_multiplier = -1
      else
        value_multiplier = 1
      end

      if item.name == "Backstage passes to a TAFKAL80ETC concert"
        if item.sell_in < 11
          value_change = 2
        end
        if item.sell_in < 6
          value_change = 3
        end
        if item.sell_in < 0
          value_change = 0
          item.quality = 0
        end
      else
        value_change += 1 if item.sell_in < 0
      end
      item.quality = item.quality - (value_change * value_multiplier)

      item.sell_in = item.sell_in - 1
   
    end
  end
end

class Item
  attr_accessor :name, :sell_in, :quality

  def initialize(name, sell_in, quality)
    @name = name
    @sell_in = sell_in
    @quality = quality
  end

  def to_s()
    "#{@name}, #{@sell_in}, #{@quality}"
  end
end
