def accelerate
  puts "Stepping on the gas"
  puts "Speeding up"
end

def sound_horn
  puts "Pressing the horn button"
  puts "Beep beep!"
end

def use_headlights(brightness = "low-beam")
  puts "Turning on #{brightness} headlights"
  puts "Watch out for deer!"
end

def mileage(miles_driven, gas_used)
  if gas_used == 0
    return 0.0
  end
  miles_driven/gas_used
end

# Call the vehicle methods
sound_horn
accelerate
use_headlights
use_headlights("hi-beam")

# Call the return method
puts
puts mileage(100, 10)
puts mileage(0, 0)