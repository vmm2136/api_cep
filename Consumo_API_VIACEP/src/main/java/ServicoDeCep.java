import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.management.RuntimeErrorException;

import com.google.gson.Gson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServicoDeCep {
	
	static String webService = "https://viacep.com.br/ws/";
	static int success = 200;
	
	public static Endereco buscaEnderecoPelo(String cep) throws Exception{
			
	String urlParaChamada = webService + cep + "/json";
	
	try {
		URL url = new URL (urlParaChamada);
		HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
		
		if(conexao.getResponseCode() != success) {
			throw new RuntimeErrorException(null, "HTTP error code : " + conexao.getResponseCode());
		}
		
		
		BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
		String jsonEmString = Util.converteJsonEmString(resposta);
		
		Gson gson = new Gson();
		Endereco endereco = gson.fromJson(jsonEmString, Endereco.class);
		
		return endereco;
		
		}catch (Exception e){
			throw new Exception("Erro: " + e);
		}
	}
}
