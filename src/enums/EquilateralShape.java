package enums;

public enum EquilateralShape {

    SQUARE {

        @Override
        public void drawShape(int len) {
            System.out.println(getShape(len));
        }

        @Override
        public String getShape(int len) {
            StringBuilder shape = new StringBuilder();

            shape.append(" ").append("-".repeat(len)).append("\n");

            for (int i = 0; i < len; i++) {
                shape.append("|")
                        .append(" ".repeat(len))
                        .append("|\n");
            }

            shape.append(" ").append("-".repeat(len)).append("\n");

            return shape.toString();
        }
    },

    EQUILATERALTRIANGLE {

        @Override
        public void drawShape(int len) {
            System.out.println(getShape(len));
        }

        @Override
        public String getShape(int len) {
            StringBuilder shape = new StringBuilder();

            for (int i = 0; i < len; i++) {
                shape.append(" ".repeat(len - i))
                        .append("/");

                shape.append(" ".repeat(i * 2))
                        .append("\\")
                        .append("\n");
            }

            shape.append(" ")
                    .append("-".repeat(len * 2))
                    .append("\n");

            return shape.toString();
        }
    };


    public abstract String getShape(int len);
    public abstract void drawShape(int len);
}
