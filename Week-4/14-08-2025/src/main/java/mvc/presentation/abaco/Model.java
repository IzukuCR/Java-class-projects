package mvc.presentation.abaco;

import mvc.presentation.AbstractModel;

import java.beans.PropertyChangeListener;

public class Model extends AbstractModel {
    int valor;
    int anterior;

    public static final String VALOR = "valor";

    public Model() {
        valor=0;
        anterior=0;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        super.addPropertyChangeListener(listener);
        firePropertyChange(VALOR);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valorP) {
        this.anterior=valor;
        this.valor = valorP;
        firePropertyChange(VALOR);
    }

    public int getAnterior() {
        return anterior;
    }
}
