
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor

public class Endereco {
	
	 private String cep;
	 private String logradouro;
	 private String complemento;
	 private String bairro;
	 private String localidade;
	 private String uf;

	 
	 
		
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}



	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}



		@Override
	    public String toString() {
	        return "Endereco{" + "\nCEP= " + cep 
	        				   + "\nLogadouro= " + logradouro 
	        				   + "\nComplemento= " + complemento
	        				   + "\nBairro= " + bairro
	        				   + "\nLocalidade= " + localidade
	        				   + "\nUF= " + uf;
	    }
	 
}
