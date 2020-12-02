require File.join(File.dirname(__FILE__), 'gilded_rose')
require 'test/unit'

class TestUntitled < Test::Unit::TestCase

  def test_foo
    items = [Item.new("foo", 0, 0)]
    GildedRose.new(items).update_quality()
    assert_equal items[0].name, "foo"
  end

  def test_conjured_item
    items = [Item.new("Conjured", 10, 10)]
    GildedRose.new(items).update_quality()
    assert_equal items[0].quality, 8
  end

  def test_conjured_item_past_sellIn
    items = [Item.new("Conjured", -1, 10)]
    GildedRose.new(items).update_quality()
    assert_equal items[0].quality, 6
  end

  def test_aged_brie
    items = [Item.new("Aged Brie", 10, 10)]
    GildedRose.new(items).update_quality()
    assert_equal items[0].quality, 11
  end

  def test_aged_brie_past_sellIn
    items = [Item.new("Aged Brie", -1, 10)]
    GildedRose.new(items).update_quality()
    assert_equal items[0].quality, 12
  end

  def test_backstage_passes
    items = [Item.new("Backstage passes to a TAFKAL80ETC concert", 20, 10)]
    GildedRose.new(items).update_quality()
    assert_equal items[0].quality, 11
  end

  def test_backstage_passes_10_days_to_concert
    items = [Item.new("Backstage passes to a TAFKAL80ETC concert", 10, 10)]
    GildedRose.new(items).update_quality()
    assert_equal items[0].quality, 12
  end

  def test_backstage_passes_5_days_to_concert
    items = [Item.new("Backstage passes to a TAFKAL80ETC concert", 5, 10)]
    GildedRose.new(items).update_quality()
    assert_equal items[0].quality, 13
  end

  def test_backstage_passes_after_concert
    items = [Item.new("Backstage passes to a TAFKAL80ETC concert", -1, 10)]
    GildedRose.new(items).update_quality()
    assert_equal items[0].quality, 0
  end


  # TODO

  # Test regular items
  # Test Sulfuras special item
  # Test that the sellIn is reduced
  # Test quality is never > 50 or < 0

end