print "Please enter a number: "

number_input = gets.chomp.to_i

num_asterisks_per_row = 0

for i in 1..number_input

  if number_input % 2 == 1
    next if i == number_input
  end

  shape_length = number_input * 2

  for j in 1..shape_length

    if j > number_input - i && j < number_input + i

      if number_input % 2 == 0
        
        if i % 2 == 1
          if j % 2 == 0
            print "*"
          else
            print " "
          end
        end
  
        if i % 2 == 0
          if j % 2 == 1
            print "*"
          else
            print " "
          end
        end

      else
        
        if i % 2 == 0
          if j % 2 == 0
            print "*"
          else
            print " "
          end
        end
  
        if i % 2 == 1
          if j % 2 == 1
            print "*"
          else
            print " "
          end
        end

      end

    else
      print " "
    end
    
  end

  puts

end

for i in 1..number_input

  shape_length = number_input * 2

  if number_input % 2 == 0
    shape_length -= 1
    next if i == number_input
  end

  for j in 1..shape_length

    if j >= i && j <= shape_length - i + 1

      if number_input % 2 == 0
        
        if i % 2 == 1
          if j % 2 == 0
            print "*"
          else
            print " "
          end
        end
  
        if i % 2 == 0
          if j % 2 == 1
            print "*"
          else
            print " "
          end
        end

      else
        
        if i % 2 == 0
          if j % 2 == 0
            print "*"
          else
            print " "
          end
        end
  
        if i % 2 == 1
          if j % 2 == 1
            print "*"
          else
            print " "
          end
        end

      end

    else
      print " "
    end
    
  end

  puts

end
