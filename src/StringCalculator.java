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
                    int parsedNo = Integer.parseInt(currEl);
                    if (parsedNo < 0) {
                        throw new RuntimeException("Negatives not allowed : " + currEl);
                    } else {
                        sum += parsedNo;
                    }
                }
            }
            return sum;
        }
        return Integer.parseInt(str);
    }
}