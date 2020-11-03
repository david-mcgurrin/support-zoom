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

  # Test produces error due to incorrect variables in the to_s method
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

class LegoMinifigureTest < Minitest::Test

  def setup
    @lego_hat = LegoHat.new('small', 'blue', 'cap')
    @lego_item_left = LegoItem.new('sword', 15)
    @lego_item_right = LegoItem.new('can', 3)

    @lego_minifigure_name = LegoMinifigure.new('Nick')
    @lego_minifigure_name_hat = LegoMinifigure.new('Hannah',  @lego_hat)
    @lego_minifigure_name_left_item = LegoMinifigure.new('Noel', nil, @lego_item_left)
    @lego_minifigure_name_right_item = LegoMinifigure.new('Mick', nil, nil, @lego_item_right)
    @lego_minifigure_name_hat_left_item = LegoMinifigure.new('Lisa', @lego_hat, @lego_item_left)
    @lego_minifigure_name_hat_right_item = LegoMinifigure.new('Rachel', @lego_hat, nil, @lego_item_right)
    @lego_minifigure_full = LegoMinifigure.new('Frank', @lego_hat, @lego_item_left, @lego_item_right)

    @new_hat = LegoHat.new('large', 'black', 'tophat')
    @new_item_left = LegoItem.new('fishing rod', 7)
    @new_item_right = LegoItem.new('book', 5)

    @lego_minifigure_weak = LegoMinifigure.new('Wes', @new_hat, @new_item_left, @new_item_right)
  end

  def test_initialize
    assert_kind_of(LegoMinifigure, @lego_minifigure_name)
    assert_kind_of(LegoMinifigure, @lego_minifigure_name_hat)
    assert_kind_of(LegoMinifigure, @lego_minifigure_name_hat_left_item)
    assert_kind_of(LegoMinifigure, @lego_minifigure_full)
  end

  def test_initial_values
    assert_equal('Nick',  @lego_minifigure_name.name)
    assert_equal('small',  @lego_minifigure_name_hat.hat.size)
    assert_equal('sword', @lego_minifigure_name_hat_left_item.left_item.name)
    assert_equal('can', @lego_minifigure_full.right_item.name)
  end

  # Test produces error due to incorrect variables in the to_s method
  def test_hat_words_when_wearing_a_hat
    actual = @lego_minifigure_name_hat.hat_words
    expected = ', who is wearing a small blue cap'
  
    assert_equal(expected, actual)
  end

  def test_hat_words_when_not_wearing_a_hat
    actual = @lego_minifigure_name.hat_words
    expected = ''
  
    assert_equal(expected, actual)
  end

  def test_left_item_words_when_wearing_a_hat_and_holding_left_item
    actual = @lego_minifigure_name_hat_left_item.left_item_words
    expected = ' and is holding a 15 gram sword in the left hand'
  
    assert_equal(expected, actual)
  end

  def test_left_item_words_when_holding_left_item
    actual = @lego_minifigure_name_left_item.left_item_words
    expected = ', who is holding a 15 gram sword in the left hand'
  
    assert_equal(expected, actual)
  end

  def test_left_item_words_when_not_holding_left_item
    actual = @lego_minifigure_name.left_item_words
    expected = ''
  
    assert_equal(expected, actual)
  end

  def test_right_item_words_when_wearing_a_hat_and_holding_left_item_and_holding_right_item
    actual = @lego_minifigure_full.right_item_words
    expected = ' and a 3 gram can in the right hand'
  
    assert_equal(expected, actual)
  end

  # Test fails due to incorrect spacing
  def test_right_item_words_when_wearing_a_hat_and_holding_right_item
    actual = @lego_minifigure_name_hat_right_item.right_item_words
    expected = ' and is holding a 3 gram can in the right hand'
  
    assert_equal(expected, actual)
  end

  # Test fails due to incorrect spacing
  def test_right_item_words_when_holding_right_item
    actual =@lego_minifigure_name_right_item.right_item_words
    expected = ', who is holding a 3 gram can in the right hand'
  
    assert_equal(expected, actual)
  end

  def test_right_item_words_when_not_holding_right_item
    actual = @lego_minifigure_name.right_item_words
    expected = ''
  
    assert_equal(expected, actual)
  end

  # Test produces error due to incorrect variables in the to_s method
  def test_to_string_outputs_correct_string
    actual =  @lego_minifigure_full.to_s
    expected = "A Lego minifigure named Frank, who is wearing a small blue cap and is holding a 15 gram sword and is holding a 3 gram bee in the right hand"

    assert_equal(expected, actual)
  end

  def test_hat_is_stylish
    assert(@lego_minifigure_name_hat.is_stylish?, true)
  end

  def test_hat_is_not_stylish
    
    @lego_minifigure_name_hat.wear_hat(@new_hat)

    assert_equal(false, @lego_minifigure_name_hat.is_stylish?)
  end

  def test_right_item_has_moved_to_left_hand
    @lego_minifigure_full.swap_hands

    actual = @lego_minifigure_full.left_item.name
    expected = 'can'

    assert_equal(expected, actual)
  end

  def test_left_item_has_moved_to_right_hand
    @lego_minifigure_full.swap_hands

    actual = @lego_minifigure_full.right_item.name
    expected = 'sword'

    assert_equal(expected, actual)
  end

  def test_adding_a_new_hat
    @lego_minifigure_name_hat.wear_hat(@new_hat)

    actual = @lego_minifigure_name_hat.hat.style
    expected = 'tophat'

    assert_equal(expected, actual)
  end

  def test_adding_a_new_item_to_left_hand
    @lego_minifigure_full.place_in_left_hand(@new_item_left)

    actual = @lego_minifigure_full.left_item.name
    expected = 'fishing rod'

    assert_equal(expected, actual)
  end

  def test_adding_a_new_item_to_right_hand
    @lego_minifigure_full.place_in_right_hand(@new_item_right)

    actual = @lego_minifigure_full.right_item.name
    expected = 'book'

    assert_equal(expected, actual)
  end

  def test_is_strong_returns_true
    assert(@lego_minifigure_full.is_strong?)
  end

  def test_is_strong_returns_false
    assert_equal(false, @lego_minifigure_weak.is_strong?)
  end

end
