public class Main {

    public void main(String[] args) {
        // construir balao
        Balao b1 = new Balao();
        //acionar voo do balao
        //chamada do metodo voar()
        String resposta = b1.voar(new Combustivel());
        //apresentacao de retorno
        System.out.println(resposta);
    }

}
