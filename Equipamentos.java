package java_da_massa;

public class Equipamentos {
	private String local;
	private String nome;
	private String codigo;


public Equipamentos(String local, String nome, String codigo) {
	this.local=local;
	this.nome=nome;
	this.codigo=codigo;
}


public String getLocal() {
	return local;
}


public void setLocal(String local) {
	this.local = local;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getCodigo() {
	return codigo;
}


public void setCodigo(String codigo) {
	this.codigo = codigo;
}




}