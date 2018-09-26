package circulo;

public class Circulo{
	private Punto centro;
	private int radio;

	public Circulo(){ 
		centro = new Punto();
		radio = 1;
	}

	public Circulo(int r){
		centro = new Punto();
		if (compruebaRadioValido(r)){
			radio = r;
		}
		else radio = 1;
	}

	public Circulo(Punto p, int r){
		centro = p;
		if (compruebaRadioValido(r)){
			radio = r;
		}
		else radio = 1;
	}

	public Circulo(Circulo c){
		centro = new Punto(c.getCentro());
		radio = c.getRadio();
	}

	public Punto getCentro(){
		return centro;
	}

	public int getRadio() {
		return radio;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public void setRadio(int radio){
		if (compruebaRadioValido(radio)){
			this.radio = radio;
		}
	}

	public void mover(Punto p){
		setCentro(p);
	}

	public void cambiarTamaño(int r){
		setRadio(r);
	}

	public void desplazar(int a, int b){
		getCentro().setX(getCentro().getX() + a);
		getCentro().setY(getCentro().getY() + b);
	}

	//Privado porque nadie se tiene que enterar
	private boolean compruebaRadioValido(int r){
		return (r > 0);
	}

	public boolean sonIguales(Circulo c){
		return ((getRadio() == c.getRadio()) &&
			(getCentro().sonIguales(c.getCentro())));
	}
}