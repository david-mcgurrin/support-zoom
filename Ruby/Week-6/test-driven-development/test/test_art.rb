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

end
