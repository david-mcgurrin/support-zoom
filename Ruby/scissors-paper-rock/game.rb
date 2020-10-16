choices = ['rock', 'paper', 'scissors']
input_values = {"rock" => 1, "paper" => 2, "scissors" => 3}
winner_verbs = {"rock" => "crushes", "paper" => "covers", "scissors" => "cuts"}

puts "Rock Paper Scissors "
print "Player 1 - Enter your selection: "
input1 = gets.downcase.chomp

print "Player 1 - Enter your selection: "
input2 = gets.downcase.chomp

if (choices.include? input1) && (choices.include? input2)

  value1 = input_values[input1]
  value2 = input_values[input2]

  winner1 = false
  winner2 = false

  case value1
  when 1
    if value2 == 3
      winner1 = true
    elsif value2 == 2
      winner2 = true
    end
  when 2
    if value2 == 1
      winner1 = true
    elsif value2 == 3
      winner2 = true
    end
  when 3
    if value2 == 2
      winner1 = true
    elsif value2 == 1
      winner2 = true
    end
  end

  if winner1
    puts "#{input1.capitalize} #{winner_verbs[input1]} #{input2}"
  elsif winner2
    puts "#{input2.capitalize} #{winner_verbs[input2]} #{input1}"
  else
    puts "Draw!"
  end
  
else

  puts "Oi, no cheating! Only Rock, Paper or Scissors allowed."

end