choices = ['rock', 'paper', 'scissors']
input_values = {"rock" => 1, "paper" => 2, "scissors" => 3}
winner_verbs = {"rock" => "crushes", "paper" => "covers", "scissors" => "cuts"}
winner_found = false
player1_wins = 0
player2_wins = 0

until winner_found
  puts "Rock Paper Scissors "
  print "Player 1 - Enter your selection: "
  input1 = gets.downcase.chomp

  print "Player 2 - Enter your selection: "
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
      puts
      player1_wins += 1
    elsif winner2
      puts "#{input2.capitalize} #{winner_verbs[input2]} #{input1}"
      puts
      player2_wins += 1
    else
      puts "Draw!"
      puts "Give it another go"
      puts
    end

    if player1_wins == 3
      puts "Player 1 wins"
      winner_found = true
    end

    if player2_wins == 3
      puts "Player 2 wins"
      winner_found = true
    end
    
  else

    puts "Oi, no cheating! Only Rock, Paper or Scissors allowed."
    puts "Give it another go"
    puts
  end
end