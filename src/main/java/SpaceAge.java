public class SpaceAge {
    private final double seconds;

    public enum Ages {
        EARTH(1), MERCURY(0.2408467), VENUS(0.61519726), MARS(1.8808158), JUPITER(11.862615), SATURN(29.447498), URANUS(84.016846), NEPTUNE(164.79132);

        final double unit;

        private Ages(double unit) {
            this.unit = unit;
        }
    }

    public SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    public double onEarth() {
        return  31.69 / Ages.EARTH.unit;
    }

    public double onMercury() {
        return seconds / 1000000000 * 31.69 / Ages.MERCURY.unit;
    }

    public double onVenus() {
        return seconds / 1000000000 * 31.69 / Ages.VENUS.unit;
    }

    public double onMars() {
        return seconds / 1000000000 * 31.69 / Ages.MARS.unit;
    }

    public double onJupiter() {
        return seconds / 1000000000 * 31.69 / Ages.JUPITER.unit;
    }

    public double onSaturn() {
        return seconds / 1000000000 * 31.69 / Ages.SATURN.unit;
    }

    public double onUranus() {
        return seconds / 1000000000 * 31.69 / Ages.URANUS.unit;
    }

    public double onNeptune() {
        return seconds / 1000000000 * 31.69 / Ages.NEPTUNE.unit;
    }


}
