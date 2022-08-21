class StringCalculator {

    public int add(String str) {
        if (str.equals("")) {
            return 0;
        }
        if (str.contains(",")) {
            int sum = 0;
            String negNums = "";
            String[] splittedStr = str.split(",");

            for (String currEl : splittedStr) {
                if (currEl.matches("[a-z]")) {
                    sum += currEl.codePointAt(0) - 96;
                } else {
                    int parsedNo = Integer.parseInt(currEl);
                    if (parsedNo < 0) {
                        negNums += " " + String.valueOf(parsedNo);
                    } else {
                        sum += parsedNo;
                    }
                }
            }
            if (negNums.length() != 0) {
                throw new RuntimeException("Negatives not allowed :" + negNums);
            }
            return sum;
        }
        return Integer.parseInt(str);
    }
}