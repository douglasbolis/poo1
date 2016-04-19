package entidades;

public class Teatro extends Local {
		private static int numCadeirasCamarote;
		private static int numCadeirasEspeciais;
		private static int numCadeirasSimples;

		public Teatro(int simples, int especiais, int camarote) {
				numCadeirasSimples = simples;
				numCadeirasEspeciais = especiais;
				numCadeirasCamarote = camarote;
		}

		public int getNumCadeirasCamarote() {
			return this.numCadeirasCamarote;
		}

		public int getNumCadeirasEspeciais() {
				return numCadeirasEspeciais;
		}

		public int getNumCadeirasSimples() {
				return numCadeirasSimples;
		}

		public int getCapacidadeTotal() {
			return numCadeirasSimples+numCadeirasEspeciais+numCadeirasCamarote;
		}

}
