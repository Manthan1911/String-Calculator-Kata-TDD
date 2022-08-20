class StringCalculator {

    public int add(String str) {
        if (str.equals("")) {
            return 0;
        }
        if (str.contains(",")) {
            int sum = 0;
            String[] splittedStr = str.split(",");

            for (String currEl : splittedStr) {
                if (currEl.matches("[a-z]")) {
                    sum += currEl.codePointAt(0) - 96;
                } else {
                    sum += Integer.parseInt(currEl);
                }
            }
            return sum;
        }
        return Integer.parseInt(str);
    }
}