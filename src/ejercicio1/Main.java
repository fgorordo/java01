package ejercicio1;

public class Main {
    public static void main(String[] args) {
        TypesPrinter printer = new TypesPrinter();
        printer.setCaracter('a');
        printer.setNumero(1);
        printer.setNumeroD(1.5D);
        printer.setNumeroL(300L);
        printer.setNumeroF(3.14F);
        printer.setNullInteger(null);
        printer.setTexto("Hello world");
        printer.setLogic(true);

        printer.printTypes();

    }
}

class TypesPrinter {
    String texto;
    int numero;
    short numeroS;
    long numeroL;
    double numeroD;
    float numeroF;
    char caracter;
    byte byteType;
    Integer nullInteger;

    public boolean isLogic() {
        return logic;
    }

    public void setLogic(boolean logic) {
        this.logic = logic;
    }

    boolean logic;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public short getNumeroS() {
        return numeroS;
    }

    public void setNumeroS(short numeroS) {
        this.numeroS = numeroS;
    }

    public long getNumeroL() {
        return numeroL;
    }

    public void setNumeroL(long numeroL) {
        this.numeroL = numeroL;
    }

    public double getNumeroD() {
        return numeroD;
    }

    public void setNumeroD(double numeroD) {
        this.numeroD = numeroD;
    }

    public float getNumeroF() {
        return numeroF;
    }

    public void setNumeroF(float numeroF) {
        this.numeroF = numeroF;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public byte getByteType() {
        return byteType;
    }

    public void setByteType(byte byteType) {
        this.byteType = byteType;
    }

    public Integer getNullInteger() {
        return nullInteger;
    }

    public void setNullInteger(Integer nullInteger) {
        this.nullInteger = nullInteger;
    }

    public void printTypes () {
        System.out.println(this.getTexto());
        System.out.println(this.getNumero());
        System.out.println(this.getNumeroS());
        System.out.println(this.getNumeroL());
        System.out.println(this.getNumeroD());
        System.out.println(this.getNumeroF());
        System.out.println(this.getCaracter());
        System.out.println(this.getByteType());
        System.out.println(this.isLogic());
        System.out.println(this.getNullInteger());
    }
}
