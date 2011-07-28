package br.com.brasilti.project.reports;

import java.util.List;

import javax.inject.Inject;

import br.com.brasilti.project.entities.Imovel;
import br.com.brasilti.project.entities.Tipo;
import br.com.brasilti.repository.core.Seeker;
import br.com.brasilti.repository.exceptions.RepositoryException;
import br.com.brasilti.repository.propositions.Equals;

public class ReportImoveisPorTipo {

	@Inject
	private Seeker seeker;

	public List<Imovel> gerarRelatorio(Tipo tipo) throws RepositoryException {
		return this.seeker.seekAll(Imovel.class,new Equals("tipo", tipo));
	}

}
