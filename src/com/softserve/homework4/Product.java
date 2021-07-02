package com.softserve.homework4;

public class Product implements Subject{
	private String name;
	private int price;
	
	public Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String getName() { return name; }
	
	public void setName(String name) { this.name = name; }
	
	@Override
	public int getPrice() { return price; }
	
	public void setPrice(int price) {this.price = price;}
	
	@Override
	public boolean equals (Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) { //getClass - получить указатель на класс объекта
			return false;
		}
		//
		if (hashCode() != obj.hashCode()) {
			return false;
		}
		Product other = null;
		if (obj instanceof Product) {
			other = (Product) obj;
		}
		if ((other == null) || (price != other.price) 
				|| ( (name == null) && (other.name != null) )
				|| ( (name != null) && (other.name == null) ) )
		{
			return false;
		}
		if ( (name == null) && (other.name == null) )
		{
			return true;
		}
		return name.equals(other.name);
	}
		
		@Override
		public int compareTo(Subject other) { // реализуем интерфейс comparable
			return getPrice() - other.getPrice();
		}
		
		@Override
		public String toString() {
			return "\n" + name + ", price is " + price + " "; 
		}
		
		
		//hashcode  взять из лекции
		
}
