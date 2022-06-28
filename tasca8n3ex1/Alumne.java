package tasca8n3ex1;

public class Alumne {

	private String nom;
	private String curs;
	private int edat;
	private int nota;

	public Alumne(String nom, String curs, int edat, int nota) {
		super();
		this.nom = nom;
		this.curs = curs;
		this.edat = edat;
		this.nota = nota;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCurs() {
		return curs;
	}

	public void setCurs(String curs) {
		this.curs = curs;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumne [nom=" + nom + ", curs=" + curs + ", edat=" + edat + ", nota=" + nota + "]";
	}

}
