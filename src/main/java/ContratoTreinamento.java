
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



@ManagedBean
@ViewScoped
public class ContratoTreinamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String 	razaoSocial;
	private String CNPJ;
	private String cidadeContrato;
	private String metodoPagamento;
	private String modalidadeCurso;
	private Date dataContrato;
	private BigDecimal valorContrato;
	private String[] cursos;
	private ArrayList<ContratoTreinamento> contratosCadastrados = new ArrayList<ContratoTreinamento>();
	
	
	public ContratoTreinamento()
	{
		
	}
	
	public ContratoTreinamento(String razaoSocial,String CNPJ,String cidadeContrato,
			String metodoPagamento, String modalidadeCurso, Date dataContrato,
			BigDecimal valorContrato, String[] cursos)
	{
		
		this.razaoSocial = razaoSocial;
		this.CNPJ = CNPJ;
		this.cidadeContrato = cidadeContrato;
		this.metodoPagamento = metodoPagamento;
		this.modalidadeCurso = modalidadeCurso;
		this.dataContrato = dataContrato;
		this.valorContrato =  valorContrato;
		this.cursos = cursos;
	}
	
	public void cadastrarContrato()
	{
		System.out.println("Cadastrar" + contratosCadastrados.size());
		
		
		contratosCadastrados.add(new ContratoTreinamento(getRazaoSocial()
				, getCNPJ(), getCidadeContrato(), 
				getMetodoPagamento(), getModalidadeCurso(), 
				getDataContrato(),
				getValorContrato(), getCursos()));
	}
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getCidadeContrato() {
		return cidadeContrato;
	}
	public void setCidadeContrato(String cidadeContrato) {
		this.cidadeContrato = cidadeContrato;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	public Date getDataContrato() {
		return dataContrato;
	}
	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}
	public BigDecimal getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(BigDecimal valorContrato) {
		this.valorContrato = valorContrato;
	}
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	public String getModalidadeCurso() {
		return modalidadeCurso;
	}
	public void setModalidadeCurso(String modalidadeCurso) {
		this.modalidadeCurso = modalidadeCurso;
	}

	public ArrayList<ContratoTreinamento> getContratosCadastrados() {
		return contratosCadastrados;
	}
	
	
	

}
