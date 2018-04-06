package JeuBaseTexte.padlock;

public class PadlockCode implements Padlock {

	public String code;
	

	public PadlockCode(String code){
		
		this.code = code;
	}

	public boolean unlock(Object obj){
		boolean retour=false;
		if(obj instanceof String){
			if(code.equals((String)obj)){
				retour=true;
				System.out.println("#		    || Unlocked !\n#		    ||");
			}else{
				retour=false;
				System.out.println("#		    || The code is wrong\n#		    ||");
			}
		}else{
			System.out.println("#		    || You must enter a code\n#		    ||");
		}
		return retour;
	}

	@Override
	public String toString() {
		return "code"; //To change body of generated methods, choose Tools | Templates.
	}      
}