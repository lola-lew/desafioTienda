package MainPaquete;

import Servicio.ServicioTienda;

public class AppTiendas {
	
	public static void main(String[] args) {
		
		ServicioTienda st = new ServicioTienda();
		
		st.crearTienda();
		st.seleccionarTiendaPorId();
		st.mostrarTienda();
		st.crearProducto();
		// st.mostrarProductos(null);
		st.mostrarTiendas();
		
		//st.modificarProducto();
		
		
		
	}
	

}
