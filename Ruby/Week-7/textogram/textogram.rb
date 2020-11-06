class Textogram

  attr_accessor :sentence, :char_hash

  def initialize(sentence)
    @sentence = sentence
  end

  def character_count
    @char_hash = {}
   
    @sentence.split("").each do |c|
      next if c == " "
      @char_hash[c] ? @char_hash[c] += 1 : @char_hash[c] = 1
    end

    @char_hash = Hash[@char_hash.sort]
  end


  def to_s
    output_string = ""

    @char_hash.each { |k, v| output_string += "#{k} " + "*" * v + "\n" }

    output_string
  end

end


textogram = Textogram.new("Hello world!")

textogram.character_count

puts textogram.to_s