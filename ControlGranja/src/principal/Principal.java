package principal;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dominio.Espacio;
import dominio.Precio;
import modelo.ModeloInterface;

public class Principal {

	private static final int VACA = 10;
	private static final int CERDO = 11;
	private static final int GALLINA = 12;
	private static final int TIEMPO_DE_CICLO = 60000;
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ModeloInterface modelo = (ModeloInterface) context.getBean("modelo");
		while (true) {
			ArrayList<Espacio> listaEspacios = (ArrayList<Espacio>) modelo.consultaEspacios();
			ArrayList<Precio> listaPrecios = (ArrayList<Precio>) modelo.consultaPrecios();
			for (int i = 0; i < listaPrecios.size(); i++) {
				if (listaEspacios.get(i).getRecurso().getId() != 0) {
					if (listaEspacios.get(i).getOcupacion_actual() >= (listaEspacios.get(i).getCapacidad() / 2)) {
						listaPrecios.get(i)
								.setPrecio(
										(int) (Math.random()
												* (listaEspacios.get(i).getRecurso().getPrecioMaximo()
														- listaPrecios.get(i).getPrecio())
												+ listaPrecios.get(i).getPrecio()));
					} else {
						listaPrecios.get(i)
								.setPrecio((int) (Math.random()
										* (listaPrecios.get(i).getPrecio()
												- listaEspacios.get(i).getRecurso().getPrecioMinimo())
										+ listaEspacios.get(i).getRecurso().getPrecioMinimo()));
					}
					modelo.modificacion(listaPrecios.get(i));
				}
			}

			for (Espacio espacio : listaEspacios) {
				if (espacio.getRecurso().getId() == VACA && espacio.getOcupacion_actual() > 0) {
					Espacio dinero = modelo.consultaEspacio(espacio.getId() - 10);
					Espacio abono = modelo.consultaEspacio(espacio.getId() - 5);
					Espacio leche = modelo.consultaEspacio(espacio.getId() - 7);
					Espacio agua = modelo.consultaEspacio(espacio.getId() - 9);
					dinero.setOcupacion_actual(dinero.getOcupacion_actual() - (espacio.getOcupacion_actual() * 80));
					abono.setOcupacion_actual(dinero.getOcupacion_actual() + (espacio.getOcupacion_actual() * 2));
					leche.setOcupacion_actual(dinero.getOcupacion_actual() + (espacio.getOcupacion_actual()));
					agua.setOcupacion_actual(dinero.getOcupacion_actual() - (espacio.getOcupacion_actual() * 10));
					modelo.modificacion(dinero);
					modelo.modificacion(abono);
					modelo.modificacion(leche);
					modelo.modificacion(agua);
				} else if (espacio.getRecurso().getId() == GALLINA && espacio.getOcupacion_actual() > 0) {
					Espacio dinero = modelo.consultaEspacio(espacio.getId() - 12);
					Espacio huevos = modelo.consultaEspacio(espacio.getId() - 8);
					Espacio agua = modelo.consultaEspacio(espacio.getId() - 11);
					dinero.setOcupacion_actual(dinero.getOcupacion_actual() - (espacio.getOcupacion_actual() * 30));
					huevos.setOcupacion_actual(dinero.getOcupacion_actual() + (espacio.getOcupacion_actual()));
					agua.setOcupacion_actual(dinero.getOcupacion_actual() - (espacio.getOcupacion_actual() * 2));
					modelo.modificacion(dinero);
					modelo.modificacion(huevos);
					modelo.modificacion(agua);
				} else if (espacio.getRecurso().getId() == CERDO && espacio.getOcupacion_actual() > 0) {
					Espacio dinero = modelo.consultaEspacio(espacio.getId() - 11);
					Espacio agua = modelo.consultaEspacio(espacio.getId() - 10);
					dinero.setOcupacion_actual(dinero.getOcupacion_actual() - (espacio.getOcupacion_actual() * 200));
					agua.setOcupacion_actual(dinero.getOcupacion_actual() - (espacio.getOcupacion_actual() * 20));
					modelo.modificacion(dinero);
					modelo.modificacion(agua);
				}
				try {Thread.sleep(TIEMPO_DE_CICLO);} catch (Exception e) {}
				
			}
		}

	}
}
