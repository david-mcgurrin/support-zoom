require 'minitest/autorun'
require_relative '../grade_book'

class GradeBookTest < Minitest::Test

  def setup
    @grade_book = GradeBook.new
    @grade_book.add_grade("christine", 77)
  end

  def test_grade_book_is_not_empty
    assert(@grade_book != nil)
  end

  def test_grade_book_contains_a_hash
    assert(@grade_book.grades.is_a? Hash)
  end

  def test_grade_is_in_grade_book
    actual = [@grade_book.grades.first].to_h
    expected = {:christine=>77.0}

    assert_equal(expected, actual)
  end

  def test_get_grade_method
    actual = @grade_book.get_grade("christine")
    expected = 77.0

    assert_equal(expected, actual)
  end
  
  def test_letter_grades_method
    actual = @grade_book.letter_grades
    expected = {:christine=>"B"}

    assert_equal(expected, actual)
  end

  def test_letter_grade_method
    assert_raises(NoMethodError) { @grade_book.letter_grade("christine") }
  end

  def test_converting_number_to_grade
    actual = 78.5.to_grade
    expected = "B"

    assert_equal(expected, actual)
  end

end
