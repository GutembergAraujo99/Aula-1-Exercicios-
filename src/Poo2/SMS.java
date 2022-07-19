package Poo2;

public class SMS {
	private Contato remetente;
	private Contato destinatario;
	
	public SMS(String mensagem,  Contato remetente, Contato destinatario) {
		super();
		this.remetente = remetente;
		this.destinatario = destinatario;
	}

	public Contato getRemetente() {
		return remetente;
	}

	public void setRemetente(Contato remetente) {
		this.remetente = remetente;
	}

	public Contato getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Contato destinatario) {
		this.destinatario = destinatario;
	}
	
	public String envioSMS() {
		return this.remetente.getNome() + ":\n" + this.getMensagem() + "\n" + this.destinatario.getTelefone();
	}

	private String getMensagem() {
		// TODO Auto-generated method stub
		return null;
	}

}


