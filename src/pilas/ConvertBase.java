
package pilas;

public class ConvertBase {

    public String toBinary(int n) {
        LinkedStack bin = new LinkedStack();
        String binary = "\033[031mNúmero en binaria: \033[030m";

        while (n > 0) {
            bin.push(n % 2);
            n /= 2;

        }
        while (!bin.empty()) {
            try {
                binary += bin.pop();
            } catch (Exception e) {
                binary = "Error";
            }
        }
        return binary;
    }

    public String toOctal(int n) {
        LinkedStack oc = new LinkedStack();
        String octal = "\033[031mNúmero en octal: \033[030m";

        while (n > 0) {
            oc.push(n % 8);
            n /= 8;

        }
        while (!oc.empty()) {
            try {
                octal += oc.pop();
            } catch (Exception e) {
                octal = "Error interno";
            }
        }
        return octal;
    }

    public String toHexadecimal(long n) {
        int operacion = 0;
        LinkedStack hex = new LinkedStack();
        String hexadecimal = "\033[031mNúmero en hexadecimal: \033[030m";
        while (n > 0) {
            operacion = (int) (n % 16);
            switch (operacion) {
                case 10:
                    hex.push('A');
                    break;
                case 11:
                    hex.push('B');
                    break;
                case 12:
                    hex.push('C');
                    break;
                case 13:
                    hex.push('D');
                    break;
                case 14:
                    hex.push('E');
                    break;
                case 15:
                    hex.push('F');
                    break;
                default:
                    hex.push(n % 16);
                    break;
            }
            n /= 16;
        }
        while (!hex.empty()) {
            try {
                hexadecimal += hex.pop();
            } catch (Exception e) {
                hexadecimal = "Error interno";
            }
        }
        return hexadecimal;
    }

    public String toDecimal(int n) {
        String decimal = "\033[031mNúmero en decimal: \033[030m";
        decimal += n;
        return decimal;
    }

    public String toBase(String base, int n) throws Exception {
        String converted = "";
        if (null == base) {
            throw new Exception("\033[031mError: \033[030mIngrese una base válida por favor (2, 8, 16)");
        } else switch (base) {
            case "10":
                converted = toDecimal(n);
                break;
            case "2":
                converted = toBinary(n);
                break;
            case "8":
                converted = toOctal(n);
                break;
            case "16":
                converted = toHexadecimal(n);
                break;
            default:
                throw new Exception("\033[031mError: \033[030mIngrese una base válida por favor (2, 8, 16)");
        }
        return converted;
    }

}
