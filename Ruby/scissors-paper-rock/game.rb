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

  return "Draw" if winner == nil

  winning_player = winner == input1 ? "Player 1" : "Player 2"

  { "winner" => winner, "loser" => loser, "winning_player" => winning_player}

end

def result_ouput(result, wins)

  winner_verbs = {"rock" => "crushes", "paper" => "covers", "scissors" => "cuts"}

  winner = result["winner"]
  loser = result["loser"]
  winning_player = result["winning_player"]

  puts "#{winner.capitalize} #{winner_verbs[winner]} #{loser}"
  puts
  
  if winner_count(winning_player, wins).include? 3
    puts "#{winning_player} wins"
    true
  end

end

def winner_count(winning_player, wins)

  if winning_player == "Player 1"
    wins[0] += 1
  elsif winning_player == "Player 2"
    wins[1] += 1
  end

  wins
end

choices = ['rock', 'paper', 'scissors']

winner_found = false

wins = [0,0]

until winner_found
  puts "Rock Paper Scissors"

  print "Player 1 - Enter your selection: "
  input1 = gets.downcase.chomp

  print "Player 2 - Enter your selection: "
  input2 = gets.downcase.chomp

  if (choices.include? input1) && (choices.include? input2)

    result = get_winner(input1, input2)

    if result["winner"]
      winner_found = result_ouput(result, wins)
    else
      puts "Draw"
      puts "Give it another go"
      puts
    end

  else

    puts "Oi, no cheating! Only Rock, Paper or Scissors allowed."
    puts "Give it another go"
    puts

  end
end
