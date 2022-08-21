class StringCalculator {

    public static boolean isSpecialCharacter(char s) {
        if (!Character.isDigit(s) && !Character.isLetter(s) && !Character.isWhitespace(s)) {
            return true;
        }
        return false;
    }

    public int add(String str) {
        String delimiter = ",";
        if (str.equals("")) {
            return 0;
        }
        if (str.startsWith("//") && isSpecialCharacter(str.charAt(2)) && str.contains("\n")) {
            delimiter = String.valueOf(str.charAt(2));
            str = str.substring(4);
        }
        if (str.contains(delimiter)) {
            int sum = 0;
            String negNums = "";
            String[] splittedStr = str.split(delimiter);

            for (String currEl : splittedStr) {
                String[] currElArr;
                // convert currEl to array
                if (currEl.contains("\n")) {
                    currElArr = currEl.split("\n");
                } else {
                    currElArr = new String[1];
                    currElArr[0] = currEl;
                }
                // iterate each element of that array
                for (String el : currElArr) {
                    if (el.matches("[a-z]")) {
                        sum += el.codePointAt(0) - 96;
                    } else {
                        int parsedNo = Integer.parseInt(el);
                        // skip the iteration if number is greater than 1000
                        if (parsedNo > 1000) {
                            continue;
                        }
                        // add element to list of negative Number
                        if (parsedNo < 0) {
                            negNums += " " + String.valueOf(parsedNo);
                        } else {
                            sum += parsedNo;
                        }
                    }
                }
            }
            // Throws exception if there exists any negative number
            if (negNums.length() != 0) {
                throw new RuntimeException("Negatives not allowed :" + negNums);
            }
            return sum;
        }
        return Integer.parseInt(str);
    }
}