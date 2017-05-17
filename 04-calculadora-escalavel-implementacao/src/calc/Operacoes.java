package calc;

public enum Operacoes {

    SOM ("Soma",            (n1, n2) -> n1 + n2),
    SUB ("Subtração",       (n1, n2) -> n1 - n2),
    MUL ("Multiplicação",   (n1, n2) -> n1 * n2),
    DIV ("Divisão",         (n1, n2) -> n1 / n2),
    POT ("Potenciação",     (n1, n2) -> Math.pow(n1, n2)),
    ;

    private String nome;
    private final Calculo calculo;

    Operacoes(String nome, Calculo calculo) {
        this.nome = nome;
        this.calculo = calculo;
    }

    public double calcula(double n1, double n2) {
        return calculo.operacao(n1, n2);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return name() + " => " + nome;
    }

}
