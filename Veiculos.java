package AULA0810.L3Ex3;

public class Veiculos {
    private String marca;
    private String modelo;

    public Veiculos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("O veículo genérico está acelerando.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
}
