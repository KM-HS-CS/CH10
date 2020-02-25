
public interface Sequence {
	int next();
	
	static Sequence multiplesOf(int n) {
		class MultiplesSequence implements Sequence {
			private int n;
			private int init;
		public int next() {
			n += init;
			return n;
			}
		}
		MultiplesSequence fina = new MultiplesSequence();
		fina.init = n;
		fina.n = n;
		return fina;
	}
	static Sequence powersOf(int n) {
		class SquareSequence implements Sequence {
			private int n;
			private int init;
		public int next() {
			n *= init;
			return n;
			}
		}
		SquareSequence fina = new SquareSequence();
		fina.init = n;
		fina.n = n;
		return fina;
	}
	
}
