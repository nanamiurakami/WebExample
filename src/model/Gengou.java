package model;

public class Gengou {
	public int gengou;
	public int nen;

	public Gengou(int gengou, int nen) {
		this.gengou = gengou;
		this.nen = nen;
	}

	public int getGengou() {
		return gengou;
	}

	public void setGengou(int gengou) {
		this.gengou = gengou;
	}

	public int getNen() {
		return nen;
	}

	public void setNen(int nen) {
		this.nen = nen;
	}

	public int getSeireki() {
		if ( gengou ==3) {
			return 2018+nen;
		}
		if ( gengou ==2) {
			return 1988+nen;
		}
		if ( gengou ==1) {
			return 1925+nen;
		}
		return 0;

	}

	public  String getName() {
		if (gengou==1) {
			return "昭和";
		}else if (gengou==2) {
			return"平成";
		}else if (gengou==3) {
			return"令和";
		}else {
			return"エラー";
		}
	}
}
