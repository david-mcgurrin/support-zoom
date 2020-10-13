print "Please enter the shape size: "

shape_size = gets.chomp.to_i

num_asterisks_per_row = 1

for i in 1..shape_size

  for j in 1..shape_size

    if j > shape_size - num_asterisks_per_row
      print "*"
    else
      print " "
    end
    
  end

  num_asterisks_per_row += 1

  puts

end
