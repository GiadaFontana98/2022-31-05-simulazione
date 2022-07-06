package it.polito.tdp.nyc.model;

public class CityDistance {
	
	private String nome ;
	private Double distanza ;
	
	public CityDistance(String nome, Double distanza) {
		super();
		this.nome = nome;
		this.distanza = distanza;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getDistanza() {
		return distanza;
	}
	public void setDistanza(Double distanza) {
		this.distanza = distanza;
	}

	@Override
	public String toString() {
		return "CityDistance [nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((distanza == null) ? 0 : distanza.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityDistance other = (CityDistance) obj;
		if (distanza == null) {
			if (other.distanza != null)
				return false;
		} else if (!distanza.equals(other.distanza))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
