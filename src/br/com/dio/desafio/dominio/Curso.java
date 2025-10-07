package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	
    private int carga_horaria;

    public Curso() {
    }
    public Curso(String titulo, String descricao, int carga_horaria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.carga_horaria = carga_horaria;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", carga_horaria=" + carga_horaria +
                '}';
    }
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 10;
	}

}
