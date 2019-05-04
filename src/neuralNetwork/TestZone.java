package neuralNetwork;

public class TestZone {

	public static void main(String[] args) {
		TestCase c1 = new TestCase(new double[][] {{1,1,1,1,1}, 
												   {1,0,0,0,1}, 
												   {1,0,0,0,1}, 
												   {1,0,0,0,1},
												   {1,1,1,1,1}}, new double[] {1.0, 0.0});		
		Network X0 = new Network(25, 2);
		X0.train(c1);
	}
}