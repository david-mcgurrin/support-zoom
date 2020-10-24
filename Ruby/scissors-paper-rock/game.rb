def get_winner(input1, input2)

  input_values = {"rock" => 1, "paper" => 2, "scissors" => 3}

  value1 = input_values[input1]
  value2 = input_values[input2]

  case value1
  when 1
    if value2 == 3
      winner = input1
      loser = input2
    elsif value2 == 2
      winner = input2
      loser = input1
    end
  when 2
    if value2 == 1
      winner = input1
      loser = input2
    elsif value2 == 3
      winner = input2
      loser = input1
    end
  when 3
    if value2 == 2
      winner = input1
      loser = input2
    elsif value2 == 1
      winner = input2
      loser = input1
    end
  end

  [winner, loser]

end

def result_ouput(result)

  winner_verbs = {"rock" => "crushes", "paper" => "covers", "scissors" => "cuts"}

  puts "#{result.first.capitalize} #{winner_verbs[result.first]} #{result.last}"

end

choices = ['rock', 'paper', 'scissors']

puts "Rock Paper Scissors"

print "Player 1 - Enter your selection: "
input1 = gets.downcase.chomp

print "Player 1 - Enter your selection: "
input2 = gets.downcase.chomp

if (choices.include? input1) && (choices.include? input2)

  result = get_winner(input1, input2)

  result_ouput(result)
  
else

  puts "Oi, no cheating! Only Rock, Paper or Scissors allowed."

end
