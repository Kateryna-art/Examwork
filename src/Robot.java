import java.util.Random;

public class Robot {
        public String robotName;
        private double health=100;
        String alphabet = "QWEASDZXCL";
        String damageKeys ="";

        public Robot(String robotName) {
            for (int i = 0; i < 5; i++) {
                damageKeys = damageKeys + getRandomKey();
            }
        }

        public double getHealth(){ return health;}

        public void setHealth(double v) {this.health=health;}

        public String getRobotName() {return robotName;}

        char getRandomKey() {
            int randIdx = new Random().nextInt(alphabet.length());
            char randChar = alphabet.charAt(randIdx);
            alphabet = alphabet.replace(String.valueOf(randChar), "");
            return randChar;

        }

}

