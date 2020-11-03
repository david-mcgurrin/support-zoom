require 'minitest/autorun'
require_relative '../lego'

class LegoHatTest < Minitest::Test

  def setup
    @lego_hat = LegoHat.new('small', 'blue', 'cap')
  end

  def test_initialize
    assert_kind_of(LegoHat, @lego_hat)
  end

  def test_initial_values
    assert_equal('small', @lego_hat.size)
    assert_equal('blue', @lego_hat.colour)
    assert_equal('cap', @lego_hat.style)
  end

  # Test fails due to incorrect variables in the to_s method
  def test_to_string_outputs_correct_string
    actual =  @lego_hat.to_s
    expected = "a small blue cap"

    assert_equal(expected, actual)
  end

end

class LegoItemTest < Minitest::Test

  def setup
    @lego_item_left = LegoItem.new('sword', 12)
    @lego_item_right = LegoItem.new('can', 3)
  end

  def test_initialize
    assert_kind_of(LegoItem, @lego_item_left)
    assert_kind_of(LegoItem, @lego_item_right)
  end

  def test_initial_values
    assert_equal('sword',  @lego_item_left.name)
    assert_equal(12,  @lego_item_left.weight)
    assert_equal('can', @lego_item_right.name)
    assert_equal(3, @lego_item_right.weight)
  end

  def test_to_string_outputs_correct_string
    actual =  @lego_item_left.to_s
    expected = "a 12 gram sword"

    assert_equal(expected, actual)
  end

  def test_is_heavy_over_threshold
    actual =  @lego_item_left.is_heavy(10)
    expected = true

    assert_equal(expected, actual)
  end

  def test_is_heavy_under_threshold
    actual =  @lego_item_right.is_heavy(10)
    expected = false

    assert_equal(expected, actual)
  end

end
