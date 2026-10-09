static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    // 1. Інформація про примітивні типи
    System.out.println("=== ПРИМІТИВНІ ТИПИ ДАНИХ ===");

    System.out.println("byte: " + Byte.SIZE + " біт, "
            + Byte.MIN_VALUE + " ... " + Byte.MAX_VALUE);

    System.out.println("short: " + Short.SIZE + " біт, "
            + Short.MIN_VALUE + " ... " + Short.MAX_VALUE);

    System.out.println("int: " + Integer.SIZE + " біт, "
            + Integer.MIN_VALUE + " ... " + Integer.MAX_VALUE);

    System.out.println("long: " + Long.SIZE + " біт, "
            + Long.MIN_VALUE + " ... " + Long.MAX_VALUE);

    System.out.println("float: " + Float.SIZE + " біт, "
            + (-Float.MAX_VALUE) + " ... " + Float.MAX_VALUE);
    System.out.println("  Найменше додатне значення: "
            + Float.MIN_VALUE);

    System.out.println("double: " + Double.SIZE + " біт, "
            + (-Double.MAX_VALUE) + " ... " + Double.MAX_VALUE);
    System.out.println("  Найменше додатне значення: "
            + Double.MIN_VALUE);

    System.out.println("char: " + Character.SIZE + " біт, "
            + (int) Character.MIN_VALUE + " ... "
            + (int) Character.MAX_VALUE);

    System.out.println("boolean: true або false; "
            + "розмір не визначений мовою Java.");

    // 2. Введення значень
    System.out.println("\n=== ВВЕДЕННЯ ДАНИХ ===");

    Byte b = readByte();
    Short s = readShort();
    Integer i = readInteger();
    Long l = readLong();
    Float f = readFloat();
    Double d = readDouble();
    Character c = readChar();
    Boolean bool = readBoolean();

    // 3. Виведення результатів
    System.out.println("\n=== ВВЕДЕНІ ЗНАЧЕННЯ ===");
    System.out.println("Byte: " + b);
    System.out.println("Short: " + s);
    System.out.println("Integer: " + i);
    System.out.println("Long: " + l);
    System.out.println("Float: " + f);
    System.out.println("Double: " + d);
    System.out.println("Character: " + c);
    System.out.println("Boolean: " + bool);

    scanner.close();
}

static Byte readByte() {
    while (true) {
        try {
            System.out.print("Введіть byte: ");
            return Byte.parseByte(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Помилка! Введіть ціле число від -128 до 127.");
        }
    }
}

static Short readShort() {
    while (true) {
        try {
            System.out.print("Введіть short: ");
            return Short.parseShort(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Помилка! Введіть коректне число типу short.");
        }
    }
}

static Integer readInteger() {
    while (true) {
        try {
            System.out.print("Введіть int: ");
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Помилка! Введіть коректне ціле число int.");
        }
    }
}

static Long readLong() {
    while (true) {
        try {
            System.out.print("Введіть long: ");
            return Long.parseLong(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Помилка! Введіть коректне ціле число long.");
        }
    }
}

static Float readFloat() {
    while (true) {
        try {
            System.out.print("Введіть float: ");
            String input = scanner.nextLine().trim().replace(',', '.');
            Float value = Float.valueOf(input);

            if (Float.isInfinite(value) || Float.isNaN(value)) {
                throw new NumberFormatException();
            }
            return value;
        } catch (NumberFormatException e) {
            System.out.println("Помилка! Введіть коректне число float.");
        }
    }
}

static Double readDouble() {
    while (true) {
        try {
            System.out.print("Введіть double: ");
            String input = scanner.nextLine().trim().replace(',', '.');Double value = Double.valueOf(input);

            if (Double.isInfinite(value) || Double.isNaN(value)) {
                throw new NumberFormatException();
            }
            return value;
        } catch (NumberFormatException e) {
            System.out.println("Помилка! Введіть коректне число double.");
        }
    }
}

static Character readChar() {
    while (true) {
        System.out.print("Введіть один символ char: ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            return Character.valueOf(input.charAt(0));
        }

        System.out.println("Помилка! Потрібно ввести рівно один символ.");
    }
}

static Boolean readBoolean() {
    while (true) {
        System.out.print("Введіть boolean (true або false): ");
        String input = scanner.nextLine().trim();

        if (input.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }

        if (input.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }

        System.out.println("Помилка! Введіть true або false.");
    }
}