import javax.lang.model.element.Element;

class StringCalculator {

    public int add(String str) {
        if (str.equals("")) {
            return 0;
        }
        if (str.contains(",")) {
            String[] splittedStr = str.split(",");
            int sum = 0;
            for (String currEl : splittedStr) {
                sum += Integer.parseInt(currEl);
            }
            return sum;
        }
        return Integer.parseInt(str);
    }
}