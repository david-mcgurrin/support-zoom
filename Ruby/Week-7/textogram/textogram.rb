class Textogram

  attr_accessor :sentence, :case_sensitive, :allow_special_characters, :allow_spaces,  :character_count_hash, :word_count_hash, :output_string

  def initialize(sentence, case_sensitive = true, allow_special_characters = true, allow_spaces = true)
    @sentence = sentence
    @sentence.downcase! unless case_sensitive
    @sentence.gsub!(/[^0-9A-Za-z\s]/, '') unless allow_special_characters
    @allow_spaces = allow_spaces
    @character_count_hash = {}
    @word_count_hash = {}
    @output_string = ""
  end

  def character_count
    @sentence.split("").each do |character|
      next if character == " " unless @allow_spaces
      @character_count_hash[character] ? @character_count_hash[character] += 1 : @character_count_hash[character] = 1
    end

    @character_count_hash = Hash[@character_count_hash.sort]
  end

  def word_count
    @sentence.split(" ").each do |word|
      next if word == " " unless @allow_spaces
      @word_count_hash[word] ? @word_count_hash[word] += 1 : @word_count_hash[word] = 1
    end

  end

  def to_s
    output_hash = @character_count_hash.empty? ? @word_count_hash : @character_count_hash

    output_hash.each { |k, v| @output_string += "#{k} " + "*" * v + "\n" }

    @output_string
  end

end

textogram = Textogram.new("Hello world!", true, true, true)

textogram.character_count

puts "Textogram 1 - Basic example:"
puts textogram.to_s
puts

new_textogram = Textogram.new("", true, true, true)

new_textogram.character_count

puts "Textogram 2 - Nothing example:"
puts new_textogram.to_s # outputs nothing
puts

longer_sentence = Textogram.new("Hello hello; goodbye. The end!!", false, false, false)

longer_sentence.character_count

puts "Textogram 3 - Longer sentence example:"
puts longer_sentence.to_s
puts

longer_sentence = Textogram.new("Hello hello; goodbye. The end!!", false, false, false)

longer_sentence.word_count

puts "Textogram 4 - Word count exmaple"
puts longer_sentence.to_s
puts

# The first 5 pages of Book I of Homer's Iliad
input = File.read("iliad.txt").strip

iliad_textogram = Textogram.new(input, true, false, false)

iliad_textogram.word_count

puts "Textogram 5 - Gutenburg book example:"
puts iliad_textogram.to_s
puts
