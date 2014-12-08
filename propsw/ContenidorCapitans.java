/*
 * @Author: Marcos P�rez Rubio
 * Grup 44 - 9.1
 */

package propsw;

import java.util.HashMap;


public class ContenidorCapitans {
	//HashMap que conte els capitans
	private static HashMap<String, Capita> contCap ;
	

	/**
	 * Comprova si existeix un capita amb l'id del parametre
	 * @param idCapita Id del capita a consultar
	 * @return true si existeix el capit�, false altrament
	 */
	private boolean checkCapita(String idCapita){
		if (this.contCap.containsKey(idCapita)) return true;
		else return false;
	}
	
	/**
	 * Classe creadora. Inicialitza el contenidor de capitans
	 */
	public ContenidorCapitans(){
		this.contCap = new HashMap<String,Capita>();
	}
	
	/**
	 * Constructor que no inicialitza el contenidor.
	 * @param a sense �s.
	 */
	public ContenidorCapitans(boolean a){
		
	}
	
	/**
	 * Afegeix un capita al contenidor
	 * @param capita Capita a afegir al contenidor
	 * @return true despr�s d'afegir el capita
	 */
	public boolean addCapita(Capita capita) {
		this.contCap.put(capita.getId(),capita);
		return true;
	}

	/**
	 * Esborra un capita del contenidor
	 * @param idCapita Id del capita a esborrar
	 * @return true si s'ha esborrat el capita, false altrament
	 */
	public boolean deleteCapita(String idCapita) {
		if (checkCapita(idCapita)) {
			this.contCap.remove(idCapita);
			return true;
		}
		else return false;
	}

	/**
	 * Consulta el capita amb idCapita
	 * @param idCapita Id del capita a consultar
	 * @return Retorna el capita amb idCapita
	 */
	public Capita getCapita(String idCapita) {
		if (checkCapita(idCapita)){
			Capita c = contCap.get(idCapita);
			return c;
		}
		else return null;
	}
	
	/**
	 * M�tode per accedir al contenidor.
	 * @return contenidor de capitans.
	 */
	public HashMap<String,Capita> getHashContenidor(){
		return contCap;
	}
	
	
}