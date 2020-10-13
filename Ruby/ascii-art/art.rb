print "Please enter the shape size: "

shape_size = gets.chomp.to_i

num_asterisks_per_row = 0

for i in 1..shape_size

  shape_length = shape_size * 2

  for j in 1..shape_length

    if j > shape_size - i && j < shape_size + i

      if shape_size % 2 == 0
        
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
