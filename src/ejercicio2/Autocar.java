package ejercicio2;

import java.util.Objects;

public class Autocar {
	private java.lang.String Matricula;
	private String Marca;
	private String Modelo;
	private String Kilometros;
	private String Num_plazas;
	
	
	public Autocar() {
		super();
		this.Matricula = "";
		this.Marca = "";
		this.Modelo = "";
		this.Kilometros = "";
		this.Num_plazas = "";
	}
	
	public Autocar(String matricula, String marca, String modelo, String kilometros, String num_plazas) {
		super();		
		this.Matricula = matricula;
		this.Marca = marca;
		this.Modelo = modelo;
		this.Kilometros = kilometros;
		this.Num_plazas = num_plazas;
	}

	public java.lang.String getMatricula() {
		return Matricula;
	}

	public void setMatricula(java.lang.String matricula) {
		Matricula = matricula;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getKilometros() {
		return Kilometros;
	}

	public void setKilometros(String kilometros) {
		Kilometros = kilometros;
	}

	public String getNum_plazas() {
		return Num_plazas;
	}

	public void setNum_plazas(String num_plazas) {
		Num_plazas = num_plazas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Kilometros, Marca, Matricula, Modelo, Num_plazas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autocar other = (Autocar) obj;
		return Objects.equals(Kilometros, other.Kilometros) && Objects.equals(Marca, other.Marca)
				&& Objects.equals(Matricula, other.Matricula) && Objects.equals(Modelo, other.Modelo)
				&& Objects.equals(Num_plazas, other.Num_plazas);
	}

	@Override
	public String toString() {
		return "Autocar [Matricula=" + Matricula + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Kilometros="
				+ Kilometros + ", Num_plazas=" + Num_plazas + "]";
	}
	
	

}
