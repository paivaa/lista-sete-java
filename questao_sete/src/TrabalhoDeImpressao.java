class TrabalhoDeImpressao {
    private String nomeDoDocumento;
    private int numeroDePaginas;

    public TrabalhoDeImpressao(String nomeDoDocumento, int numeroDePaginas) {
        this.nomeDoDocumento = nomeDoDocumento;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getNomeDoDocumento() {
        return nomeDoDocumento;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Documento: " + nomeDoDocumento + " | Páginas: " + numeroDePaginas;
    }
}