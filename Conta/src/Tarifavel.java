public interface Tarifavel {

    /**
     * Javadoc
     * @param tarifa Valor da tarifa.
     */
    void setTarifa(double tarifa);

    /**
     * javadoc
     * @throws ContaException 
     */
    void cobrarTarifa() throws ContaException;
}
