def product_sort(arr)

  new_arr = arr.map do |x|
    x.split(",")
  end

  newer_arr = new_arr.sort_by do |x|
    [x[1].to_i, x[2].to_i * -1]
  end

  newer_arr.reverse!

  newer_arr.each do |x|
    print x[0]
    puts
  end

  puts 

end

list = ["Selfie Stick,98,29",
  "iPhone Case,90,15",
  "Fire TV Stick,48,49",
  "Wyze Cam,48,25",
  "Water Filter,56,49",
  "Blue Light Blocking Glasses,90,16",
  "Ice Maker,47,119",
  "Video Doorbell,47,199",
  "AA Batteries,64,12",
  "Disinfecting Wipes,37,12",
  "Baseball Cards,73,16",
  "Winter Gloves,32,112",
  "Microphone,44,22",
  "Pet Kennel,5,24",
  "Jenga Classic Game,100,7",
  "Ink Cartridges,88,45",
  "Instant Pot,98,59",
  "Hoze Nozzle,74,26",
  "Gift Card,45,25",
  "Keyboard,82,19"]





product_sort(list)


