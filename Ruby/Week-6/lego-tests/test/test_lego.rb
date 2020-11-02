require 'minitest/autorun'

require_relative '../lego'

class LegoHatTest < Minitest::Test

  def setup
    @lego_hat = LegoHat.new('small', 'blue', 'cap')
  end

  def test_initialize
    assert_kind_of(LegoHat, @lego_hat)
  end

  def test_initialize_values
    assert_equal('small', @lego_hat.size)
    assert_equal('blue', @lego_hat.colour)
    assert_equal('cap', @lego_hat.style)
  end

  def test_to_string
    actual =  @lego_hat.to_s
    expected = "a small blue cap"

    assert_equal(expected, actual)
  end

end
