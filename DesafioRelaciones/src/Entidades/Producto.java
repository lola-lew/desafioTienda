package Entidades;

public class Producto {
	private int idProduct;
	private String nombre;
	private int precio;
	private int stockProducto;
	
	public Producto() {
		
	}
	
	public Producto(int idProduct, String nombre, int precio, int stockProducto) {
		super();
		this.idProduct = idProduct;
		this.nombre = nombre;
		this.precio = precio;
		this.stockProducto = stockProducto;
	}

	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	public int getStockProducto() {
		return stockProducto;
	}

	public void setStockProducto(int stockProducto) {
		this.stockProducto = stockProducto;
	}

	@Override
	public String toString() {
		return "Producto [idProduct=" + idProduct + ", nombre=" + nombre + ", precio=" + precio + ", stockProducto="
				+ stockProducto + "]";
	}

	
	
	

}
