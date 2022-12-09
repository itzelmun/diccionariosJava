package Maps;

import java.util.HashMap;
import java.util.Hashtable;

public class diccionarioEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		//-------------------------------------------------
		
		HashMap <Integer, String> mapaNombres = new HashMap <Integer, String>();
		mapaNombres.put(123, null);
		mapaNombres.put(321, "Julio");
		
		
		//System.out.println(mapaNombres.keySet());
		//System.out.println(mapaNombres.values());
		
		//mapaNombres.clear();
		//mapaNombres.remove(123);
		
		//System.out.println(mapaNombres.get(321));
		/*
		if(mapaNombres.containsValue("Itzeel")) {
			System.out.println("Si existe");
		}else {
			System.out.println("No existe");
		} */
		System.out.println(mapaNombres);
		
		//_----------------------------------------------------
	Hashtable diccionario = new Hashtable();
		
		diccionario.put("Usuarios", "Itzel");
		diccionario.put("RedSocial", "Instagram");
		
		String contenido = diccionario.get("RedSocial").toString();
		boolean respuesta = diccionario.containsKey("Usuario");
		
		System.out.println(contenido);
		System.out.println(respuesta);
	}

}
