def find_winner(inputs_array)

  return false if inputs_array.first == inputs_array.last

  if (inputs_array.include? "rock") && (inputs_array.include? "paper")
    winner = "paper"
    loser = "rock"
  elsif (inputs_array.include? "rock") && (inputs_array.include? "scissors")
    winner = "rock"
    loser = "scissors"
  else
    winner = "scissors"
    loser = "paper"
  end

  winning_player = winner == inputs_array.first ? "Player 1" : "Player 2"

  { "winner" => winner, "loser" => loser, "winning_player" => winning_player}

end


def result_ouput(result_hash, overall_winner)

  winner_verbs = {"rock" => "crushes", "paper" => "covers", "scissors" => "cuts"}

  winner = result_hash["winner"]
  loser = result_hash["loser"]
  winning_player = result_hash["winning_player"]

  puts "#{winner.capitalize} #{winner_verbs[winner]} #{loser}"
  puts

  puts "#{winning_player} wins" if overall_winner

end


def find_overall_winner(winners)

  win_count = 0

  counts = Hash.new(0)

  winners.each { |winner| counts[winner] += 1 }

  counts.each { |k, v| win_count = v  if v == 3 }

  return win_count >= 3 ?  true : false

end


# Start of main code
choices = ['rock', 'paper', 'scissors']

winners_array = []

winner_found = false

until winner_found

  puts "Rock Paper Scissors"

  print "Player 1 - Enter your selection: "
  input1 = gets.downcase.chomp

  print "Player 2 - Enter your selection: "
  input2 = gets.downcase.chomp

  if (choices.include? input1) && (choices.include? input2)

    game_result = find_winner([input1, input2])

    if game_result

      winners_array << game_result["winning_player"]

      winner_found = find_overall_winner(winners_array)

      result_ouput(game_result, winner_found)

    else

      puts "Draw!"
      puts "Give it another go"
      puts

    end

  else

    puts "Oi, no cheating! Only Rock, Paper or Scissors allowed."
    puts "Give it another go"
    puts

  end
end
