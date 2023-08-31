package Entidades;

import java.util.ArrayList;

public class Tienda {
	
	private int id;
	private ArrayList<Producto> listaProductos;
	private String direccion;
	private String representante;

	
	public Tienda() {
		listaProductos = new ArrayList<>();
	}


	public Tienda(int id, String direccion, String representante) {
		super();
		this.id = id;
		// this.listaProductos = listaProductos;
		this.direccion = direccion;
		this.representante = representante;
		listaProductos = new ArrayList<>();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getRepresentante() {
		return representante;
	}


	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public void agregarProducto(Producto producto) {
		this.listaProductos.add(producto);
	  }
	

	@Override
	public String toString() {
		return "Tienda [id=" + id + ", listaProductos=" + listaProductos + ", direccion=" + direccion
				+ ", representante=" + representante + "]";
	}
	
	
	
	

}
