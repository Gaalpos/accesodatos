// default package
// Generated 27 feb 2024 12:37:41 by Hibernate Tools 6.3.1.Final

/**
 * ProductosId generated by hbm2java
 */
public class ProductosId implements java.io.Serializable {

	private String idFabricante;
	private String idProducto;

	public ProductosId() {
	}

	public ProductosId(String idFabricante, String idProducto) {
		this.idFabricante = idFabricante;
		this.idProducto = idProducto;
	}

	public String getIdFabricante() {
		return this.idFabricante;
	}

	public void setIdFabricante(String idFabricante) {
		this.idFabricante = idFabricante;
	}

	public String getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProductosId))
			return false;
		ProductosId castOther = (ProductosId) other;

		return ((this.getIdFabricante() == castOther.getIdFabricante()) || (this.getIdFabricante() != null
				&& castOther.getIdFabricante() != null && this.getIdFabricante().equals(castOther.getIdFabricante())))
				&& ((this.getIdProducto() == castOther.getIdProducto())
						|| (this.getIdProducto() != null && castOther.getIdProducto() != null
								&& this.getIdProducto().equals(castOther.getIdProducto())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdFabricante() == null ? 0 : this.getIdFabricante().hashCode());
		result = 37 * result + (getIdProducto() == null ? 0 : this.getIdProducto().hashCode());
		return result;
	}

}