require 'minitest/autorun'
require_relative '../passphrases'

class PassphraseCheckerTest < Minitest::Test

  def test_sorted_words
    expected = ["aa", "bb", "cc", "dd"]
    assert_equal(expected, PassphraseChecker.sorted_words("aa bb cc dd"))
  end

  def test_no_duplicate_returns_true
    assert(PassphraseChecker.valid?("aa bb cc dd"))
  end

  def test_duplicate_returns_false
    refute(PassphraseChecker.valid?("aa bb cc dd aa"))
  end

  def test_number_of_different_number_of_same_characters_in_word
    assert(PassphraseChecker.valid?("aa bb cc aaa"))
  end

  def test_case_sensitivity
    assert(PassphraseChecker.valid?("AA bb cc dd aa"))
  end

  def test_uppercase_duplicate_returns_false
    refute (PassphraseChecker.valid?("AA bb cc dd AA"))
  end

  def test_num_valid_returns_correct_amount
    expected = 3
    actual = PassphraseChecker.num_valid(["aa bb", "bb cc", "cc dd"])
  end

end

class AnagramPassphraseCheckerTest < Minitest::Test

  def test_sorted_anagram_words
    expected = ["ab", "ab", "cd", "cd"]
    assert_equal(expected, AnagramPassphraseChecker.sorted_words("ab ba cd dc"))
  end

  def test_no_duplicate_returns_true
    assert(AnagramPassphraseChecker.valid?("aa bb cc dd"))
  end

  def test_duplicate_returns_false
    refute(AnagramPassphraseChecker.valid?("ab ba cc dd"))
  end

end
