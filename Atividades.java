import java.lang.Math;
public class Atividades {

	public static void main(String[] args) {
		
		System.out.println("raiz de 64: "+Math.pow(64, 0.5));
		
		System.out.println("raiz com exp e log e realint: "+(int)Math.pow(64,0.5));
		
		System.out.println("raiz com exp e log sem realint: "+Math.pow(64,0.5));
		
		System.out.println("formatar "+Math.sin(45*3.14/180));
		
		System.out.println("potencia com operador ** e formatar: "+Math.pow(8,3.3));
		
		System.out.println("raiz cubica: "+Math.pow(8,0.3333));
		
		System.out.println("absoluto "+Math.abs(-8));
		
		System.out.println("absoluto "+Math.abs(8));
		
		System.out.println("convertendo para real: "+(double)87);
		
		System.out.println("convertendo para inteiro 5.5: "+(int)5.5);
		
		System.out.println("convertendo para inteiro 6.5: "+(int)6.5);
		
		System.out.println("convertendo para inteiro 6.5+0.0001: "+(int)6.5+0.0001);
		
		System.out.println("convertendo para inteiro 5.45: "+(int)5.45);
		
		System.out.println("convertendo para inteiro 5.51: "+(int)5.51);
		
		System.out.println("convertendo para inteiro:"+(int)3/4);
	}
}
/*
prog teste

imprima "raiz: ",raiz(64);
 
imprima "\nraiz com exp e log e realint:,rea1int(exp(1/2*1og(64))) ;

imprima "\nraiz com exp e log sem realint: h',exp(1/2*log(64)) ;

imprima "\n", formatar(sen(45*pi/180)+0.0001,3);

imprima "\npotencia com exp e log e formatar: ",formatar(exp(3*log(8))+0.001,3);

imprima "\npotencia com exp e log sem formatar: ,exp(3*1og(8)) ;

imprima "\npotencia com operador ** e formatar: uu,formatar(8**3,3) ;

imprima "\nraiz cubica: ",exp(1/3*log(8)) ;

imprima "\nabsoluto: ",abs(-8);

imprima "\nabsoluto: ",abs(8);

imprima "\nconvertendo para inteiro 5.5: ",realint(5.5);

imprima "\nconvertendo para inteiro 6.5: ",realint(6.5);

imprima "\nconvertendo para inteiro 6.5 + 0.0001: ",realint(6.5+0.0001);

imprima "\nconvertendo para inteiro 5.45: ",realint(5.45);

imprima "\nconvertendo para inteiro 5.51: ",realint(5.51);

imprima "\nconvertendo para real 87: ",intreal(87);

imprima "\nconvertendo para int 3/4: ",realint(314),"\n";

fimprog 
*/