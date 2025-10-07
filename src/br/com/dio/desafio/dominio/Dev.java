package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosIncritos = new HashSet<>();
	private Set<Conteudo> conteudosFinalizados = new LinkedHashSet<>();
	
	
	
	public Dev() {
	}

	public Dev(String nome, Set<Conteudo> conteudosIncritos, Set<Conteudo> conteudosFinalizados) {
		this.nome = nome;
		this.conteudosIncritos = conteudosIncritos;
		this.conteudosFinalizados = conteudosFinalizados;
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosIncritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosFinalizados.add(conteudo.get());
			this.conteudosIncritos.remove(conteudo.get());
		}else {
			System.err.println("Voce nao esta matriculado em nenhum curso");
		}
	};
	
	public double calcularTotalXp() {
		return this.conteudosFinalizados.stream()
		.mapToDouble(conteudo-> conteudo.calcularXp())
		.sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosIncritos() {
		return conteudosIncritos;
	}

	public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
		this.conteudosIncritos = conteudosIncritos;
	}

	public Set<Conteudo> getConteudosFinalizados() {
		return conteudosFinalizados;
	}

	public void setConteudosFinalizados(Set<Conteudo> conteudosFinalizados) {
		this.conteudosFinalizados = conteudosFinalizados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosFinalizados, conteudosIncritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosFinalizados, other.conteudosFinalizados)
				&& Objects.equals(conteudosIncritos, other.conteudosIncritos) && Objects.equals(nome, other.nome);
	};
	
	


}