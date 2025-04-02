package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null)
			conta.visualizar();
		else
			System.out.println("\nA Conta número: " + numero + " não foi detectada!");
		
		}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA Conta número: " + conta.getNumero() + " Maravilha!!.... Concluída com sucesso.");
		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscarConta = buscarNaCollection(conta.getNumero());
		
		if (buscarConta != null) {
			listaContas.set(listaContas.indexOf(buscarConta), conta);
			System.out.println("\nA conta número: " + conta.getNumero() + " foi atualizada - Tudo Certo por aqui!!");
		}else 
			System.out.println("\nA conta número: " + conta.getNumero() + " não foi detectada!");
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (listaContas.remove(conta) == true)
				System.out.println("\nA conta número: " + numero + " foi atualizada - Tudo Certo por aqui!!");
		}else
			System.out.println("\nA conta número: " + numero + " não foi detectada!");
	}
			

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			
			if(conta.sacar(valor) == true)
				System.out.println("\nA conta número: " + numero + " foi atualizada - Tudo Certo por aqui!!");
			
		}else
			System.out.println("\nA conta número: " + numero + " não foi detectada!");
	}
		

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
		conta.deposito(valor);
		System.out.println("\nO depósito na conta número: " + numero + " foi atualizada - Tudo Certo por aqui!!");
	} else
		System.out.println("\nA conta número: " + numero + " não foi detectada! ou esta em outro Tipo de Conta.");
	}
		

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.deposito(valor);
				System.out.println("\nA transferência foi concluída com sucesso.");
			}
		}else
			System.out.println("\nA conta de Origem e/ou Destino não foram detectada!!");
	}

	public int gerarNumero() {
		return ++ numero;
		
		}
	
		public Conta buscarNaCollection(int numero) {
			for (var conta : listaContas) {
				if (conta.getNumero() == numero) {
					return conta;
					
					
				}
			}
			return null;
		}
	
	}
	


