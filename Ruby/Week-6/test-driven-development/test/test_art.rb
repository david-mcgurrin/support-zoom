require 'minitest/autorun'
require_relative '../art.rb'

class AsciiArtTest < Minitest::Test

  def setup
    @art = AsciiArt.new
  end

  def test_zero_input
    actual = @art.draw(0)
    expected = ""

    assert_equal(expected, actual)
  end

  def test_single_input
    actual = @art.draw(1)
    expected = "* \n"

    assert_equal(expected, actual)
  end

  def test_multiple_rows
    actual = @art.draw(2)
    expected = " * \n* * \n * \n"

    assert_equal(expected, actual)
  end

  def test_larger_number
    actual = @art.draw(5)
    expected = "    * \n   * * \n  * * * \n * * * * \n* * * * * \n * * * * \n  * * * \n   * * \n    * \n"

    assert_equal(expected, actual)
  end

  def test_incorrect_input
    assert_raises(ArgumentError) { @art.draw("five") }
  end

end
