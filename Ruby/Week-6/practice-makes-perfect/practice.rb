
class Practice

  def self.simulate_studying(subject)
    
    puts "Time to study #{subject}"

    study_complete = false
    
    study_session = 0

    study_satisfaction = []

    until study_complete
      
      effectiveness = yield (study_session) if block_given?

      study_satisfaction << effectiveness

      avg = study_satisfaction.reduce(:+) / study_satisfaction.size.to_f

      study_complete = true if  avg > 3 && study_session > 3

      study_session += 1

    end

    print "It took #{study_session} sessions to get a proficient average level of #{avg.round(1)}"

    puts
    
    puts "Study over"

  end

end
