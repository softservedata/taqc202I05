package com.softserve.example_hw04;

public class Product implements Subject {
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        //
        if (hashCode() != obj.hashCode()) {
            return false;
        }
        //
        Product other = null;
        if (obj instanceof Product) {
            other = (Product) obj;
        }
        if ( (other == null) || (price != other.price) 
                || ( (name == null) && (other.name != null) )
                || ( (name != null) && (other.name == null) ) ) {
            return false;
        }
        if ( (name == null) && (other.name == null) ) {
            return true;
        }
        return name.equals(other.name);
	}

	@Override
	public int compareTo(Subject other) {
		return getPrice() - other.getPrice();
	}
	
	@Override
	public String toString() {
		return "Product [ name=" + name 
				+ ", price=" + price 
				+ " ]";
	}

}
