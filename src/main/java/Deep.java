public class Deep {

    public static void main(String[] args) {
        
        
        String assassins = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String code = "Si Cupdmzaplil Uikpwuis Icbwuwti lm Tmfpkw oi lmamtxmvilw cu xixms xzwbiñwupkw mu si opabwzpi g mu si nwztikpwu lm ucmabzw xipa. Sia bizmia acabiubpdia lm mabi puabpbckpwu xcjspki, icbwuwti g sipki awu si lwkmukpi, si pudmabpñikpwu g si lpncapwu lm si kcsbczi.\r\n"
				+ "Mu ms tculw ikilmtpkw ma zmkwuwkpli kwtw cui cupdmzaplil lm mfkmsmukpi. Si CUIT zmaxwulm is xzmamubm g tpzi ms ncbczw kwtw ms xzwgmkbw kcsbczis tia ptxwzbiubm lm Tmfpkw.\r\n"
				+ "Si CUIT ma cu maxikpw lm spjmzbilma. Mu mssi am xzikbpki kwbplpiuitmubm ms zmaxmbw, si bwsmziukpi g ms lpiswñw. Si xsczisplil lm plmia g lm xmuaitpmubw ma ixzmkpili kwtw apñuw lm ac zpycmhi g ucuki kwtw nikbwz lm lmjpsplil.";
		String maserati = "";
		
		code = code.toUpperCase();
		char letra;	
		for (int Keyword = 1 ; Keyword <= 27; Keyword++) {
		for (int i = 0; i < code.length(); i++) {
			letra = code.charAt(i);
			int lug = assassins.indexOf(letra);
		
		if(lug == -1) {
			 maserati+= letra;
		}else {
			if((lug + Keyword) >= 27) {
				maserati += assassins.charAt((lug + Keyword) - 27);
			}else {
				maserati += assassins.charAt(lug + Keyword);
			}	
		}
		}
		System.out.println("Descifrado recorrido " + Keyword + " Veces da como resultado: " + maserati);
		System.out.println("\r\n");
		maserati = "";
		}
    }
    
}
