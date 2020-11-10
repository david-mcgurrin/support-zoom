class Textogram

  attr_accessor :sentence, :case_sensitive, :allow_special_characters, :allow_spaces,  :character_count_hash, :output_string

  def initialize(sentence, case_sensitive = true, allow_special_characters = true, allow_spaces = true)
    @sentence = sentence
    @sentence.downcase! unless case_sensitive
    @sentence.gsub!(/[^0-9A-Za-z\s]/, '') unless allow_special_characters
    @allow_spaces = allow_spaces
    @character_count_hash = {}
    @output_string = ""
  end

  def character_count
    @sentence.split("").each do |character|
      next if character == " " unless @allow_spaces
      @character_count_hash[character] ? @character_count_hash[character] += 1 : @character_count_hash[character] = 1
    end

    @character_count_hash = Hash[@character_count_hash.sort]
  end


  def to_s
    @character_count_hash.each { |k, v| @output_string += "#{k} " + "*" * v + "\n" }

    @output_string
  end

end


textogram = Textogram.new("Hello world!", true, true, true)

textogram.character_count

puts "Textogram 1:"
puts textogram.to_s
puts 

new_textogram = Textogram.new("", true, true, true)

new_textogram.character_count

puts "Textogram 2:"
puts new_textogram.to_s # outputs nothing
puts 

longer_sentence = Textogram.new("Hello hello; goodbye. The end!!", false, false, false)

longer_sentence.character_count

puts "Textogram 3:"
puts longer_sentence.to_s
puts
