package progAssign;

public class TestProg {
	
	protected double balance;
	protected String sd;
	protected String sw;
	
	public TestProg () {
		
		balance = 0.0;	
	}
	
	
	public boolean setDeposit(String sd) {
		
		this.sd=sd;
		boolean boolValue =false;
		
		char dep [] = new char [sd.length()];
		
		dep = sd.toCharArray();
						
		int countLetter=0;
		int countDash=0;
		int countDots=0;
		int countDigit=0;
		
		for (int i=0; i<dep.length; i++) {
			
			if((Character.isLetter(dep[i])==true) ) {countLetter++;}
			if(dep[i] == '-') { countDash++;}
			if(dep[i] == '.') {countDots++;}
			if((Character.isDigit(dep[i])==true)) {countDigit++;}

		}
		
		if (countDash>0) {boolValue = false;}
		
		else if (countDots > 1 || countDots==0) {boolValue = false;}

		
		else if (countLetter > 1) {boolValue = false;}

		else if (countDots==1 && countDigit>=0) {
			
			if (sd.substring(sd.indexOf('.')+1).length() > 2) {boolValue=false;}
			
			else if (sd.substring(0, sd.indexOf('.')+1).length() == 1) {boolValue=false;}
			
			else if (sd.substring(sd.indexOf('.')).length() == 1) {boolValue=false;}
			
			else {
				balance = balance + Double.parseDouble(sd);
				
				boolValue = true; 
			}
			
		}
				
		return boolValue;
		
	}
	
	public boolean setWithdraw (String sw) {
		
		this.sw = sw;
		boolean boolValue =false;
		
		char withd [] = new char [sw.length()];
		
		withd = sw.toCharArray();
						
		int countLetter=0;
		int countDash=0;
		int countDots=0;
		int countDigit=0;
		
		for (int i=0; i<withd.length; i++) {
			
			if((Character.isLetter(withd[i])==true) ) {countLetter++;}
			if(withd[i] == '-') { countDash++;}
			if(withd[i] == '.') {countDots++;}
			if((Character.isDigit(withd[i])==true)) {countDigit++;}

		}
		
		if (countDash>0) {boolValue = false;}
		
		else if (countDots > 1 || countDots==0) {boolValue = false;}

		
		else if (countLetter > 1) {boolValue = false;}

		else if (countDots==1 && countDigit>=0) {
			
			if (sw.substring(sw.indexOf('.')+1).length() > 2) {boolValue=false;}
			
			else if (sw.substring(0, sw.indexOf('.')+1).length() == 1) {boolValue=false;}
			
			else if (sw.substring(sw.indexOf('.')).length() == 1) {boolValue=false;}
			
			else {
				balance = balance - Double.parseDouble(sw);
				
				boolValue = true; 
			}
			
		}
				
		return boolValue;		
		
		
	}
	
	public double getBalance () {
		
		return balance;
	}

}
