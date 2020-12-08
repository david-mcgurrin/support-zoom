class ProductListing

  def initialize(file)
    @file = file
    @products = []
  end

  def get_products
    File.open(@file, 'r').each do |row|
      row_items = row.split(",")
      @products << { id:  row_items[0].to_i, name: row_items[1].downcase  }
    end
    
    @products
  end

end

class SearchEngine

  def initialize(products)
    @products = products
    @inverted_index = {}
    @matches = []
  end


  def find(search_terms, operator = 'or')
    get_matches(search_terms)

    case operator
    when 'and'
      duplicates = list_duplicates(@matches.flatten)
      loop_items(duplicates)

    when 'or'
      @matches.each do |match|
        loop_items(match)
      end
    end

  end


  private

  def get_matches(search_terms)
    @inverted_index = inverted_index
    @search_terms = search_terms.split(" ")

    @search_terms.each { |i| @matches << @inverted_index[i] }

    @matches
  end

  def inverted_index
    @products.each do |product|
      product[:name].split.each do |token|
        @inverted_index[token] ||= []
        @inverted_index[token] << product[:id]
      end
    end
    @inverted_index
  end

  def list_duplicates(array)
    duplicates = array.select { |e| array.count(e) > 1 }
    duplicates.uniq
  end

  def loop_items(items)
    items.each do |item|
      puts @products[item][:name]
    end
  end

end


products = ProductListing.new('products_small.csv').get_products
search_engine = SearchEngine.new(products)

# search_engine.find('keyboard')

# search_engine.find('keyboard', 'or')

search_engine.find('steel keyboard', 'and')
