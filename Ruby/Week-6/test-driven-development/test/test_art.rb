require 'minitest/autorun'
require_relative '../art.rb'

class AsciiArtTest < Minitest::Test

  def setup
    @art = AsciiArt.new
  end

end
