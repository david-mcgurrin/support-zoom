require 'minitest/autorun'
require_relative '../practice'

class PracticeTest < MiniTest::Test

  def test_simulate_study

    expected = "Time to study spelling\n  me rite gud\n  me writng is gudder\n  me writing is bettr\n  My writing has improved signifcantly\nIt took 5 sessions to get a proficient average level of 6.0\nStudy over\n"

    assert_output(expected) do
      Practice.simulate_studying("spelling") do |session|

        effectiveness = session
      
        puts "  me rite gud" if effectiveness == 0 
      
        puts "  me writng is gudder" if effectiveness == 1
      
        puts "  me writing is bettr" if effectiveness == 2
      
        if effectiveness  == 3
          puts "  My writing has improved signifcantly"
          effectiveness += 20
        end
      
        effectiveness
      
      end
    end
  end

end