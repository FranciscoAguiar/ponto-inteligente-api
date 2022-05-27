
package com.faguiar.pontointeligente.api.entities;

import java.io.Serializable;

import java.util.*;
import java.util.Date;



public class Empresa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String razaoSocial;
	private String cnpj;
	private Date dataCriacao;
	private Date dataAtualizacao;
	private List<Funcionario> funcionarios;
	
	 

}
