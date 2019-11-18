package It3.Dominio;

public class Lista {
	private Object[] _piezas;
	private Object _precioTotal;
	public ControlListaPiezas _unnamed_ControlListaPiezas_;

	public void getPiezas() {
		return this._piezas;
	}

	public void setPiezas(Object[] aPiezas) {
		this._piezas = aPiezas;
	}

	public void getPrecioTotal() {
		return this._precioTotal;
	}

	public void setPrecioTotal(Object aPrecioTotal) {
		this._precioTotal = aPrecioTotal;
	}
}