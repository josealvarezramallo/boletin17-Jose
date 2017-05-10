
/*
 * Crea a Xeometría cos seguintes métodos:
		a. int perímetroCadrado(int lado)
		b. int areaCadrado(int lado)
		c. double teoremaPitagoras(int catetoA, int catetoB) 
 */
public class Xeometria {
	int perimetroCadrado (int lado) {
		if (lado<0) {
			return -1;
		}
		return (lado * lado);
	}
	
	int areaCadrado (int lado) {
		if (lado<0){
			return -1;
		}	
		return (lado * 4);
	}
	
	double teoremaPitagoras (int catetoA, int catetoB) {
		if (catetoA<=0 || catetoB<=0) {
			return -1;
		}
		return Math.sqrt(catetoA*catetoA)  + (catetoB * catetoB);
	}
	
	double teoremadePitagoras (double hipotenusa,double catetoA){
		if (catetoA<=0 || hipotenusa <=0) {
			return -1;
		}
		return Math.sqrt(catetoA*catetoA)  + (hipotenusa * hipotenusa);
	}
}