package ejercicio8propuesto;

public class ejercicio8p {
	
	public void decimalToRomano(int decimal){
		if(decimal>=4000){
			System.out.println("Error valor introducido mayor de 3999.");
		}else{
		if(decimal>=3000){
			for(int q=0;q<=2;q++){
				System.out.print("M");
			}
		}
		if((decimal>=2000)&&(decimal<3000)){
			for(int w=0;w<=1;w++){
				System.out.print("M");
			}
		}
		if((decimal>=1000)&&(decimal<2000))
			System.out.print("M");
		
		decimal=decimal%1000;
		if((decimal>=900)&&(decimal<1000))
			System.out.print("CM");
		
		if((decimal>=800)&&(decimal<900)){
			System.out.print("D");
			for(int e=0;e<=2;e++){
				System.out.print("C");
			}
		}
		if((decimal>=700)&&(decimal<800)){
			System.out.print("D");
			for(int r=0;r<=1;r++){
				System.out.print("C");
			}
		}
		if((decimal>=600)&&(decimal<700))
			System.out.print("DC");
		
		if((decimal>=500)&&(decimal<600))
			System.out.print("D");
		
		if((decimal>=400)&&(decimal<500))
			System.out.print("CD");
		
		if((decimal>=300)&&(decimal<400)){
			for(int t=0;t<=2;t++){
				System.out.print("C");
			}
		}
		if((decimal>=200)&&(decimal<300)){
			for(int y=0;y<=1;y++){
				System.out.print("C");
			}
		}
		if((decimal>=100)&&(decimal<200))
			System.out.print("C");
		
		decimal=decimal%100;
		if((decimal>=90)&&(decimal<100))
			System.out.print("XC");
		
		if((decimal>=80)&&(decimal<90)){
			System.out.print("L");
			for(int u=0;u<=2;u++){
				System.out.print("X");
			}
		}
		if((decimal>=70)&&(decimal<80)){
			System.out.print("L");
			for(int i=0;i<=1;i++){
				System.out.print("X");
			}
		}
		if((decimal>=60)&&(decimal<70))
			System.out.print("LX");
		
		if((decimal>=50)&&(decimal<60))
			System.out.print("L");
		
		if((decimal>=40)&&(decimal<50))
			System.out.print("XL");
		
		if((decimal>=30)&&(decimal<40)){
			for(int p=0;p<=2;p++){
				System.out.print("X");
			}
		}
		if((decimal>=20)&&(decimal<30)){
			for(int a=0;a<=1;a++){
				System.out.print("X");
			}
		}
		if((decimal>=10)&&(decimal<20))
			System.out.print("X");
		
		decimal=decimal%10;
		if(decimal==9)
			System.out.print("IX");
		
		if(decimal==8){
			System.out.print("V");
			for(int s=0;s<=2;s++){
				System.out.print("I");
			}
		}
		if(decimal==7){
			System.out.print("V");
			for(int d=0;d<=1;d++){
				System.out.print("I");
			}
		}
		if(decimal==6)
			System.out.print("VI");
		
		if(decimal==5)
			System.out.print("V");
		
		if(decimal==4)
			System.out.print("IV");
		
		if(decimal==3){
			for(int f=0;f<=2;f++){
				System.out.print("I");
			}
		}
		if(decimal==2){
			for(int g=0;g<=1;g++){
				System.out.print("I");
			}
		}
		if(decimal==1)
			System.out.print("I");
		
		System.out.println();
		}
	}
}