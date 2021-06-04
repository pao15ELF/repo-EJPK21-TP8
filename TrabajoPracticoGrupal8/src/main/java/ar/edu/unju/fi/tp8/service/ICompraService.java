package ar.edu.unju.fi.tp8.service;

import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.tp8.model.Compra;

public interface ICompraService {
	/**
	 * Agrega un objeto del tipo Compra
	 * @param compra
	 */
	public void agregarCompra(Compra compra);

	/**
	 * Obtiene una lista de objetos de tipo Compra
	 * @return
	 */
	public List<Compra> obtenerListaCompras();
	
	/**
	 * Genera un objeto del tipo Compra
	 * @return
	 */
	public Compra generarCompra();
	
	/**
	 * Eliminar un objeto del tipo Compra por su nro de id
	 * @param id
	 */
	public void eliminarCompra(Long id);
	
	/**
	 * Encuentra un objeto del tipo Compra por su id
	 * @param id
	 * @return
	 */
	public Optional<Compra> buscarPorId(Long id);
	
	/**
	 * Devuelve una lista de productos que coincidan con los parametros enviados
	 * por nombre de producto y/o monto mayor o igual al total de la compra
	 * @param total
	 * @param nombre
	 * @return
	 */
	public List<Compra> buscarPorNombreProductoYTotal(double total, String nombre);
	
	/**
	 * Devuelve una lista de productos que tengan el monto total mayor o igual al parametro
	 * enviado
	 * @param total
	 * @return
	 */
	public List<Compra> buscarPorTotal(double total);
	
}
