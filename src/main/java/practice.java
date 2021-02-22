
    import java.lang.Character;

    public class practice {

        public String toJadenCase(String phrase) {
            if(phrase == null || phrase.equals("")) return null;

            char[] array = phrase.toCharArray();

            for(int x = 0; x < array.length; x++) {
                if(x == 0 || array[x-1] == ' ') {
                    array[x] = Character.toUpperCase(array[x]);
                }
            }

            return new String(array);
        }



            public static int squareSum(int[] numbers) {
                int sum = 0;
                for (int n : numbers) {
                    sum += n * n;
                }

                return sum;
            }



        public static void main(String[] args) {

        }
    }

