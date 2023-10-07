package homework5;

public class forthTask {
        public static void main(String[] args) {

            int numValues = 37;
            double[] sinValues = new double[numValues];

            for (int i = 0; i < numValues; i++) {
                int degrees = i * 10;
                sinValues[i] = Math.sin(degrees);
            }

            for (int i = 0; i < numValues; i++) {
                int degrees = i * 10;
                System.out.println(degrees + " градусів = " + sinValues[i]);
            }
        }
    }

