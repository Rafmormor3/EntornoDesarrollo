package testCadena;

public class Cadena {

	private String cadena;

	
	public Cadena(String cadena) {
		super();
		this.cadena = cadena;
	}
	
	public String toMayuscula() {
		return this.cadena!=null? this.cadena.toUpperCase() : null;
	}
	
	public String toMinuscula() {
		return this.cadena!=null? this.cadena.toLowerCase() : null;
	}
	
	public boolean estaEnMayuscula() {
		boolean res=false;
		if(this.cadena!=null && !this.cadena.isEmpty() && this.cadena.equals(this.cadena.toUpperCase())){
			res=true;
		}
		return res;
	}
	
	public boolean estaEnMinuscula() {
		boolean res=false;
		if(this.cadena!=null && !this.cadena.isEmpty() && this.cadena.equals(this.cadena.toLowerCase())){
			res=true;
		}
		return res;
	}
	
	public boolean capicua() {
		boolean res=true;
		String reves="";
		
		if(this.cadena!=null && !this.cadena.isEmpty()) {
			
			for(int i=0;i<this.cadena.length() && res==true;i++) {
				
				if(!Character.isDigit(this.cadena.charAt(i))) {
					res=false;
				}else {
					reves=this.cadena.charAt(i)+reves;
				}
			}
			res= res==true && reves.equals(this.cadena)? true : false;
		}else {
			res=false;
		}
		return res;
	}
	
	public boolean palindromo() {
		boolean res=true;
		String reves="";
		
		if(this.cadena!=null && !this.cadena.isEmpty()) {
			
			for(int i=0;i<this.cadena.length() && res==true;i++) {
				
				if(Character.isDigit(this.cadena.charAt(i))) {
					res=false;
				}else {
					reves=this.cadena.charAt(i)+reves;
				}
			}
			res= res==true && reves.equals(this.cadena)? true : false;
		}else {
			res=false;
		}
		return res;
	}
	
	public boolean esDecimal() {
		boolean res = false;
		
		if(this.cadena!=null && !this.cadena.isEmpty() 
				&& (this.cadena.charAt(0)!='.' || this.cadena.charAt(0)!=',') 
				&& (this.cadena.charAt(this.cadena.length()-1)!='.' || this.cadena.charAt(this.cadena.length()-1)!=',')) {
			
			int cont=0;
			for(int i=1; i<this.cadena.length()-1;i++) {
				if(Character.isDigit(this.cadena.charAt(i-1)) && (this.cadena.charAt(i)=='.' || this.cadena.charAt(i)==',') 
						&& Character.isDigit(this.cadena.charAt(i+1))) {
					res=true;
					cont++;
				}
			}
			
			res = res==true && cont==1? true:false;
		}
		
		return res;
	}
	
	public boolean esEntero() {
		boolean res=false;
		if(this.cadena!=null && !this.cadena.isEmpty()) {
			int punto=0;
			for(int i=0; i<this.cadena.length() && punto==0; i++) {
				if(this.cadena.charAt(i)=='.' || this.cadena.charAt(i)==',' || Character.isAlphabetic(this.cadena.charAt(i))) {
					punto++;
				}
			}
			res= punto==0?true:false;
		}
		return res;
	}
	
	
	
}
