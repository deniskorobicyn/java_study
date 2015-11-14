package condition.statment.mrspoy.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import utils.mrspoy.com.Pair;

final class Weight {
	class Planets {
		public static Planets getInstance() {
			if (instance == null)
				instance = new Planets();
			return instance;
		}

		private List<Pair<Double, String>> m_planets;

		private Planets(){
			BufferedReader br = new BufferedReader(new FileReader("planets.txt"));
			m_planets = new ArrayList<Pair<Double, String> >();

			for (String s = br.readLine(); s != null; s = br.readLine()){
				String[] config = s.split(" ");

				m_planets.add(new Pair<Double, String>(Double.parseDouble(config[0]), config[1]));
			}
			br.close();
		}

		public Double getGForPlanet(int id){
			return m_planets.get(id).getFirst();
		}

		public String getPlanetName(int id){
			return m_planets.get(id).getSecond();
		}
	}

	private double m_weight;
	Weight(double w){
		m_weight = w;
	}

	double getWeightOnPlanet(int id) {
		return m_weight * Planets.getInstance().getGForPlanet(id);
	}
}
