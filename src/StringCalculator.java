class StringCalculator {

    public int add(String str) {
        if (str.equals("")) {
            return 0;
        }
        if (str.length() > 0) {
            return Integer.parseInt(str);
        }
        return 1;
    }

}