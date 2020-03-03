package br.com.CompassoAlura.CompassoAlura.repositorys;



import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.springframework.stereotype.Repository;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import br.com.CompassoAlura.CompassoAlura.codecs.AlunoCodec;
import br.com.CompassoAlura.CompassoAlura.models.Aluno;
@Repository
public class AlunoRepository {
	
	private MongoClient cliente;
	private MongoDatabase bancoDeDados;
	
	private void criarConexao() {
		Codec<Document> codec = MongoClient.getDefaultCodecRegistry().get(Document.class); 
		AlunoCodec alunoCodec = new AlunoCodec(codec);
		CodecRegistry registro = CodecRegistries.fromRegistries(MongoClient.getDefaultCodecRegistry(),
				CodecRegistries.fromCodecs(alunoCodec));
		
		MongoClientOptions opcoes  = MongoClientOptions.builder().codecRegistry(registro).build();
		
		this.cliente =  new MongoClient("localhost:27017", opcoes);
		this.bancoDeDados  = cliente.getDatabase("test");
		
	}
	
	public void salvar(Aluno aluno) {
			criarConexao();
			
			MongoCollection<Aluno> alunos = this.bancoDeDados.getCollection("alunos",Aluno.class);
			alunos.insertOne(aluno);
			cliente.close();
		}
	
	public List<Aluno> obterTodosAlunos(){
		criarConexao();
		MongoCollection<Aluno> alunos = this.bancoDeDados.getCollection("alunos",Aluno.class);
		MongoCursor<Aluno> resultado = alunos.find().iterator();
		
		List<Aluno> alunosEncontrados = new ArrayList<>();
		while(resultado.hasNext()) {
			Aluno aluno = resultado.next();
			alunosEncontrados.add(aluno);
		}
		cliente.close();
		return alunosEncontrados;
	}
	}
