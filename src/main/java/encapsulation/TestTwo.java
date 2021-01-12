package encapsulation;

public class TestTwo {
    public static class TestEncapsulation
    {
        public static void main (String[] args) {
            TestEncapsulation obj = new TestEncapsulation();

            obj.setName("Harsh");
            obj.setAge(19);
            obj.setRoll(51);

            System.out.println("name: " + obj.getName());

            System.out.println("age: " + obj.getAge());
            System.out.println("roll: " + obj.getRoll());
           }

      private int getRoll() {
            return 51;
        }

        private int getAge() {
            return 19;
        }

        private String getName() {
            String harsh = " harsh";
            return harsh;
        }

        private void setRoll(int i) {
        }

        private void setAge(int i) {
        }

        private void setName(String harsh) {
        }
    }
}
